public class BankNote1 extends WithdrawalProcess {


    public BankNote1(WithdrawalProcess nextBanknote) {
        super(nextBanknote);
    }

    private static int value = 1;
    private int bankNoteCounter = 0;

    boolean isWithdrawn(int money) {

        if (money >= value) {
            while (money >= value) {
                money -= value;
                bankNoteCounter++;

                System.out.println(money);
            }
            System.out.println(bankNoteCounter + "x: " + value);
            return true;
        } else if (nextBanknote != null) {
            nextBanknote.isWithdrawn(money);
        }

        return false;

    }




}
