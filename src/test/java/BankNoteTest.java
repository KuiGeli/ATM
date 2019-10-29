import org.junit.Assert;
import org.junit.Test;

public class BankNoteTest {


    @Test
    public void bankNoteTest() {
        BankNote5 lej = new BankNote5(null);

       lej.isWithdrawn(10);

        Assert.assertEquals(2, lej.getBankNoteCounter());

    }


}
