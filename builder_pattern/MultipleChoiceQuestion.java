import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleChoiceQuestion extends Question{
    private List<String> options = new ArrayList<String>();
    private List<String> answers = new ArrayList<String>();
    
    //Set a single answer, appends to the current answer list
    @Override
    public void setAnswer(String answers) {
        if (answers == null) throw new IllegalArgumentException("Answer cannot be null !");
        if (!options.contains(answers)) throw new IllegalArgumentException("Not a possible answer !");
        this.answers.add(answers);
    }

    //Set a list of answer from array of answer string
    public void setAnswer(String ... answers) {
        if (answers == null) throw new IllegalArgumentException("Answer cannot be null !");
        if (!options.containsAll(Arrays.asList(answers))) throw new IllegalArgumentException("Some answers not includes in options");
        this.answers = Arrays.asList(answers);
    }

    @Override
    public String getAnswer() {
        if (answers == null) return "";
        StringBuilder answerString = new StringBuilder("");
        for (String answer : answers) {
            answerString.append(answer);
            answerString.append(", ");
        }
        return answerString.substring(0, answerString.length() - 2).toString();
    }

    public List<String> getAnswers() {
        return this.answers;
    }

    @Override
    public void setOptions(String[] options) {
        if (options == null) throw new IllegalArgumentException("Options cannot be null !");
        //if (this.options.containsAll(Arrays.asList(options))) throw new IllegalArgumentException("Options are already existed !");
        this.options = Arrays.asList(options);
    }

    //Set a single option, appends to the current option list
    public void setOptions(String option) {
        if (option == null) throw new IllegalArgumentException("Option cannot be null !");
        if (options.contains(option)) throw new IllegalArgumentException("Option is already existed !");
        this.options.add(option);
    }

    @Override
    public List<String> getOptions() {
        return this.options;
    }

    @Override
    public int evaluate(Question question) {
        if (question == null) throw new IllegalArgumentException("No question to evaluate with !");
        if (!(question instanceof MultipleChoiceQuestion)) throw new IllegalArgumentException("Cannot evaluate due to different question type !");
        if (this.answers == null) return 0;
        MultipleChoiceQuestion multipleChoiceQuestion = (MultipleChoiceQuestion) question;
        List<String> evaluateAnswer = multipleChoiceQuestion.getAnswers();
        
        int correctQuestion = 0;
        for (int index = 0; index < this.answers.size(); index++) {
            if(evaluateAnswer.contains(this.answers.get(index))) correctQuestion++;
        }
        int totalMark = (int) ((float) correctQuestion / evaluateAnswer.size() * this.getWeight());
        return totalMark;
    }
}
