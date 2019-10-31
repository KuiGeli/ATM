import java.util.Scanner;

public class ATM1 {

    public static void main(String[] args) {

        int localAvailableMoney = 1000;
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

                    Utils.withdraw(localAvailableMoney, money);
                    break;
                case 'B':
                    Utils.refill();
                    break;
                case 'C':

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
