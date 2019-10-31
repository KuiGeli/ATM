public class Utils {

    public static void options (){

        System.out.println("Please choose one of the following options.");
        System.out.println("A. Withdraw money.");
        System.out.println("B. Ask for ATM refill.");
        System.out.println("C. Input more money to your account.");
        System.out.println("D. Check account balance.");
        System.out.println("E. Leave.");
    }
    static WithdrawalProcess withdrawal;

    public static void withdraw(int banknotesAvailable, int money){

        withdrawal = new BankNote100(
                new BankNote50(
                        new BankNote10(
                                new BankNote5(
                                        new BankNote1
                                                (null, banknotesAvailable), banknotesAvailable), banknotesAvailable), banknotesAvailable), banknotesAvailable);
        withdrawal.withdrawal(money);
    }

    public static void refill(){
        withdrawal.banknoteRefill();
    }

public static void errorMessage(){
    System.out.println("Please only input numbers! Not Decimal!");
}


}
