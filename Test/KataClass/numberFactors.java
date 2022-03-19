package KataClass;

import org.testng.annotations.Test;
import tddClass.Kata;

import static org.testng.AssertJUnit.assertEquals;

public class numberFactors {
    @Test
    public void ultimateNumberFactors(){
        //given that
        Kata numberFactors = new Kata();
        //when
        int result = numberFactors.numInt(10);
        //assert
        assertEquals(0, result);
    }


}
