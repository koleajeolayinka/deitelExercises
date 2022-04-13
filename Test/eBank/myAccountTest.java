package eBank;

import AccountDemo.Account;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class myAccountTest {
    @Test
    public void accountCanBeCreatedTest() {
        Account account = new Account("2334", "tobi", "kole", "2222");
        assertNotNull(account);
    }

    @Test
    public void accountNumberCanBeCreatedWithAllDetailsTest() {
        Account account = new Account("2334", "tobi", "kole", "2222");
        assertEquals("2334", account.getaccountNumber());
        assertEquals("tobi kole", account.getaccountName());
    }

    @Test
    public void accountDepositTest() {
        Account account = new Account("2234", "tobi", "kole", "2222");
        account.deposit(500);
        assertEquals(500, account.getAccountBalance("2222"));
    }

    @Test
    public void accountDepositTestFor2() {
        Account account = new Account("2234", "tobi", "kole", "2222");
        account.deposit(500);
        account.deposit(400);
        assertEquals(900, account.getAccountBalance("2222"));

    }

    @Test
    public void wrongpin() {
        Account account = new Account("2234", "tobi", "kole", "2222");
        account.deposit(5000);
        assertEquals(0, account.getAccountBalance("2322"));

//    @Test
//    public void withDraw(){
//        Account account = new Account("2234", "tobi", "kole", 2222);
//        account.withDraw(600);
//        assertEquals(0, account.getAccountBalance(2322));

//    }


    }
}





