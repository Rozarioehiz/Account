package accountTest;

import account.Account;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    @Test
    public void testThatAccountBalanceIsEmpty(){
        Account account = new Account();
        double actual = account.getBalance();
        assertEquals(0,actual,0.00);

    }
}
