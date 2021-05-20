import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleChoiceQuestion extends Question{
    public SingleChoiceQuestion(String header, int weight) {
       super(header, weight);
    }
    private static String[] optionsInString = {"1", "2", "3", "4", "5"}; 
    protected static List<String> options = new ArrayList<String>(Arrays.asList(optionsInString));
    public void setAnswer(String answer) throws IllegalArgumentException {
      if (options.contains(answer.toLowerCase())) {
         this.answer = answer;
      } else {
         throw new IllegalArgumentException("Not a possible answer!");
      }
   }
   public boolean evaluate(SingleChoiceQuestion question) {
      if (this.answer.equals(question.getAnswer())) {
         return true;
      }
      return false;
   }
}
