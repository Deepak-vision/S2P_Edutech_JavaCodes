//public class datatypes1 {
//    public static void main(String[] args) {
//
//        // Variable Declaration
//        byte lbNum1;
//        short lsNum1;
//        int lnNum1;
//        long llNum1;
//
//        float lfNum1;
//        double ldNum1;
//
//        char cGrade;
//
//        boolean isPrime;
//
//        String sName;
//
//        // Variable Assignment
//        lbNum1 = 120;
//        lsNum1 = 32000;
//        lnNum1 = 330000;
//        llNum1 = 2000000000L;
//
//        lfNum1 = 12.1212121212121212121212f;
//        ldNum1 = 12.1212121212121212121212;
//
//        cGrade = 'A';
//        sName  = "Java Full Stack Means S2P";
//
//
//    }
//}
//
import java.util.Scanner;

public class datatypes1 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        String sName;
        String sLineAboutYou;

        // next() method is used to read single word from keyboard
        System.out.println("Hello, May I Know Your Name : ");
        sName = Input.next();

        // nextLine() method is used to read multiple words from keyboard
        System.out.println("Can You Describe Yourself In A Single Line");
        sLineAboutYou = Input.nextLine();

        System.out.println("Hello, " + sName);
        System.out.println("Wow That's Some Hard Stuff : " + sLineAboutYou);
    }
}


/*

* calculations are always performed in higher datatype
* operators are symbols which perform operations on data types
* raw data is converted to program or code by processing and then operators perform operations
and insights or results are found
*
 */