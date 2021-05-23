public class Client {
    public static void main(String[] args) {
        // Create a exam
        Exam currentExam = ExamBuilder.buildTeamExam();
        // Example to list out the header of the questions
        for (Question question : currentExam.getQuestionList()) {
            System.out.println("📚 " + question.getHeader() + " : " + question.getWeight() + " : " + question.getOptions().toString());
        }
        // To answer some of the question
        // Caution: not implement check mechanism yet, please find in setAnswer
        currentExam.setAnswer(0, "Nguyen");
        currentExam.setAnswer(1, "Khoa");
        currentExam.setAnswer(2, "TRUE");
        currentExam.setAnswer(3, "Khoa", "Hoang");
        // Render the currentExam
        for (Question question : currentExam.getQuestionList()) {
            System.out.println("🔴 " + question.getHeader() + " : " + question.getAnswer());
        }
        System.out.println("📐 Evaluate: " + currentExam.evaluateExam(ExamAnswerBuilder.teamExamAnswer()));
    }
}
