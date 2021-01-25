import java.util.Scanner;
public class Anagram
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first word");
        String f = sc.next().trim().toUpperCase();
        System.out.println("Enter the second word");
        String s = sc.next().trim().toUpperCase();
        int fcount = 0;
        int scount = 0;
        
        if(f.length() != s.length())
            System.out.println("Not an Anagram");
        else{
            //find ASCII sum
            for(int i=0; i<f.length();i++)fcount += (int)f.charAt(i);
            for(int j=0; j<s.length();j++)scount += (int)s.charAt(j);
            
            if(fcount == scount)
                System.out.println("Anagram");
            else
                System.out.println("Not an Anagram");
        }
    }
}
