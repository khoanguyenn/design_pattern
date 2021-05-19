import java.util.List;

public abstract class Question {
    private String header;
    private int weight;
    protected List<String> options;
    private String answer;
    public Question(String header, int weight) {
        this.header = header;
        this.weight = weight;
    }
    public void setHeader(String header) {
        this.header = header;
    }
    public String getHeader() {
        return this.header;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getAnswer() {
        return this.answer;
    }
    public String getPossibleAnswer() {
        StringBuilder result = new StringBuilder();
        for (String option : this.options) {
            result.append(option);
            result.append(" ");
        }
        return result.toString();
    }
    public void setAnswer(String answer) throws IllegalArgumentException {
        //TODO: Check if answer is in options list
        //TODO: Check if answer is already exists
        this.answer = answer;
    }
}