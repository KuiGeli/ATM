public class Main {

    public static void main(String[] args) {

        WithdrawalProcess withdraw = new BankNote5(new BankNote1(null));

        withdraw.isWithdrawn(12);

    }

}
