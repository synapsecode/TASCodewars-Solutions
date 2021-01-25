import java.util.Scanner;
public class CoinThief
{
  public static void main(){
    Scanner sc = new Scanner(System.in);
    int T = Integer.parseInt(sc.nextLine());
    boolean possible=false;
    for(int a=0; a < T; a++){
        int avg=0;
        int N = Integer.parseInt(sc.nextLine());
        String[] buffer = sc.nextLine().split(" ");
        int[] coins = new int[N];
        for(int i=0; i<N; i++){
            coins[i] = Integer.parseInt(buffer[i]);
            avg+=coins[i];
        }
        avg = avg/N; //Find Average
        for(int j=0; j<coins.length;j++){
            if(coins[j]==avg){
                possible=true;
                System.out.println(j); //Index of coin to steal.
            }
        }
        if(!possible) System.out.println("Impossible");
    }
  }
}