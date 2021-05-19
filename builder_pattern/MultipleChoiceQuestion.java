import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleChoiceQuestion extends Question{
    public MultipleChoiceQuestion(String header, int weight) {
        super(header, weight);
    }
    private static String[] optionsInString = {"1", "2", "3", "4", "5"}; 
    private static List<String> options = new ArrayList<String>(Arrays.asList(optionsInString));
    
}
