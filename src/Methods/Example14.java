package Methods;

public class Example14 {
    public static int [][] multiplyMatrix(int[][]matrix1,int[][] matrix2) {
        int[][] result = new int[2][2];
            for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
    public static int[][] matrixMultiplication(int[][]matrix) {
        System.out.println("Result of Matrix Multiplication:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
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
                    {1, 2},
                    {3, 4}
            };

            // Matrix 2
            int[][] matrix2 = {
                    {5, 6},
                    {7, 8}
            };
            int [][]result =new int[2][2];
            // Matrix 3
            int[][] matrix3 = {
                    {2, 3},
                    {4, 5}


            };

            int[][] result1 = multiplyMatrix(matrix1,matrix2);
            matrixMultiplication(result1);
            int [][] result2= multiplyMatrix(matrix1,matrix3);
            matrixMultiplication(result2);
        }
}
