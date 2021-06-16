package version1;

import java.util.List;

public class ExamAnswerDirector {
    private ExamDirector examDirector;
    public ExamAnswerDirector(ExamDirector examDirector) {
        this.examDirector = examDirector;
    }
    public Exam teamExamAnswer() {
        Exam teamExamAnswer = this.examDirector.buildTeamExam();
        List<Question> questionList = teamExamAnswer.getQuestionList();
        questionList.get(0).setAnswer("Nguyen");
        questionList.get(1).setAnswer("Khoa");
        questionList.get(2).setAnswer("TRUE");
        questionList.get(3).setAnswer("Khoa", "Hoang", "Hieu");
        return teamExamAnswer;
    }    
}
