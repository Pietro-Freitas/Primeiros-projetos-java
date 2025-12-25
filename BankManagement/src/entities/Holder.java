package entities;

public class Holder {
    private final int NUMBER;
    private double balance;
    private String name;

    public Holder(int NUMBER, double balance, String name) {
        this.NUMBER = NUMBER;
        this.balance = balance;
        this.name = name;
    }
    public void addBalance(double balance){
        this.balance += balance;
    }
    public void decreaseBalance(double balance){
        this.balance -= balance + 5.00;
    }

    public String toString(){
        return "Account: " + NUMBER + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);
    }

}