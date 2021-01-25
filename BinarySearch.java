import java.util.Scanner;
public class BinarySearch
{
  public static void main(){
      Scanner sc = new Scanner(System.in);
      int arr[] = {1, 45, 2, 90, 5, 3, 8, 91};
      int F=0, L=arr.length-1, M;
      boolean flag=false;
      //sort
      for(int i=0; i < arr.length-1; i++){
            for(int j=0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
       }
      System.out.print("Enter search element: ");
      int S = sc.nextInt();
      System.out.println("");
      //binary search
      while(F<=L){
          M=(F+L)/2;
          if(S == arr[M]){
              System.out.print("Element found at: " + M);
              flag=true;
              break;
          }
          if(S>arr[M]) F=M+1;
          else F=M-1;
      }
      if(!flag)
      System.out.print("Element not found");
  }
}
