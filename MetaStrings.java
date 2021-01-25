/*
 * You're given two strings, your task is to find out whether these strings are "meta" strings or not.
 * "Meta" strings are those which can be made equal swapping the positions of any 2 characters exactly
 * once in either one of the two strings. Equal strings are not considered "Meta" strings.
 */
import java.util.Scanner;
class MetaStrings{
    public static void main() throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int t = sc.nextInt();
        boolean meta = false;
        for(int i=1; i<=t; i++){
            meta = false;
            String buffer = sc1.nextLine();
            String s1 = buffer.split(" ")[0];
            String s2 = buffer.split(" ")[1];
            if(s1.compareTo(s2) != 0){
                for(int j=0; j<s1.length(); j++){
                    for(int k=j+1; k<s1.length(); k++){
                        String temp = s1.substring(0, j) + s1.charAt(k) + s1.substring(j+1, k) + s1.charAt(j) + s1.substring(k+1);
                        if(temp.compareTo(s2) == 0) meta = true;
                    }
                }
            }
        }
        if(meta == true) System.out.println("Meta");
        else System.out.println("Not Meta");
    }
}


