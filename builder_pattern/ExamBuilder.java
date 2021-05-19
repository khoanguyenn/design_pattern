public class ExamBuilder {
    public static Exam buildHistoryExam() {
        Exam exam = new Exam();
        exam.addQuestion(QuestionBuilder.buildMCQuestion("Who is Khoa ?", 2));
        exam.addQuestion(QuestionBuilder.buildSCQuestion("Who is Hoang ?", 3));
        exam.addQuestion(QuestionBuilder.buildTFQuestion("What the hell ", 5));
        return exam;
    }

    public static Exam buildMathExam() {
        Exam exam = new Exam();
        exam.addQuestion(QuestionBuilder.buildMCQuestion("What is 1 + 2 ?", 2));
        exam.addQuestion(QuestionBuilder.buildSCQuestion("What is 7 * 9 ?", 3));
        exam.addQuestion(QuestionBuilder.buildTFQuestion("Who is the first person do math ?", 5));
        return exam;
    }

    public static Exam buildAlgorithmExam() {
        Exam exam = new Exam();
        exam.addQuestion(QuestionBuilder.buildMCQuestion("What is bubble sorting ?", 2));
        exam.addQuestion(QuestionBuilder.buildSCQuestion("What is time complex ?", 3));
        exam.addQuestion(QuestionBuilder.buildTFQuestion("How long this algorithm take ?", 5));
        return exam;
    }
}
