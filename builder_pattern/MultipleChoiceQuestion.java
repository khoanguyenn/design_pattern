import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleChoiceQuestion extends Question{
    public MultipleChoiceQuestion(String header, int weight) {
        super(header, weight);
    }
    private static List<String> options = Arrays.asList("1", "2", "3", "4", "5");
    public void setAnswer(String answer) throws IllegalArgumentException {
        if (options.contains(answer)) {
            this.answer = answer;
        } else {
            throw new IllegalArgumentException("Not a possible answer!");
        }
    }
    public boolean evaluate(MultipleChoiceQuestion question) {
        if (this.answer.equals(question.getAnswer())) {
            return true;
        }
        return false;
    }
}
