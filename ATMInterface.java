package atmaccount;
import java.util.Scanner;

public class ATMInterface{
    Scanner sc = new Scanner(System.in);
    private  int balance = 1000;
    public void withdraw(){
        System.out.println("Enter the amount you want to Withdraw :");
        int amount = sc.nextInt();
        if(balance < amount){
            System.out.println("\n Insuffecient Balance.");
        }
        else{
            balance -= amount;
            System.out.println("\n Withdraw Successfull");
        }
        
    }
    public void deposit(){
            System.out.println("Enter Amount to deposit:");
            int deposit = sc.nextInt();
            balance+=deposit;
            System.out.println("\n Deposit Successful.");
        }
        public void checkbalance(){
            System.out.println("Balance is : "+balance+"\n");
        }
    }

    
