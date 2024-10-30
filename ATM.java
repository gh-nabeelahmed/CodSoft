import java.util.Scanner;

class UserBankAccount{
    int amount;
    UserBankAccount(int amount){
        this.amount = amount;
    }

    public void deposit(int amount) {
        this.amount += amount;
        System.out.println("AMOUNT DEPOSITED!");
    }

    public void withdraw(int amount) {
        if(amount <= this.amount){
            this.amount -= amount;
            System.out.println("AMOUNT WITHDRAWN!");
        }else{
            System.out.println("INSUFFICIENT BALANCE!");
            System.out.println("Balance : " + this.amount);
        }
    }

    public int checkBalance() {
        return this.amount;
    }
}

public class ATM {
    public static void main(String[] args) {
        int amount;
        int balance;
        boolean condition = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to start:");
        amount = sc.nextInt();
        UserBankAccount user1 = new UserBankAccount(amount);
        while(condition){
            System.out.println("Enter the operation to perform:");
            System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter amount to deposit:");
                    amount = sc.nextInt();
                    user1.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    amount = sc.nextInt();
                    user1.withdraw(amount);
                    break;
                case 3:
                    balance = user1.checkBalance();
                    System.out.println("Available Balance : " + balance);
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
            boolean tryCondition = true;
            while(tryCondition) {
                System.out.println("Try Again(0 to No/1 to Yes)?");
                int condNum = sc.nextInt();
                if(condNum == 0){
                    System.out.println("Thankyou!");
                    condition = false;
                    break;
                }
                else if(condNum != 1)
                    System.out.println("Invalid Number...\n");
                else
                    break;
            }
        }
    }
}
