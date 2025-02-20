package Encapsulation;

class BankAccount{
    private int balance;

    public BankAccount(int initialBalance){
        this.balance=initialBalance;
    }

    public void showBalance(){
        System.out.println("Your current balance is: Rs."+this.balance);
    }

    public void deposit(int amount){
        this.balance=this.balance+amount;
        System.out.println(amount+" Rupees deposited");
        this.showBalance();
    }

    public void withdraw(int amount){
        if(amount>this.balance){
            System.out.println("Insufficient Balance in your Account");
        }
        else{
            this.balance=this.balance-amount;
            System.out.println(amount+" Rupees withdrawn");
            this.showBalance();

        }
    }

}

public class EncapsulationDemo{
    public static void main(String[] args) {
        BankAccount acc=new BankAccount(10000);
        acc.showBalance();
        acc.deposit(500);
        acc.withdraw(1000);

    }
}