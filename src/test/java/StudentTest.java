import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentTest {

    private Student emptyStudent;
    private Student actualStudent;

    private double deltaValue = 0.000001;
    private ArrayList<Integer> emptyArrayList;

    @Before
    public void setup() {
        actualStudent = new Student(234567, "Cesar");
        emptyArrayList = new ArrayList<>();
        // Treat it like a global function, accessible to any other method!!
        // Every test method will run the @Before before @Test
    }

    @Test
    public void testNoArgConstructor() {
        actualStudent = new Student();

        // assert that empty is null
        assertNull(emptyStudent);
        // assert that actual is a Student object
        assertNotNull(actualStudent);
    }

    @Test
    public void testTwoArgumentConstructor() {
        assertNotNull(actualStudent);
        assertNotNull(actualStudent.getGrades());
    }

    @Test
    public void testStudentGetters() {
        assertEquals(actualStudent.getId(), 234567);
        assertEquals(actualStudent.getStudentName(), "Cesar");

        assertNotNull(actualStudent.getGrades());
        assertEquals(actualStudent.getGrades(), emptyArrayList);
    }

    @Test
    public void testStudentAddGrade() {
        actualStudent.addGrade(50);
        actualStudent.addGrade(75);
        actualStudent.addGrade(100);

        ArrayList<Integer> exprectedGrades = new ArrayList<>(Arrays.asList(50, 75, 100));

        assertEquals(actualStudent.getGrades(), exprectedGrades);
    }

    @Test
    public void testGradeAverage() {
        actualStudent.addGrade(50);
        actualStudent.addGrade(75);
        actualStudent.addGrade(100);

        assertEquals(actualStudent.getGradeAverage1(), 75, deltaValue);
    }


}
