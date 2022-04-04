package Chapter3;



import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class petrolPurchaseTest {
    @Test
    public void petroPurchaseAccountGetLocation() {
        //When
        petrolPurchase petrolPurchase = new petrolPurchase("Epe", "Oando", 10, 160.5, 0.5);
        assertEquals("Epe", petrolPurchase.getLocation());

    }

    @Test
    public void petroPurchaseAccountTypeOfPetrol() {
        //When
        petrolPurchase petrolPurchase = new petrolPurchase("Epe", "Oando", 10, 160.5, 0.5);
        assertEquals("Oando", petrolPurchase.getTypeOfPetrol());

    }

    @Test
    public void petroPurchaseAccountQuantity() {
        //When
        petrolPurchase petrolPurchase = new petrolPurchase("Epe", "Oando", 10, 160.5, 0.5);
        assertEquals(10, petrolPurchase.getQuantity());

    }

    @Test
    public void petroPurchaseAccountGetPerLiter() {
        //When
        petrolPurchase petrolPurchase = new petrolPurchase("Epe", "Oando", 10, 160.5, 0.5);
        assertEquals(160.5, petrolPurchase.getPerLiter());
    }

    @Test
    public void petroPurchaseAccountPercentageDiscount() {
        //When
        petrolPurchase petrolPurchase = new petrolPurchase("Epe", "Oando", 10, 160.5, 0.5);
        assertEquals(0.5, petrolPurchase.getPercentageDiscount());

    }

    @Test
    public void petroPurchasePurchaseAmountAccount() {
        //When
        petrolPurchase petrolPurchase = new petrolPurchase("Epe", "Oando", 10, 160.5, 0.5);
        petrolPurchase.setPurchaseAmount(1926.0);
        assertEquals(120.0, petrolPurchase.getPurchaseAmount());

    }


}




