package Methods;

public class Example10 {
    public static void calculateFactorial(int number){
        int num = number;
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Factorial of " + num + " is: " + result);

        System.out.println("-----------------------------");
    }
        public static void main(String[] args) {
        calculateFactorial(5);
        calculateFactorial(3);
        calculateFactorial(6);
        calculateFactorial(4);
        }
    }
