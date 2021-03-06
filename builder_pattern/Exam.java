import java.util.ArrayList;
import java.util.List;

public class Exam {
    private List<Question> questionList = new ArrayList<Question>();
    public void addQuestion(Question question) {
        questionList.add(question);
    }
    public void setAnswer(int questionNumber, String answer) {
        questionList.get(questionNumber).setAnswer(answer);
    }
    public void setAnswer(int questionNumber, String ...answer) {
        questionList.get(questionNumber).setAnswer(answer);
    }
    public List<Question> getQuestionList() {
        return this.questionList;
    }
    public int evaluateExam(Exam correctExam) {
        List<Question> correctQuestions = correctExam.getQuestionList();
        int mark = 0;
        for (int qNumber = 0; qNumber < this.questionList.size(); qNumber++) {
            Question studentQuestion = this.questionList.get(qNumber);
            Question correctAnswer = correctQuestions.get(qNumber);
                mark += studentQuestion.evaluate(correctAnswer);
        }
        return mark;
    }
}
