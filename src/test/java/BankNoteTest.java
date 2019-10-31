import org.junit.Assert;
import org.junit.Test;

public class BankNoteTest {


    @Test
    public void bankNoteTest() {
        BankNote5 lej = new BankNote5(null, 1000);

       lej.withdrawal(500);

        Assert.assertEquals(100, lej.getBankNoteCounter());

    }

    @Test
    public void refillTest(){
        BankNote1 lej1 = new BankNote1(null, 1000);

        lej1.withdrawal(5);
        lej1.banknoteRefill();

        Assert.assertEquals(1000, lej1.getBanknotesAvailable());

    }


}
