package Chapter3;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class carApplication {
    @Test
    public void carApplicationAmount(){
        //given that
        carApplication firstSmartCar = new carApplication();
        //when
        firstSmartCar.getClass();
        //assert
       assertEquals(30,firstSmartCar());


    }

    private int firstSmartCar() {
        return 0;
    }


}



