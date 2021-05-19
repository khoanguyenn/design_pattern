public class QuestionBuilder {
    public static TrueFalseQuestion buildTFQuestion(String header, int weight) {
        return new TrueFalseQuestion(header, weight);
    }
    public static MultipleChoiceQuestion buildMCQuestion(String header, int weight) {
        return new MultipleChoiceQuestion(header, weight);
    }
    public static SingleChoiceQuestion buildSCQuestion(String header, int weight) {
        return new SingleChoiceQuestion(header, weight);
    }
}
