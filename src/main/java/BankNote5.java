public class BankNote5 extends WithdrawalProcess {

    public BankNote5(WithdrawalProcess nextBanknote) {
        super(nextBanknote);
    }

    private int value = 5;
    private int bankNoteCounter = 0;

    void isWithdrawn(int money) {

        while (money >= value) {


            money -= value;
            bankNoteCounter++;



        }
        System.out.println(bankNoteCounter + "x: " + value);
        if (nextBanknote != null) {
            nextBanknote.isWithdrawn(money);

        }

    }

    public int getValue() {
        return value;
    }

    public int getBankNoteCounter() {
        return bankNoteCounter;
    }
}
