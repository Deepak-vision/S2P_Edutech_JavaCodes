package loops;
import java.util.Scanner;
public class Count_Digits_While_loop {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int lnInt1 = sh.nextInt();

        int count =0;
        while(lnInt1 !=0)
        {
            count++;
            lnInt1 = lnInt1/10;
        }
        System.out.println("Total Digits :"+count);
    }
}

