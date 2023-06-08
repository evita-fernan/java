package Exercises15to21;
import java.util.Scanner;
public class Exercise20 {
    public static void main(String[] args) {
        int n = checkMatrixSize();
        int [][] matrix = new int[n][n];
        completeMatrix(n, matrix);
        printMatrix(n, matrix);
        magicMatrix(n, matrix);
    }
    public static int checkMatrixSize(){
        int n;
        do {
            Scanner read = new Scanner(System.in);
            System.out.println("Ingrese el tamanio de la matriz que debe ser cuadrado");
            n = read.nextInt();
        } while (n != 3);
        return n;
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

    public static void magicMatrix (int n, int [][] matrix){
        int addRow = 0;
        int addCol = 0;
        int addDiag = 0;
        int addAntiDiag = 0;
        int counter = 0;
        boolean isMagic = true;
        for (int i = 0; i < matrix.length && isMagic != false; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                addRow+= matrix[i][j];
                addCol += matrix[j][i];
                if(i == j) {
                    addDiag += matrix[i][j];
                    addAntiDiag += matrix[i][n-1-i];
                }
            }
            if(addRow == addCol){
                counter++;
                if(counter == n){
                isMagic = true;
                }
                addRow = 0;
                addCol = 0;
            } else {
                isMagic = false;
            }
        }
        if(isMagic == true && (addDiag != addAntiDiag)){
            isMagic = false;
        }
        if(isMagic){
            System.out.println("La matriz es magica");
        } else {
            System.out.println("La matriz NO es magica");
        }
    }
}
