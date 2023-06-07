package Exercises15to21;
import java.util.Scanner;
public class Exercise19 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la matriz");
        int n = read.nextInt();
        int [][] matrix = new int[n][n];
        int [][] transpMatrix = new int [n][n];

        completeMatrix(n, matrix);
        System.out.println("La matriz ingresada es: ");
        printMatrix(n, matrix);
        transposedMatrix(n, matrix, transpMatrix);
        System.out.println("La matriz transpuesta es:");
        printMatrix(n, transpMatrix);
        antiSymmetric(n, matrix, transpMatrix);

    }
    public static int [][] completeMatrix(int n, int[][] matrix){
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el valor de la matriz en la posicion ("+i+","+j+")");
                matrix[i][j] = read.nextInt();
            }
        }
        return matrix;
    }
    public static void printMatrix(int n, int [][] matrix){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
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
    public static int[][] transposedMatrix(int n, int[][] matrix, int [][] transpMatrix){
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transpMatrix[i][j] = matrix[j][i];
            }
        }
        return transpMatrix;
    }
    public static void antiSymmetric(int n, int[][] matrix, int [][] transpMatrix){

    }
}
