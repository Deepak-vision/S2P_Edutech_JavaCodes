package Methods;

public class Example9 {
    public static void countsDigits(int num) {

        int num1 = num;
        int original1 = num1;
        int count1 = 0;
        while (num1 != 0) {
            count1++;
            num1 /= 10;
        }
        System.out.println("Number: " + original1 + ", Digit Count: " + count1);

        System.out.println("-----------------------------");
    }


        public static void main(String[] args) {
        countsDigits(12345);
        countsDigits(9);
        countsDigits(10001);
        countsDigits(786);




        }
    }
