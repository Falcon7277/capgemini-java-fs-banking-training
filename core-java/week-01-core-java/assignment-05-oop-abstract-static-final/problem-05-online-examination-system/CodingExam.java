public class CodingExam extends Exam {

    private final int testCasesPassed;//test cases passed for a problem
    private final int totalTestCases;// total test cases for that problem

    public CodingExam(int totalMarks, int testCasesPassed, int totalTestCases) {
        super(totalMarks);
        this.testCasesPassed = testCasesPassed;
        this.totalTestCases = totalTestCases;
    }

    @Override
    public int evaluate() {
        if (totalTestCases == 0) return 0;
        return (int) ((double) testCasesPassed / totalTestCases * totalMarks);//we
        // will get marks depending on how many test cases have been passed
    }
}
