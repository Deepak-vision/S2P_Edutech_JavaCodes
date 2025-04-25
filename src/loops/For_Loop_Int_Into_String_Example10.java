package loops;
import java.util.Scanner;
public class For_Loop_Int_Into_String_Example10 {
    public static void main(String[] args) {
        int x;
        String result=" ";
        int remainder=0;
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter The Number :");
        x = sh.nextInt();

        for (;x!=0;x/=10)
        {
            remainder = x%10;
            switch (remainder)
            {
                case 0:
                    result="zero"+result;
                    break;
                case 1:
                    result ="one"+result;
                    break;
                case 2:
                    result= "two"+result;
                    break;
                case 3:
                    result ="Three"+result;
                    break;
                case 4:
                    result="Four"+result;
                    break;
                case 5:
                    result="Five"+result;
                case 6:
                    result="Six"+result;
                    break;
                case 7:
                    result="Seven"+result;
                    break;
                case 8:
                    result="Eight"+result;
                    break;
                case 9:
                    result="Nine"+result;
                default:
            }

        }
        System.out.println(result);
    }
}
