import java.util.ArrayList;

public class Student {

    /** Instance properties */
    private long id;
    private String studentName;
    private static ArrayList<Integer> grades;

    /** Constructors */
    public Student () {}

    public Student(long id, String studentName) {
        this.id = id;
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getGradeAverage() {
        double total = 0;
        for (Integer grade: grades) {
            total += grade;
        }
        return total/ grades.size();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

}
