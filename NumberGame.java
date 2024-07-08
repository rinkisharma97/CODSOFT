package guessgame;
import java.util.Random;
import java.util.Scanner;
public class NumberGame{
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            Random rand = new Random();
            int answer = rand.nextInt(100-1)+1;
            int i;
            int k = 5;
            int guess;

            System.out.println("Enter a number between 1 and 100:");
            for ( i = 0;i < k; i++){
                    System.out.println("Guess the number:");
                    guess = sc.nextInt();
                    
                    if(answer == guess){
                        System.out.println("Congratulations a number you guessed is correct");
                        break;
                    }
                    else if (answer > guess && i!= k-1){
                        System.out.println("the number you guessed is too low" + guess);
                    }
                    else if (answer < guess && i!= k-1){
                        System.out.println("the number you guessed is too high" + guess);
                    }
                }
                // if the attempts to guess a number are over
                if (i==k){
                    System.out.println("number or attempts are over to guess a number");
                
            }
        }
        
    }
}
