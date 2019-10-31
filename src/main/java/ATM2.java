import java.util.Scanner;

public class ATM2 {

    public static void main(String[] args) {

        WithdrawalProcess withdrawal = new BankNote100(
                new BankNote50(
                new BankNote10(
                new BankNote5(
                new BankNote1
                (null, 10000), 1000),100), 600), 100);

        int localAvailableMoney = 51000;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input your account balance. (The amount of money you have on your account balance)");

        while (!userInput.hasNextInt()) {
            Utils.errorMessage();
            userInput.next();
        }
        int accountBalance = userInput.nextInt();

        BankAccount account = new BankAccount(accountBalance);

        boolean isRunning = true;

        while (isRunning) {

            Utils.options();

            char userChoice = userInput.next().charAt(0);

            switch (userChoice) {
                case 'A':
                    System.out.println("Please input the amount you want to withdraw.");


                    while (!userInput.hasNextInt()) {
                        Utils.errorMessage();
                        userInput.next();
                    }
                    int money = userInput.nextInt();

                    withdrawal.withdrawal(money);
                    account.withdrawFromBalance(money);
                    break;
                case 'B':
                    withdrawal.banknoteRefill();
                    break;
                case 'C':

                    System.out.println("Please input the amount.");

                    while (!userInput.hasNextInt()) {
                        Utils.errorMessage();
                        userInput.next();
                    }
                    int moneyAdded = userInput.nextInt();
                    account.inputMoney(moneyAdded);
                    break;
                case 'D':
                    System.out.println("You have " + account.getMoney());
                    break;
                case 'E':
                    isRunning = false;
                    break;
            }


        }


    }


}
