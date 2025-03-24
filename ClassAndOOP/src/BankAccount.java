public class BankAccount {
    String accountHolderName;
    double balance;

    public BankAccount(String accountHolderName, double balance){
        this.accountHolderName = accountHolderName;
        this.balance=balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }else{
            System.out.println("Insufficient funds");
        }
    }
    public void showInfo(){
        System.out.println("Name: "+accountHolderName+", Balance: "+balance);

    }
}
