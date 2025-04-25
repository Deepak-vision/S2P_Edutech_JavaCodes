package Methods;

public class Example13 {

     public static int[][] matrixAddition(int[][] matrixA, int[][] matrixB) {

        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

     public static int [][] printMatrixAddition(int [][]matrix){
            System.out.println("Result of Matrix Addition:");
            for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
            System.out.println("-----------------------");
            return matrix;
}
        public static void main(String[] args) {

            // Matrix 1
            int[][] matrix1 = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            // Matrix 2
            int[][] matrix2 = {
                    {9, 8, 7},
                    {6, 5, 4},
                    {3, 2, 1}
            };

            int[][] matrix3 = {
                    {2, 3, 4},
                    {5, 6, 7},
                    {8, 9, 10}
            };

            // Matrix to store the sum
            int [][] result1 = matrixAddition(matrix1,matrix2);
            int [][] result2 = matrixAddition(matrix1,matrix3);
            printMatrixAddition(result1);
            printMatrixAddition(result2);

        }
    }






