import java.util.List;

public abstract class Question {
    public enum Type {
        MultipleChoice, TrueFalse, SingleChoice
    };
    private String header;
    private int weight;
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
    public void setOptions(String[] options) {}
    public List<String> getOptions() {return null;}
    public void setAnswer(String answer) {}
    public void setAnswer(String ...answer) {}
    public String getAnswer() {return null;}
    public int evaluate(Question correctAnswer) {return 0;}
}