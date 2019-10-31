public class BankNote100 extends WithdrawalProcess {

    public BankNote100(WithdrawalProcess nextBanknote, int banknoteAvailable) {
        super(nextBanknote);
        this.banknotesAvailable = banknoteAvailable;
    }

    private int value = 100;
    private int banknotesAvailable;
    private int bankNoteCounter = 0;

    void withdrawal(int money) {

        while (money >= value && banknotesAvailable > 0) {

            money -= value;
            bankNoteCounter++;
            banknotesAvailable--;
        }

        System.out.println(bankNoteCounter + "x: " + value);
        System.out.println(banknotesAvailable + " banknotes of value " + value + " left");
        if (nextBanknote != null) {
            nextBanknote.withdrawal(money);

        }

    }

    @Override
    void banknoteRefill() {
        if(bankNoteCounter > 0){
            System.out.println((bankNoteCounter) + "x banknotes of value " + value + " have been added." );
            banknotesAvailable += bankNoteCounter;

        }else if(bankNoteCounter ==0){
            System.out.println("There's no more space for banknotes of value " + value );
        }
        if(nextBanknote != null){
            nextBanknote.banknoteRefill();
        }
    }

    public int getValue() {
        return value;
    }

    public int getBankNoteCounter() {
        return bankNoteCounter;
    }

    public int getBanknotesAvailable() {
        return banknotesAvailable;
    }

}
