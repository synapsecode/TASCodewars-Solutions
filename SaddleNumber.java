import java.util.Scanner;
public class SaddleNumber
{
   public static void main(){
       Scanner sc = new Scanner(System.in);
       /*
       System.out.println("Enter the dimensions of the first matrix (row, column): ");
       int r = sc.nextInt();
       int c = sc.nextInt();
       */
       
       //int A[][] = new int[r][c];
       int r=3; int c=3;
       int A[][] = {{10, 6, 13}, {30, 1, 17}, {16, 5, 10}};
       boolean flag=false;
       //Entering Data
       /*
       System.out.println("Enter the Elements of A");
       for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                A[i][j] = sc.nextInt();
            }
       }
       */
       for(int i=0; i<r; i++){
           for(int j=0; j<c; j++){
               System.out.print(A[i][j] + " ");
           }
           System.out.println(" ");
       }
       System.out.println(" ");
       //Perform Operation
       int l = 99999;
       int h = 0;
       int lloc=0;
       int hloc = 0;
       for(int i=0; i<r; i++){
           l=99999;
           h=0;
           //find smallest in row
           for(int j=0; j<r; j++){
               if(A[i][j] < l){
                   l=A[i][j];
                   lloc=j;
               }
           }
           //System.out.println("Smallest in row: " + i + " is " + l);
           //lock j value and loop through new i;
           for(int x=0; x<r; x++){
               int z = A[x][lloc];
               if(z>h){
                   h=z;
                   hloc=x;
               }
           }
           //System.out.println("Largest in column: " + lloc + " is " + h);
           
           if(h==l){
               flag=true;
               break;
           }
       }
       if(flag){
           System.out.println("Saddle Number is " + h + " at (" + hloc + "," + lloc + ")");
       }else{
           System.out.println("No Saddle Number could be found");
       }
   }
}
