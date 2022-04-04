package Chapter3;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class myCarTest {
    @Test
    public void MyFirstCarDetails(){
        Car account = new Car ("toyota corolla ", "2020 ", 3_000_000.5 );
        assertEquals("toyota corolla ", account.getCarModel());
        assertEquals("2020 ", account.getCarYear());
        assertEquals(3_000_000.5, account.getCarPrice());

    }
    @Test
    public void SecondCar(){
        Car.Car2 account1 = new Car.Car2("benz ", "2020 ", 100_000_000.5 );
        assertEquals("benz ", account1.getSecondCarModel());
        assertEquals("2020 ", account1.getSecondCarYear());
        assertEquals(100_000_000.5, account1.getSecondCarPrice());

    }
    @Test
    public void DiscountOnFirstAccount(){
        Car account = new Car ("toyota corolla ", "2020 ", 3_000_000.5 );
        account.getDiscount(5);
        assertEquals(150_000.025, account.getDiscount(5));

    }
    @Test
    public void SecondCarDiscount(){
        Car.Car2 account1 = new Car.Car2("benz ", "2020 ", 100_000_000.5 );
        account1.getDiscount(7);
        assertEquals(5_000_000.025, account1.getDiscount(5));


    }

}
