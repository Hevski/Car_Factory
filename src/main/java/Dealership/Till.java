package Dealership;

public class Till {

    private int money;

    public Till(int money){
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public int increaseMoney(int amount){
        return this.money += amount;
    }
}
