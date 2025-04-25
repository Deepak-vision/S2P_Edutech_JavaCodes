package loops;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Count_For_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int j = input.nextInt();

        System.out.println("Counter from 0 to n values :");
        for (int i=0;i<=j;i++)
        {

            System.out.println(i);
        }
    }
}
