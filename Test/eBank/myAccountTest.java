package eBank;

import AccountDemo.Account;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class myAccountTest {
    @Test
    public void accountCanBeCreatedTest(){
        Account account = new Account ("2334", "tobi", "kole", "2222");
        assertNotNull(account);
    }
    @Test
    public void accountNumberCanBeCreatedWithAllDetailsTest(){
        Account account = new Account("2334", "tobi", "kole", "2222");
        assertEquals("2334", account.getaccountNumber());
        assertEquals("tobi kole", account.getaccountName());
    }
    @Test
    public void accountDepositTest(){
        Account account = new Account("2234", "tobi", "kole", "2222");
       account.deposit("500");
       account.deposit("400");
       assertEquals(900, account.getaccountBalance());
    }




}



