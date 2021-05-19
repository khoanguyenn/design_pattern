import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleChoiceQuestion extends Question{
    public SingleChoiceQuestion(String header, int weight) {
        super(header, weight);
    }
    private static String[] optionsInString = {"1", "2", "3", "4", "5"}; 
    protected static List<String> options = new ArrayList<String>(Arrays.asList(optionsInString));
}
