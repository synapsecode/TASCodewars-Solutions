import java.util.Scanner;
public class Capitalize
{
    String sent;
    String cap;
    int size;
    Capitalize(){
        sent = "";
        cap = "";
        size = 0;
    }
    void readsentence(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        sent = sc.nextLine().trim().toLowerCase() + " ";
    }
    void capfirstlast(){
        int prevspace = 0;
        for(int i=0; i < sent.length(); i++){
            if(sent.charAt(i) == ' '){
                String word = sent.substring(prevspace, i).trim();
                prevspace = i;
                if(word.length() == 1)word=Character.toUpperCase(word.charAt(0)) + "";
                else{
                    word = Character.toUpperCase(word.charAt(0)) + "" + word.substring(1, word.length()-1) + 
                    Character.toUpperCase(word.charAt(word.length()-1)) + "";
                }
                System.out.println(word);
            }
        }
    }
    public static void main(){
        Capitalize c = new Capitalize();
        c.readsentence();
        c.capfirstlast();
    }
}
