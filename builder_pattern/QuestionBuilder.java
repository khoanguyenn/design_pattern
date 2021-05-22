public class QuestionBuilder {
    private Question buildQuestion = null;
    //Question selector
    public QuestionBuilder setType(Question.Type questionType) {
        switch(questionType) {
            case TrueFalse:
                this.buildQuestion = new TrueFalseQuestion();
                return this;
            case MultipleChoice:
                this.buildQuestion = new MultipleChoiceQuestion();
                return this;
            case SingleChoice:
                this.buildQuestion = new SingleChoiceQuestion();
                return this;
            default:
                //TODO: throw exception if there is wrong specific type 
                System.out.println("No specific question type !");
                return null;
        }
    }
    public QuestionBuilder setHeader(String header) {
        //TODO: validate the input header
        this.buildQuestion.setHeader(header);
        return this;
    }
    public QuestionBuilder setWeight(int weight) {
        //TODO: validate the input weight
        this.buildQuestion.setWeight(weight);
        return this;
    }
    public QuestionBuilder setOptions(String ...options) {
        this.buildQuestion.setOptions(options);
        return this;
    }
    public Question build() {
        Question finalQuestion = this.buildQuestion;
        this.buildQuestion = null;
        return finalQuestion;
    }
}
