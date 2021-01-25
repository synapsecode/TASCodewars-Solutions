import java.util.Scanner;
public class RepeatRemover
{
  public static void main(){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the word: ");
      String s = sc.next().trim();
      char cache = s.charAt(0);
      String w = cache + "";
      for(int i=0; i<s.length(); i++){
          char ch = s.charAt(i);
          if(ch == cache) continue;
          else{
              w+=ch + "";
              cache = ch;
          }
      }
      System.out.print(w + " ");
  }
}
