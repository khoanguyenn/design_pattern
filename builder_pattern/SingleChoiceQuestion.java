import java.util.Arrays;
import java.util.List;

public class SingleChoiceQuestion extends Question {
   private List<String> options;
   private String answer = "";

   @Override
   public void setAnswer(String answer) {
      if (answer == null) throw new IllegalArgumentException("Answer cannot be null !");
      if (!options.contains(answer)) throw new IllegalArgumentException("Not a possible answer !");
      this.answer = answer;
   }

   @Override
   public String getAnswer() {
      return this.answer;
   }

   @Override
   public void setOptions(String[] options) {
      if (options == null) throw new IllegalArgumentException("Options cannot be null !");
      this.options = Arrays.asList(options);
   }

   public void setOptions(List<String> options) {
      if (options == null) throw new IllegalArgumentException("Options cannot be null !");
      this.options = options;
   }

   @Override
   public List<String> getOptions() {
      return this.options;
   }

   @Override
   public int evaluate(Question question) {
      if (question == null) throw new IllegalArgumentException("No question to evaluate with !");
      if (!(question instanceof SingleChoiceQuestion)) throw new IllegalArgumentException("Cannot evaluate due to different question type !");
      if (this.answer.equals(question.getAnswer())) return this.getWeight();
      return 0;
   }
}
