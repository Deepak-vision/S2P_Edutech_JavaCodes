package Methods;
public class Example6 {

    public static void printRange(int start, int end) {
        System.out.println("Counting from 1 to 10:");
        for (int i = start; i <= end; i++) {
            System.out.println("Number: " + i);
        }
        System.out.println("-----------------------------");
    }
        public static void main(String[] args) {

            printRange(1,10);
            printRange(10,20);
            printRange(20,30);
            printRange(30,40);
            printRange(40,50);
        }
    }

