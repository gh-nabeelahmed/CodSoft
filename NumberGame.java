import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random ran = new Random();
        int randNum = 0;
        int guessNum = 0;
        int condNum;
        Scanner sc = new Scanner(System.in);
        boolean val = true;
        while(val){
            int i = 0;
            while(true){
                randNum = ran.nextInt(100);
                if (randNum != 0)
                    break;
            }
            System.out.println(randNum);
            for(i = 10;i > 0;i--){
                System.out.println("You have " + i + " chances!");
                System.out.print("Guess the number:");
                guessNum = sc.nextInt();
                if(randNum == guessNum){
                    System.out.println("You Have Guessed Correctly!");
                    break;
                }else if(guessNum < randNum && guessNum >= randNum - 10){
                    System.out.println("Close!But wrong guess");
                }else if(guessNum > randNum && guessNum <= randNum + 10){
                    System.out.println("Close!But wrong guess");
                }else if(guessNum < randNum){
                    System.out.println("Too Low");
                }else if(guessNum > randNum){
                    System.out.println("Too High");
                }
            }
            if(i == 0) {
                System.out.println("Out of chances!");
                System.out.println("Your Score: 0");
            }
            else{
                System.out.println("Number of chances taken: " + (11 - i));
                System.out.println("Your Score: " + ((11-(11 - i)) * 10));
            }
            boolean tryCondition = true;
            while(tryCondition){
                System.out.println("Try Again(0 to No/1 to Yes)?");
                condNum = sc.nextInt();
                if(condNum == 0){
                    System.out.println("Thankyou!");
                    val = false;
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
