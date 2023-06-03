package Exercises15to21;

public class Exercise18 {
    public static void main(String[] args) {
        int n = 4;
        int[][] matrix = new int[n][n];
        int[][] transpMatrix = new int[n][n];
        completeRandomMatrix(n, matrix);
        System.out.println("La matriz aleatoria es: ");
        printMatrix(n, matrix);
        transposedMatrix(n, matrix, transpMatrix);
        System.out.println("La matriz transpuesta es: ");
        printMatrix(n, transpMatrix);
    }
    
    //funcion que completa un matriz con numeros aleatorios
    public static int[][] completeRandomMatrix(int n, int[][] matrix) {
        int min = 0;
        int max = 50;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //In the following formula we create a program that generates random numbers between a minimum and a maximum value
                matrix[i][j] = (int) ((Math.random() * ((max - min) + 1)) + min);
            }
        }
        return matrix;
    }

    //funcion que transpone una matriz
    public static int[][] transposedMatrix(int n, int[][] matrix, int[][] transpMatrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transpMatrix[i][j] = matrix[j][i];
            }
        }
        return transpMatrix;
    }

    //funcion que imprime una matriz
    public static void printMatrix(int n, int [][] matrix){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //In the following formula we create a program that generates random numbers between a minimum and a maximum value
                if (i == 0 && j == 0) {
                    System.out.print("[ " + matrix[i][j]);
                } else if ((i == (n - 1)) && (j == (n - 1))) {
                    System.out.print(matrix[i][j] + " ]");
                } else {
                    System.out.print(" " + matrix[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

}
