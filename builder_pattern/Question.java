import java.io.IOException;
import java.util.List;

public abstract class Question {
    private String header;
    private int weight;
    protected String answer;
    public Question(String header, int weight) {
        this.header = header;
        this.weight = weight;
    }
    public String getHeader() {
        return this.header;
    }
    public void setHeader(String header) {
        this.header = header;
    }
    public int getWeight() {
        return this.weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getAnswer() {
        return this.answer;
    }
    public void setAnswer(String answer) throws IllegalArgumentException{};
    public boolean evaluate(Question question) {
        if (this.answer == null) {
            return false;
        }
        if (this.answer.equals(question.getAnswer())) {
            return true;
         }
         return false;
    };
}