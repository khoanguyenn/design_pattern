package version1;

public class ExamDirector {
    private ExamBuilder examBuilder;
    private QuestionBuilder questionBuilder;

    public ExamDirector(ExamBuilder examBuilder, QuestionBuilder questionBuilder) {
        this.examBuilder = examBuilder;
        this.questionBuilder = questionBuilder;
    }
    public Exam buildTeamExam() {
        examBuilder.addQuestion(questionBuilder
                .setType(Question.Type.SingleChoice)
                .setHeader("What is Khoa's last name?")
                .setWeight(2)
                .setOptions("Nguyen", "Truong", "Tran")
                .build());
        examBuilder.addQuestion(questionBuilder
                .setType(Question.Type.SingleChoice)
                .setHeader("Who is teamleader ?")
                .setWeight(3)
                .setOptions("Hoang", "Khoa", "Hieu", "Ngan", "Huy")
                .build());
        examBuilder.addQuestion(questionBuilder
                .setType(Question.Type.TrueFalse)
                .setHeader("Do Khoa work hard ?")
                .setWeight(5)
                .build());
        examBuilder.addQuestion(questionBuilder
                .setType(Question.Type.MultipleChoice)
                .setHeader("Who is the most active ?")
                .setWeight(10)
                .setOptions("Khoa", "Hoang", "Hieu", "Ngan", "Huy")
                .build());
        return examBuilder.build();
    }

    public Exam buildMathExam() {
        examBuilder.addQuestion(questionBuilder.setType(Question.Type.MultipleChoice).setHeader("What is 1 + 2 ?").setWeight(2)
                .build());
        examBuilder.addQuestion(
                questionBuilder.setType(Question.Type.SingleChoice).setHeader("What is 7 * 9 ?").setWeight(3).build());
        examBuilder.addQuestion(questionBuilder.setType(Question.Type.TrueFalse).setHeader("Is human being do math ?")
                .setWeight(5).build());
        return examBuilder.build();
    }

    public Exam buildAlgorithmExam() {
        examBuilder.addQuestion(questionBuilder.setType(Question.Type.MultipleChoice).setHeader("What is bubble sorting ?")
                .setWeight(2).build());
        examBuilder.addQuestion(questionBuilder.setType(Question.Type.SingleChoice).setHeader("What is time complex ?")
                .setWeight(3).build());
        examBuilder.addQuestion(questionBuilder.setType(Question.Type.TrueFalse).setHeader("How long this algorithm take ?")
                .setWeight(5).build());
        return examBuilder.build();
    }

}
