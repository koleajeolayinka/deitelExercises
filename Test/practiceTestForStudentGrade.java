import org.junit.jupiter.api.Test;
import tddClass.StudentResultScore;

import static org.testng.AssertJUnit.assertEquals;

public class practiceTestForStudentGrade {
//    StudentResultScore result;
//    @BeforeEach
//
    @Test
    public void testFor (){
        int [][] grade = {{30,50,20},
                          {50,50,100},
                          {30,58,58}};
        StudentResultScore result = new StudentResultScore(grade);
        assertEquals(100,result.getSumForStudent(0));
        assertEquals(200,result.getSumForStudent(1));


    }

    @Test
    public void testForAverage (){
        int [][] grade = {{4,5,6,3},
                         {10,10}};
        StudentResultScore result = new StudentResultScore(grade);
        assertEquals(4.5,result.getAverageForStudent(0));
    }

    @Test
    public void testPosition (){
        int [][] grade = {{30,50,20},
                {50,50,100},
                {30,58,58}};
        StudentResultScore result = new StudentResultScore(grade);
//        assertEquals(100,result.getPositionForStudent(0));
//        assertEquals(200,result.getPositionForStudent(1));
//        assertEquals(200,result.getPositionForStudent(2));



    }
    @Test
    public void testForAscendingScore(){
        int [][] grade = {{30,50,20},
                {50,50,100},
                {30,58,58}};
        StudentResultScore result = new StudentResultScore(grade);
//        assertArrayEquals(20,30,50,result.getAscendingOrderOfStudent(0));
//        assertArrayEquals(50,50,100,result.getAscendingOrderOfStudent(1));
//        assertArrayEquals(30,58,58,result.getAscendingOrderOfStudent(2));

    }


}
