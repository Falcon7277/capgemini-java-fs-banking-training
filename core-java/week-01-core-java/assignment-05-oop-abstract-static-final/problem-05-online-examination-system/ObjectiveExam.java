public class ObjectiveExam extends Exam {

    private final int correctAnswers;
    private final int marksPerQuestion;

    public ObjectiveExam(int totalMarks, int correctAnswers, int marksPerQuestion) {
        super(totalMarks);
        this.correctAnswers = correctAnswers;
        this.marksPerQuestion = marksPerQuestion;
    }

    @Override
    public int evaluate() {
        int score = correctAnswers * marksPerQuestion;
        return Math.min(score, totalMarks);// if total marks exceeds total limit, return the limit
    }
}
