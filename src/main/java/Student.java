import java.util.ArrayList;

public class Student {

    /** Instance properties */
    private long id;
    private String studentName;
    private ArrayList<Integer> grades;

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

    /** Get individual average*/
    public double getGradeAverage1() {
        double total = 0;
        for (Integer grade: grades) {
            total += grade;
        }
        return total/ grades.size();
    }

    /** Get overall grade average */
    public double getGradeAverage() {
        double average = 0;
        for (int i = 0; i < grades.size(); i++) {
            double currentIndexedGrade = grades.get(i);
            average += currentIndexedGrade;
        }
        return average / grades.size();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

}
