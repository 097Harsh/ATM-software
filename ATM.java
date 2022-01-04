import java.util.Scanner;
public class ATM
{
    public static void main(String args[])
    {
        int balance = 100000, withdraw, deposite;
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("***** ATM *****");
            System.out.println("Withdraw");
            System.out.println("Deposite");
            System.out.println("Check balanace");
            System.out.println("Exit");
            System.out.println("Choose your operation you want to perform:");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter money to be withdraw:");
                    withdraw = sc.nextInt();
                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        System.out.println("Insufficient balance");
                    }
                    System.out.println("");
                    
                    break;
                    case 2:
                        System.out.println("Enter money to be deposite:");
                        deposite = sc.nextInt();
                        balance = balance + deposite;
                        System.out.println("Your money has been succesfully deposited");
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("Balance : "+balance);
                        System.out.println("");
                        break;
                        case 4:
                        System.exit(0);
            }
        }
    }
}