import AssignmentDen.Report;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class StudentGradeReportCard {
    @Test
    public static void StudentId() {
        Report studentId = new Report("Student1", "Student2", "Student3");
        studentId.setFirstStudentId();
        studentId.setSecondStudentId();
        studentId.setThirdStudentId();
        assertEquals("Student1", studentId.getFirstStudentId());
        assertEquals("Student2", studentId.getSecondStudentId());
        assertEquals("Student3", studentId.getThirdStudentId());
    }

    @Test
    public static void StudentSubjectMark() {
        Report studentMark = new Report("Student1", "Student2", "Student3");
        studentMark.setHighestSubjectMark(22, 33, 900);
        studentMark.getHighestSubjectMark();
        assertEquals(900, studentMark.getHighestSubjectMark());



    }
}
