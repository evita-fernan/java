package Exercises15to21;

public class Exercise18 {
    public static void main(String[] args) {
        int n = 4;
        int[][] matrix = new int[n][n];
        int[][] transpMatrix = new int[n][n];
        completeRandomMatrix(n, matrix);
        System.out.println("La matriz aleatoria es: ");


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

}
