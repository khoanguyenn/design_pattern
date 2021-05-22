import java.util.List;

public class ExamAnswerBuilder {
    public static Exam teamExamAnswer() {
       Exam exam = ExamBuilder.buildTeamExam();
       List<Question> questionList = exam.getQuestionList();
       try {
            questionList.get(0).setAnswer("Nguyen");
            questionList.get(1).setAnswer("Khoa");
            questionList.get(2).setAnswer("TRUE");
            questionList.get(3).setAnswer("Khoa", "Hoang", "Hieu");
       } catch (IllegalArgumentException exception) {
           exception.printStackTrace();
       }
       return exam;
    }    
}
