package KataClass;

import org.testng.annotations.Test;
import tddClass.Kata;

import static org.testng.AssertJUnit.assertEquals;


public class KataTest {
    @Test
    public void testDriller1to4(){;
        //given that
        Kata testDriller = new Kata();
        //when
        testDriller.numbers(2);
        //assert
        assertEquals(4000,testDriller.numbers(2));
    }
    @Test
    public void testDriller5to9(){
        //given that
        Kata testDriller = new Kata();
        //when
        testDriller.numbers(5);
        //assert
        assertEquals(9000,testDriller.numbers(5));
    }
    @Test
    public void testDriller10to29(){
        //given that
        Kata testDriller = new Kata();
        //when
        testDriller.numbers(29);
        //assert
        assertEquals(46400,testDriller.numbers(29));

    }

    @Test
    public void testDriller30to49(){
        //given that
        Kata testDriller = new Kata();
        //when
        testDriller.numbers(40);
        //assert
        assertEquals(60000,testDriller.numbers(40));

    }
    @Test
    public void testDriller50to99(){
        //given that
        Kata testDriller = new Kata();
        //when
        testDriller.numbers(60);
        //assert
        assertEquals(78000,testDriller.numbers(60));
    }
    @Test
    public void TestDriller100to199(){
        //given that
            Kata testDriller = new Kata();
            //when
            testDriller.numbers(160);
            //assert
            assertEquals(192000,testDriller.numbers(160));
        }
        @Test
        public void testDriller200to499(){
            //given that
            Kata testDriller = new Kata();
            //when
            testDriller.numbers(250);
            //assert
            assertEquals(275000,testDriller.numbers(250));

        }

        @Test
        public void testDriller500ToAbove(){
            //given that
            Kata testDriller = new Kata();
            //when
            testDriller.numbers(500);
            //assert
            assertEquals(500_000,testDriller.numbers(500));
        }
        @Test
        public void evenNumber(){
            int number = 2;
            while(number <=100){
                number = number +2;
                System.out.print(number+ " ");
            }
        }
        @Test
        public void evenNumber2(){
            int number = 2;
            while(number <=100){
                if(number%2==0);
                System.out.print(number + " " );
            }
        }
    }

