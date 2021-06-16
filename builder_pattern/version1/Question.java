package version1;

import java.util.List;

public abstract class Question {
    private String header;
    private int weight;
    public Question(String header, int weight) {
        this.header = header;
        this.weight = weight;
    }
    public String getHeader() {
        return this.header;
    }
    public int getWeight() {
        return this.weight;
    }
    public abstract List<String> getOptions();
    public abstract void setAnswer(String answer);
    public void setAnswer(String ...answer) {};
    public abstract String getAnswer();
    public abstract int evaluate(Question correctAnswer);
    public enum Type {
        MultipleChoice, TrueFalse, SingleChoice
    };
}