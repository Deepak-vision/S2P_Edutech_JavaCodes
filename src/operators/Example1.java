package operators;
public class Example1 {

        public static void main(String[] args) {

            byte lbNum  = 12;
            short lsNum = 130;
            int lnNum   = 2200;
            long llNum  = 1000000L;
            long llSum;
            char lcChar = 'A';


            int lnSum   = lbNum + lsNum;
            System.out.println(lnSum);

            lnSum  = lsNum + lnNum;
            System.out.println(lnSum);

            lnSum = lnNum + 12000;
            System.out.println(lnSum);

            llSum = lnNum + 1234567L;
            System.out.println(llSum);

            lnSum = lcChar + 5;
            System.out.println(lnSum);
        }
    }

