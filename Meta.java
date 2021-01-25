/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.Scanner;
class Meta {
    public static void main() throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
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


