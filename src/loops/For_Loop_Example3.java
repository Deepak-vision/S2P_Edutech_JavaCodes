package loops;
import java.util.Scanner;
public class For_Loop_Example3 {
    public static void main(String[] args) {
        int nStartPoint;
        int nEndPoints;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Start point :");
        nStartPoint= input.nextInt();
        System.out.println("Enter the End Point: ");
        nEndPoints = input.nextInt();
        System.out.println("Print Even Numbers:");
        for (int i= nStartPoint; i<=nEndPoints;i++)
        {

            if ( i%2 == 0)
            {
                System.out.println(i);
            }
        }
    }
}
