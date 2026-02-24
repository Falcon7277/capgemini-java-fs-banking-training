public abstract class Exam {
    protected static int numOfExams = 0;
    protected final int totalMarks;


    protected Exam(int totalMarks) {
        this.totalMarks = totalMarks;
        numOfExams++;
    }

    public static int getExamCount() {
        return numOfExams;
    }

    public abstract int evaluate();
}
