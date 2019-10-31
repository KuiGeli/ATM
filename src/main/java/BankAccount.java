public class BankAccount {

    public BankAccount(int money) {
        this.money = money;
    }

    private int money;

    public int getMoney() {
        return money;
    }

    public void inputMoney(int moneyAdded){
        money += moneyAdded;
    }


}
