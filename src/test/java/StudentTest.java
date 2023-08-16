import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class StudentTest {

    private Student emptyStudent;
    private Student actualStudent;

    private double deltaValue = 0.000001;

    @Before
    public void setup() {
        actualStudent = new Student(234567, "Cesar");
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
    }


}
