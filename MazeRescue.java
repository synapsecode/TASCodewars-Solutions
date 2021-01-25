/*
 * Aditeya is trapped in a maze. The command center sends him a string which helps him navigate the maze.
 * The string consists of the characters L, R, U, D denoting left, right, up and down respectively.
 * With each command Aditeya must traverse 1 unit distance in the respective direction.
 * For example if he is at (2, 0) and the command is L he will go to (1, 0).
Given Aditeya's initial co-ordinates, and the navigation string, output Aditeya’s final co-ordinates.

SAMPLE INPUT
1
0 0
LUU

SAMPLE OUTPUT
-1 2
 */

import java.util.Scanner;
public class MazeRescue
{
  public static void main(){
      Scanner sc = new Scanner(System.in);
      int T = Integer.parseInt(sc.nextLine());
      for(int a=0; a < T; a++){
          String buffer = sc.nextLine();
          int c1 = Integer.parseInt(buffer.split(" ")[0]);
          int c2 = Integer.parseInt(buffer.split(" ")[1]);
          String cmd = sc.nextLine();
          for(int i=0; i < cmd.length(); i++){
              char ch = Character.toUpperCase(cmd.charAt(i));
              if(ch=='U')c2++;
              else if(ch=='D')c2--;
              else if(ch=='L')c1--;
              else if(ch=='R')c1++;
          }
          System.out.println(c1 + " " + c2);
      }
  }
}