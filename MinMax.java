import java.util.Scanner;
public class MinMax
{
  public static void main(){
    Scanner sc = new Scanner(System.in);
    int T = Integer.parseInt(sc.nextLine());
    for(int a=0; a < T; a++){
        int N = Integer.parseInt(sc.nextLine());
        String[] buffer = sc.nextLine().split(" ");
        int arr[] = new int[N];
        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(buffer[i]); //Fill Array
        int max=0, min=99999999;
        for(int i=0; i<arr.length;i++){
          int sum = 0;
          for(int j=0; j<arr.length;j++){
              if(j==i) continue;
              sum+=arr[j];
          }
          if(sum<min) min=sum;
          if(sum>max) max=sum;
        }
        System.out.println(min + " " + max);
    }
  }
}