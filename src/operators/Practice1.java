/*
        package operators;
import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        Scanner Sh = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int lIntnum1 = Sh.nextInt();

        if(lIntnum1 % 2 == 0)
        {
            System.out.println("Even no");
        }
            else {
            System.out.println("odd no");


        }}
  }

 */


       import java.util.Scanner;
       public class Practice1 {
           public static void main(String[] args) {

               Scanner input =new Scanner(System.in);
               System.out.println("Enter The Age:");
               short age = input.nextShort();
               if (age>0 && age<65) {
                   if (age >= 15 && age <= 30) {
                       System.out.println("You can Ride a Roller Coaster");
                   } else {
                       System.out.println("You cannot Ride Roller Coaster But you can Ride a taxi Game");
                   }
               }
                   else
                   {
                       System.out.println("Please Go Home Your Age Limit");
                   }
               }
           }
