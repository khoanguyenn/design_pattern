import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrueFalseQuestion extends Question {
   public TrueFalseQuestion(String header, int weight) {
      super(header, weight);
   }
   private static String[] optionsInString = {"true", "false", "none"}; 
   private static List<String> options = new ArrayList<String>(Arrays.asList(optionsInString));
   @Override
   public void setAnswer(String answer) throws IllegalArgumentException {
      if (options.contains(answer.toLowerCase())) {
         this.answer = answer;
      } else {
         throw new IllegalArgumentException("Not a possible answer!");
      }
   }

   public boolean evaluate(TrueFalseQuestion question) {
      if (this.answer.equals(question.getAnswer())) {
         return true;
      }
      return false;
   }
}
