import java.util.List;

public class ExamAnswerBuilder {
    public static Exam mathExamAnswer() {
       Exam exam = ExamBuilder.buildHistoryExam();
       List<Question> questionList = exam.getQuestionList();
       try {
            questionList.get(0).setAnswer("3");
            questionList.get(1).setAnswer("49");
            questionList.get(2).setAnswer("Pytago");
       } catch (IllegalArgumentException exception) {
           exception.printStackTrace();
       }
       return exam;
    }    
}
