public class Client {
    public static void main(String[] args) {
        // Create a exam
        Exam currentExam = ExamBuilder.buildMathExam();
        // Example to list out the header of the questions
        for (Question question : currentExam.getQuestionList()) {
            System.out.println(question.getHeader());
        }
        // To answer some of the question
        // Caution: not implement check mechanism yet, please find in setAnswer
        currentExam.setAnswer(0, "3");
        currentExam.setAnswer(1, "2");
        // Render the currentExam
        for (Question question : currentExam.getQuestionList()) {
            System.out.println(question.getHeader() + " : " + question.getAnswer());
        }
        System.out.println("Evaluate: " + currentExam.evaluateExam(ExamAnswerBuilder.mathExamAnswer()));
    }
}
