import java.util.Scanner;
public class PigLatin
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine().trim() + " ";
        String encoded = "";
        boolean flag = false;
        //get each word
        int prevspace = 0;
        for(int i=0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                String word = s.substring(prevspace, i).trim();
                //System.out.println("w:  " + word);
                prevspace = i;
                //pig latin
                for(int j = 0; j < word.length(); j++){
                    char x = Character.toUpperCase(word.charAt(j));
                    if( x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U'){
                        //System.out.println("wx:  " + (word.substring(j, word.length()-1) + word.substring(0, j) + "ay") + " ");
                        encoded += (word.substring(j) + word.substring(0, j) + "ay") + " ";
                        flag = true;
                        break;
                    }else flag=false;
                }
                if(!flag){
                   encoded += word + " "; 
                }
            }
        }
        System.out.println(encoded);
    }
}
