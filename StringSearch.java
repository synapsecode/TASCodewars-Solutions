/*
 * You’re given a string S with N characters, and another character X. You’re required to find
 * the total number of sub-strings in S which contain the character X, atleast once. 
 * Two substrings of S are considered to be different if their positions in S are different,
 * and substrings considered are continous in nature.
 * 
 * Example:
 * For S = 'abb', and X = 'b'
 abbc a ab abb abbc b bb bbc bc
 * The substrings possible are: 'a', 'b', 'b', 'ab', 'bb', and 'abb'.
 * Out of these 5 of these substrings contain the character 'b' atleast once.
 */

import java.util.Scanner;
class StringSearch{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int t = sc.nextInt();
        int count =0;
        for(int i=1; i<=t; i++){
            count = 0;
            int l = sc.nextInt();
            String buffer = sc1.nextLine();
            String s1 = buffer.split(" ")[0];
            char ch = buffer.split(" ")[1].charAt(0);
            
                for(int j=0; j<s1.length(); j++){
                    for(int k=j+1; k<=s1.length(); k++){
                        
                        if(charSearch(s1.substring(j, k), ch)) count++;
                    }
                }
                
                System.out.println(count);
            }
    }
    
    public static boolean charSearch(String str, char ch){
        boolean b = false;
        for(int i =0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                b = true;
                break;
            }
        }
        return b;
    }
}