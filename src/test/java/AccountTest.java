import org.junit.Assert;
import org.junit.Test;

public class AccountTest {


    @Test
    public void accountTest(){
        BankAccount account = new BankAccount(1000);

        account.inputMoney(60);

        Assert.assertEquals(1060, account.getMoney());

    }



}
