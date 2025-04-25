package String;

import java.security.spec.RSAOtherPrimeInfo;

public class Example1 {
    public static void main(String[] args) {
        int lnNum1 = 5;
        double lfNum1 = 23.323;
        boolean isEven = true;
        boolean isOdd = false;

        System.out.print("Hello JVM\t");
        System.out.print("This is Windows Platform\n");

        System.out.println("JavaCompiler Gives Byte Code");
        System.out.println("JVM Reads The Byte Code Line By Line And Executes On Target Platform");

        System.out.println(lnNum1);
        System.out.println(lfNum1);
        //Remember printf and string.format is same ;

        System.out.printf("Integer Number1 %d \n",lnNum1);
        System.out.printf("Float Number2  %f  \n",lfNum1);
        System.out.printf("Boolean Value %b \n",isEven);
        System.out.printf("Boolean value is  %b \n",isOdd);

        String FormatedString = String.format("lnNum1 : %d ,  lfNum1: % f,  isEven : %b ",lnNum1,lfNum1,isEven);
        System.out.println(FormatedString);

    }
}


//// practice
//public class Example1 {
//    public static void main(String[] args) {
//
//        int liNum = 12;
//        float LfNum = 1.2221f;
//        boolean isodd = true;
//        char chamar = 'a';
////        String FormatedString = String.format("liNum is %d",liNum);
////        System.out.println(FormatedString);
////        System.out.printf("int num is %d",liNum);
//        System.out.println("print to binary numer: " +chamar);
//
//    }
//}
