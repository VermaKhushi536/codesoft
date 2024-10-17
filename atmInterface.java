
import java.util.Scanner;

class UserAccount{
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public boolean withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance = balance - amount;
            return true;
        }
        else{
            return false;
        }
    }
}

class ATM{
    private UserAccount account;

    public ATM(UserAccount account){
        this.account = account;
    }

    public void choices(){
        System.out.println("Your Options:");
        System.out.println("1 - Check Balance");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Exit");
    }

    public void ATMchoices(){
        Scanner in = new Scanner(System.in);

        while (true){
            choices();
            System.out.print("Enter your choice : ");
            int choice = in.nextInt();

            if(choice == 1){
                System.out.println("Your account balance is :" + account.getBalance());
            }
            else if(choice == 2){
                System.out.print("Enter the amount to be deposited : ");
                double amountToDeposit = in.nextInt();
                account.deposit(amountToDeposit);
                System.out.println("Amount is deposited successfully.");
            }
            else if(choice == 3){
                System.out.print("Enter the amount to be withdrawn :");
                double amountToWithdraw = in.nextInt();
                if(account.withdraw(amountToWithdraw)){
                    System.out.println("Amount is withdrawn successfully.");
                }
                else{
                    System.out.println("You have insufficient amount.");
                }
            }
            else if(choice == 4){
                System.out.println("Thank you for using the ATM.");
                return;
            }
            else{
                System.out.println("You have entered a invalid choice.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        UserAccount userAccount = new UserAccount();
        userAccount.setBalance(10000);
        ATM atm = new ATM(userAccount);
        atm.ATMchoices();
    }
}