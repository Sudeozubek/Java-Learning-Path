public class MainBankAccount {
    public static void main(String[] args){
        BankAccount account = new BankAccount("Sude", 45);

        account.deposit(500);
        account.withdraw(200);
        account.showInfo();
    }
}
