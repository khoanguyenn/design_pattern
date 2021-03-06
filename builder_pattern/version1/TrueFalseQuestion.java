package version1;

import java.util.Arrays;
import java.util.List;

public class TrueFalseQuestion extends Question {
   private List<String> options = Arrays.asList("TRUE", "FALSE", "NONE");
   private String answer = "";

   public TrueFalseQuestion(String header, int weight) {
      super(header, weight);
   }
   
   @Override
   public void setAnswer(String answer) throws IllegalArgumentException {
      if (answer == null) throw new IllegalArgumentException("Answer cannot be null !");
      if (!options.contains(answer.toUpperCase())) throw new IllegalArgumentException("Not a possible answer !");
      this.answer = answer;
   }

   public String getAnswer() {
      return this.answer;
   }

   @Override
   public List<String> getOptions() {
      return this.options;
   }

   @Override
   public int evaluate(Question question) {
      if (question == null) throw new IllegalArgumentException("No question to evaluate with !");
      if (!(question instanceof TrueFalseQuestion)) throw new IllegalArgumentException("Cannot evaluate due to different question type !");
      if (this.answer.equals(question.getAnswer())) return this.getWeight();
      return 0;
   }
}
