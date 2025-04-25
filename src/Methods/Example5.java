package Methods;

public class Example5 {
        public static void performAddition(int a,int b) {
            System.out.println("Addition:");
            int addResult = a+b;
            System.out.println("Addition of "+a+" + "+b+" = "+addResult);
            System.out.println("-----------------------------");
        }
            public static void performSubtraction(int a, int b){
            System.out.println("Subtraction:");
            int subbResult = a-b;
            System.out.println("Subtraction of "+a+ " - " +b+ " = "+subbResult);
            System.out.println("----------------------------");
            }

            public static void performMultiplication(int a, int b) {
            System.out.println("Multiplication:");
            int mulResult = a * b;
            System.out.println("Multiplication of " + a + " * " + b + " = " +mulResult);
            System.out.println("----------------------------");
            }

            public static void performDivision(double a,double b) {
            System.out.println("Division:");
            if (b != 0) {
            double divisionResult = a % b;
            System.out.println("Division of " + a + "/" + b + " = " + divisionResult);
            } else {
            System.out.println("We cannot divide number by zero");
            }
            System.out.println("----------------------------");
    }

            public static void performModuloDivision(int a, int b){
            System.out.println("Modulo Division:");
            int moduloResult = a/b;
            System.out.println("Remainder of "+a+ "%" +b+ " = "+moduloResult);
            System.out.println("----------------------------");


        }
        public  static void performPower(long base,long exponent) {

            System.out.println("Power:");
            double powerResult = Math.pow(base, exponent);
            System.out.println("Power of Number "+base+ "^"+exponent +" = " +powerResult);
            System.out.println("-----------------------------");

        }
        public  static void performSquareRoot(long number) {
            System.out.println("Square Root:");
            double sqrtResult = Math.sqrt(number);
            System.out.println("Square Root of √"+number+ " = " +sqrtResult);
            System.out.println("-----------------------------");
}


        public static void main(String[] args) {

            performAddition(4,5);
            performSubtraction(10,8);
            performMultiplication(8,3);
            performDivision(4,0);
            performModuloDivision(4,20);
            performPower(2,3);
            performSquareRoot(64);


        }
    }

