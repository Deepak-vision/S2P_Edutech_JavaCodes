package Methods;

public class Example12 {
   public static void printArrayInOrder(int []arr) {
       System.out.println("\n\n\nPrinting arr from Left to Right:");
       for (int e : arr) {
           System.out.print(e + " ");

       }
       System.out.println("\n-----------------------");
       System.out.println("printing arr From Right to left:");
       for (int i =arr.length-1;i>=0;i--){
           System.out.print(arr[i]+" ");

       }



   }

        public static void main(String[] args) {
           int[] arr1 = {10, 20, 30, 40, 50};
           int[] arr2 = {5, 15, 25, 35, 45, 55};

            printArrayInOrder(arr1);
            printArrayInOrder(arr2);



        }
    }

