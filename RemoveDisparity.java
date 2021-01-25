/*
 * You're given 2 positive integers A, and B. You can then apply the following operation any number of times:

    Choose an arbitrary positive integer D.
    Perform exactly one of the following actions:
    add D to A, add D−1 to B   or
    add D−1 to A, add D to B

 * Is it possible after applying this operation any number of times, that you can achieve a state where A=B
 */
import java.util.Scanner;
public class RemoveDisparity
{
  public static void main(){
    Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        int D = 20;
    for(int i=0; i < T; i++){
        String[] buffer = sc.nextLine().split(" ");
        int a = Integer.parseInt(buffer[0]);
        int b = Integer.parseInt(buffer[1]);
        System.out.println("YES");
    }
  }
}