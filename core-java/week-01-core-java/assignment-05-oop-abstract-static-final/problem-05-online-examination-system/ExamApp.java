public class ExamApp {
    public static void main(String[] args) {
        Exam e1 = new ObjectiveExam(100, 45, 2);
        Exam e2 = new CodingExam(100, 8, 10);

        System.out.println("Objective Exam Score: " + e1.evaluate());
        System.out.println("Coding Exam Score: " + e2.evaluate());

        System.out.println("Total Exams Conducted: " + Exam.getExamCount());
    }
}
