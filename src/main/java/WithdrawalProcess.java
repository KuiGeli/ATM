public abstract class WithdrawalProcess {

    WithdrawalProcess nextBanknote;


    public WithdrawalProcess(WithdrawalProcess nextBanknote) {
        this.nextBanknote = nextBanknote;
    }

    abstract void isWithdrawn (int money);


}
