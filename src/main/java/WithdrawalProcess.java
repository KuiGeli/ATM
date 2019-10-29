public abstract class WithdrawalProcess {

    WithdrawalProcess nextBanknote;


    public WithdrawalProcess(WithdrawalProcess nextBanknote) {
        this.nextBanknote = nextBanknote;
    }

    abstract boolean isWithdrawn (int money);


}
