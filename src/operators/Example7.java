package operators;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lnlength;
        int lnbreath;
        int lnheight;

        System.out.println(" Enter length,breath and height of cubiod:");
        lnlength = sc.nextInt();
        lnbreath = sc.nextInt();
        lnheight = sc.nextInt();

        int volume = lnlength* lnbreath* lnheight;
        System.out.println("Volume of cubiod:"+ volume);
    }
}
