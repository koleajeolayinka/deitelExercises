package airConditionerTest;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class airConditionerTest {
    private AirConditioner lgAc;

    @Test
    public void CheckIfAcCanBeTurnOnTest() {


        //given that
        AirConditioner lgAc = new AirConditioner();
        //when
        lgAc.checkTurnedOn();
        //Assert
        assertEquals(true, lgAc.checkTurnOn());
    }


    @Test
    public void checkIfAcCanBeTurnOffTest() {
    //given that
        AirConditioner lgAc = new AirConditioner();
        //when
        lgAc.checkTurnedOff();
        //assert
        assertEquals(false,lgAc.checkTurnedOff());
}



    @Test
    public void CheckIfAcCanBeIncreaseTest(int temperature) {
        //given that
    AirConditioner lgAc = new AirConditioner();
    //when
        lgAc.increaceTemperatureNow();
        //assert
        assertEquals(17,lgAc.GetIncreaseTemperatureNow);
}
@Test
    public void changeTemperature(){
       //given
        AirConditioner lgAc = new AirConditioner("lg new generator", 20) ;
        //when
        lgAc.decreaseTemperatureNow();

        //asseret
        assertEquals(16,lgAc.GetDecreaseTemperatureNow);
}
}



