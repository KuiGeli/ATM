public class BankNote1 extends WithdrawalProcess {


    public BankNote1(WithdrawalProcess nextBanknote) {
        super(nextBanknote);
    }

    private static int value = 1;
    private int bankNoteCounter = 0;

   void isWithdrawn(int money) {


            while (money >= value) {
                money -= value;
                bankNoteCounter++;


            }
            System.out.println(bankNoteCounter + "x: " + value);

        }



    }





