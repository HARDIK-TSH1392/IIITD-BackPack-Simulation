package Assignment2;

public class AssessmentQuiz {
    private String quiz;
    private int quizMarks = 1;

    public void setQuizMarks(int quizMarks) {
        this.quizMarks = quizMarks;
    }

    public int getQuizMarks() {
        return quizMarks;
    }

    public void setQuiz(String quiz) {
        this.quiz = quiz;
    }

    public String getQuiz() {
        return quiz;
    }
}
