package version1;

import java.util.ArrayList;
import java.util.List;

public class ExamBuilder {
    private List<Question> listOfQuestion = new ArrayList<Question>();

    public ExamBuilder addQuestion(Question question) {
        this.listOfQuestion.add(question);
        return this;
    }
    public Exam build() {
        Exam finalResult = new Exam(this.listOfQuestion);
        this.listOfQuestion = new ArrayList<Question>();
        return finalResult;
    }
}
