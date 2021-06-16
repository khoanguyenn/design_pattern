package version1;

public class Client {
    public static void main(String[] args) {
        // Create a exam
        ExamBuilder examBuilder = new ExamBuilder();
        QuestionBuilder questionBuilder = new QuestionBuilder();
        ExamDirector eDirector = new ExamDirector(examBuilder, questionBuilder);
        Exam currentExam = eDirector.buildTeamExam();
        // Example to list out the header of the questions
        for (Question question : currentExam.getQuestionList()) {
            System.out.println("📚 " + question.getHeader() + " : " + question.getWeight() + " : " + question.getOptions().toString());
        }
        // To answer some of the question
        // Caution: not implement check mechanism yet, please find in setAnswer
        currentExam.setAnswer(0, "Nguyen");
        currentExam.setAnswer(1, "Khoa");
        currentExam.setAnswer(2, "TRUE");
        currentExam.setAnswer(3, "Khoa", "Hoang", "Ngan");
        // Render the currentExam
        for (Question question : currentExam.getQuestionList()) {
            System.out.println("🔴 " + question.getHeader() + " : " + question.getAnswer());
        }

        ExamAnswerDirector examAnswerDirector = new ExamAnswerDirector(eDirector);
        System.out.println("📐 Evaluate: " + currentExam.evaluateExam(examAnswerDirector.teamExamAnswer()));
    }
}
