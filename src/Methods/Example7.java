package Methods;

public class Example7 {
        public static void printTable(int num){
            System.out.println("Table of 2:");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + "*" + i + " = " + (num * i));
            }

            System.out.println("-----------------------------");

        }

        public static void main(String[] args) {

            printTable(2);
            printTable(3);
            printTable(4);
            printTable(5);
            printTable(6);
            printTable(7);



        }
    }

