package version1;

public class QuestionBuilder {
    private String header;
    private int weight;
    private String[] options;
    private Question.Type questionType;

    public QuestionBuilder setType(Question.Type questionType) {
        if (questionType == null) throw new IllegalArgumentException("Please specify the question's type !");
        this.questionType = questionType;
        return this;
    }
    public QuestionBuilder setHeader(String header) {
        if (header == null) throw new IllegalArgumentException("Please specify the header !");
        if (header.isBlank()) throw new IllegalArgumentException("No header detected, please don't an empty header !");
        this.header = header;
        return this;
    }
    public QuestionBuilder setWeight(int weight) {
        this.weight = weight;
        return this;
    }
    public QuestionBuilder setOptions(String ...options) {
        if (options == null) throw new IllegalArgumentException("Please specify your possible options !");
        this.options = options;
        return this;
    }
    public Question build() {
        switch(this.questionType) {
            case TrueFalse:
                TrueFalseQuestion tfQuestion = new TrueFalseQuestion(this.header, this.weight);
                reset();
                return tfQuestion;
            case MultipleChoice:
                MultipleChoiceQuestion mcQuestion = new MultipleChoiceQuestion(this.header, this.weight, this.options);
                reset();
                return mcQuestion;
            case SingleChoice:
                SingleChoiceQuestion scQuestion = new SingleChoiceQuestion(this.header, this.weight, this.options);
                reset();
                return scQuestion;
            default:
                System.out.println("No specific question type !");
                return null;
        }
    }
    private void reset() {
        this.header = null;
        this.weight = 0;
        this.options = null;
        this.questionType = null;
    }
}
