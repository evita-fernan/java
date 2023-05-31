package Exercises15to21;
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int [] vector = new int[100];
        int j = 1;
        for(int i=0; i<vector.length; i++){
            vector[i] = j;
            j++;
            if(i==0){
                System.out.print("[ " + vector[i]);
            }
            else if(i==99){
                System.out.print(vector[i] + " ]");
            }
            else System.out.print(" " + vector[i] + " ");
        }
    }
}
