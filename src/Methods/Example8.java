package Methods;

public class Example8 {
public static void reverseNumber(int num) {

    // Reverse 1234
    int number1 = num;
    int reversed1 = 0;
    int original1 = number1;
    while (number1 != 0) {
        int digit = number1 % 10;
        reversed1 = reversed1 * 10 + digit;
        number1 /= 10;
    }
    System.out.println("Original: " + original1 + ", Reversed: " + reversed1);

    System.out.println("-----------------------------");
}


        public static void main(String[] args) {

         reverseNumber(1234);
         reverseNumber(9071);
         reverseNumber(560);
         reverseNumber(78900);

        }
    }

