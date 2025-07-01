package operators;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args) {
        // 0 For Rock
        // 1 For Paper;
        // 2 For Scissors;

        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the Inputs 0 For Rock,1 For Paper ,2 For Scissors :");
        int userInput = sh.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput==computerInput){
            System.out.println("Draw.....");
        }
        else if (userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1){
            System.out.println("You Win.....");
            
        }
        else {
            System.out.println("Computer Win.....");
        }

        System.out.println("Computer Input :" +computerInput);


    }
}
