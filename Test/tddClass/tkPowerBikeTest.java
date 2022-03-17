package tddClass;



import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class tkPowerBikeTest {

    @Test
    public void checkPowerBikeCanBeTurnOn(){
        //Given that
        tkPowerBike bajaj = new tkPowerBike();
        //when
        bajaj.setTurnOn();
        //assert
        assertEquals(true,bajaj.getTurnOn());
    }


    @Test
    public void checkPowerBikeCanBeTurnOff() {
        //Given that
        tkPowerBike bajaj = new tkPowerBike();
        //when
        bajaj.setTurnOff();
        //assert
        assertEquals(false,bajaj.getTurnOff());
    }
   @Test
    public void checkIfBikeAccelerate() {
       //given that
       tkPowerBike bajaj = new tkPowerBike();
       //when
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       //assert
       assertEquals(3, bajaj.getAccelerated());

   }
   @Test
    public void checkIfBikeDecelerate() {
        //GIVEN THAT
       tkPowerBike bajaj = new tkPowerBike();
       //when
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setDecelerate();
       //assert
       assertEquals(2, bajaj.getDecelerated());
   }

   @Test
    public void checkIfBikeSpeedTo15WhenExpected16() {
        //given that
       tkPowerBike bajaj = new tkPowerBike();
       //When
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       //assert
       assertEquals(16, bajaj.getAccelerated());

   }
   @Test
    public void checkIfBikeSpeedTo24WhenExpected() {
        //given that
       tkPowerBike bajaj = new tkPowerBike();
       //when
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       //assert
       assertEquals(26,bajaj.getAccelerated());


   }

   @Test
    public void speedUpto35WhenExpected38(){
        //given that
       tkPowerBike bajaj = new tkPowerBike();
       //when
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       //assert
       assertEquals(38,bajaj.getAccelerated());
   }

   @Test
    public void speedUUpTo44WhenExpected48(){
        //given that
       tkPowerBike bajaj = new tkPowerBike();
       //when
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       bajaj.setAccelerated();
       //assert
       assertEquals(48,bajaj.getAccelerated());
   }
      @Test
    public void checkBikeWhenSpeedUpTo15ThenDecelerateExpect14() {
       //given that
       tkPowerBike bajaj = new tkPowerBike();
       //when
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setDecelerate();
          //assert
          assertEquals(14,bajaj.getDecelerated());
      }
      @Test
    public void checkBikeWhenSpeedUpTo15ThenDecelerateExpected14() {
          //given that
          tkPowerBike bajaj = new tkPowerBike();
          //when
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setDecelerate();
          bajaj.setDecelerate();

          //assert
          assertEquals(22,bajaj.getDecelerated());
      }
      @Test
    public void checkBikeWhenAcceleratedTo35Expected32(){
        //given that
          tkPowerBike bajaj = new tkPowerBike();
          //when
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setDecelerate();
          bajaj.setDecelerate();
          bajaj.setDecelerate();
          //assert
          assertEquals(32,bajaj.getDecelerated());
      }

      @Test
    public void checkIfBikeSpeedUpTo44Expect40(){
        //given that
          tkPowerBike bajaj = new tkPowerBike();
          //when
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setAccelerated();
          bajaj.setDecelerate();
          bajaj.setDecelerate();
          bajaj.setDecelerate();
          bajaj.setDecelerate();
          //Assert
          assertEquals(40,bajaj.getDecelerated());
      }
      @Test
    public void GearSpeedAreInTheFollowingRange(){
        //given that
          tkPowerBike bajaj = new tkPowerBike();
          //when
          bajaj.gearOneAccelerated();
          bajaj.gearOneAccelerated();
          bajaj.gearOneAccelerated();
          bajaj.gearOneAccelerated();
          bajaj.gearOneAccelerated();
          bajaj.gearOneAccelerated();
          bajaj.gearOneAccelerated();
          bajaj.gearOneAccelerated();
          bajaj.gearOneAccelerated();
          bajaj.gearOneAccelerated();
          bajaj.gearOneAccelerated();
          bajaj.gearOneAccelerated();
          bajaj.gearOneAccelerated();
          bajaj.gearOneAccelerated();
          bajaj.gearOneAccelerated();
          bajaj.gearOneAccelerated();
          bajaj.gearOneAccelerated();
          bajaj.gearOneAccelerated();
          bajaj.gearOneAccelerated();
          bajaj.gearOneAccelerated();
          bajaj.gearTwoAccelerated();
          bajaj.gearTwoAccelerated();
          bajaj.gearTwoAccelerated();
          bajaj.gearTwoAccelerated();
          bajaj.gearTwoAccelerated();
          bajaj.gearTwoAccelerated();
          bajaj.gearTwoAccelerated();
          bajaj.gearTwoAccelerated();
          bajaj.gearTwoAccelerated();
          bajaj.gearTwoAccelerated();
          bajaj.gearThreeAccelerated();
          bajaj.gearThreeAccelerated();
          bajaj.gearThreeAccelerated();
          bajaj.gearThreeAccelerated();
          bajaj.gearThreeAccelerated();
          bajaj.gearThreeAccelerated();
          bajaj.gearThreeAccelerated();
          bajaj.gearThreeAccelerated();
          bajaj.gearThreeAccelerated();
          bajaj.gearThreeAccelerated();
          bajaj.gearFourAccelerated();
          bajaj.gearFourAccelerated();
          bajaj.gearFourAccelerated();
          bajaj.gearFourAccelerated();
          bajaj.gearFourAccelerated();
          bajaj.gearFourAccelerated();
          bajaj.gearFourAccelerated();
          bajaj.gearFourAccelerated();
          bajaj.gearFourAccelerated();
          bajaj.gearFourAccelerated();
          //assert

          assertEquals(50,bajaj.getAccelerated());
      }

    }





