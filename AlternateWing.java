import java.util.Scanner;
public class AlternateWing
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the subscript: ");
        int x = sc.nextInt();
        System.out.println();
        int X[][] = new int[x][x];
        //fill with 0
        for(int i=0; i<x; i++){
            for(int j=0; j<x; j++){
                X[i][j] = 0;
            }
        }
        //logic
        int k=0;
        for(int i=0; i<x; i++){
            X[i][i] = ++k;
            int n = i+1;
            while(n<x){
                X[n][i] = ++k;
                X[i][n] = ++k;
                n++;
            }
        }
        //display
        for(int i=0; i<x; i++){
            for(int j=0; j<x; j++){
                System.out.print(X[i][j] + "\t");
            }
            System.out.println();
            System.out.println();
        }
    }
}
