package eBank;

import AccountDemo.Account;
import AccountDemo.Bank;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class DemoAccount {


    private Bank firstBank;

    @BeforeEach
    public void setUp(){
        firstBank = new Bank("firstBank", 10);

    }

    @Test
    public void bankDemo() {
        Bank firstBank = new Bank("firstBank", 10);
        Bank wema;
        assertNotNull(firstBank);
        assertEquals("firstBank", firstBank.getName());
        assertEquals(10, firstBank.getMaximumNumberOfCustomer());

    }
    @Test
    public void bankAccount() {
        Bank firstBank = new Bank("firstBank", 10);
        Bank wema;
        firstBank.createAccountFor("kole", "Tobi", "1234");
        firstBank.createAccountFor("sole", "Tobi", "1234");
        assertEquals(2, firstBank.getNumberOfCustomer());

    }


        @Test
        public  void bankCanDeposit(){
            firstBank.createAccountFor("kole", "tobi", "1234");
            firstBank.deposit(1200,"1");
            firstBank.deposit(1200,"1");
            Account account = firstBank.findAccount((1));
            assertEquals(1200, account.getBalance(1234));
        }

        @Test
        public void numberOfBankCustomer() {
            firstBank.createAccountFor("kole", "Tobi", "1234");
            firstBank.createAccountFor("kole", "Tobi", "1234");
            assertEquals(2, firstBank.findAccount(2));

        }

}