import java.util.Scanner;
public class LetterFrequency
{
   public static void main(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a word: ");
       String s = sc.next().trim().toLowerCase();
       String reduced = "";
       System.out.println("====================================");
       System.out.println("Alphabet\tFrequency");
       System.out.println("====================================");
       for(int i = 0; i < s.length(); i++){
           char x = s.charAt(i);
           boolean flag = false;
           int count = 0;
           //check for same letter
           for(int j=0; j < reduced.length(); j++){
               if(reduced.charAt(j) == x){
                   flag=true;
                   break;
               }
           }
           if(flag)continue;
           else{
               //count letters
               for(int k=0; k < s.length();k++){
                   if(s.charAt(k) == x)count++;
               }
               System.out.println(x + "\t\t" + count);
               flag=false;
           }
           reduced+=x+"";
       }
    }
}
