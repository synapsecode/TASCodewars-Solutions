import java.util.Scanner;
public class CyclicFill
{
    public static void main(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the value of n: ");
       int num = sc.nextInt();
       int lim = num*num;
       int n=0;
       int r=num; int c=num;
       int A[][] = new int[r][c];
       boolean moderator = true;
       int lrow=0;
       int lcol=0;
       //initialize to 0;
       for(int i=0; i<r; i++){
           for(int j=0; j<c; j++){
               A[i][j] = 0;
           }
       }
       
       //loop until broken
       while(n<lim){
           if(moderator){
               //go right
               for(int i=0; i<c; i++){
                   if(A[lrow][i]==0){
                       if(n<lim){
                           A[lrow][i] = ++n;
                           lcol=i;
                       }
                   }
               }
               //go down
               for(int i=0; i<r; i++){
                   if(A[i][lcol]==0){
                       if(n<lim){
                           A[i][lcol] = ++n;
                           lrow=i;
                       }
                   }
               }
               moderator = !(moderator);
           }else{
               //go left
               for(int i=lcol; i>=0; i--){
                   if(A[lrow][i]==0){
                       if(n<lim){
                           A[lrow][i] = ++n;
                           lcol=i;
                       }
                   }
               }
               //go up
               for(int i=lrow; i>=0; i--){
                   if(A[i][lcol]==0){
                       if(n<lim){
                           A[i][lcol] = ++n;
                           lrow=i;
                       }
                   }
               }
               moderator = !(moderator);
           }
       }
       
       //Print Matrix
       System.out.println("The Matrix looks like: ");
       System.out.println(" ");
       System.out.println(" ");
       
       for(int i=0; i<r; i++){
           for(int j=0; j<c; j++){
               System.out.print(A[i][j] + "\t");
           }
           System.out.println(" ");
           System.out.println(" ");
       }
    }
}
