/*
 * A football tournament has just been conducted and it is your job to find out the player with the highest ranking.
 * You are given two sequences A1, A2, …, AN and B1, B2, …, BN. For each valid i, player i scored Ai goals and committed Bi fouls.
 * For each goal, the player that scored it gets 20 points, and for each foul, 10 points are deducted from the player that committed it.
 * However, if the resulting number of points of some player is negative, this player will be considered to have 0 points instead.
 * 
 * 
    SAMPLE INPUT
    
    1
    2
    3 1
    1 1

    SAMPLE OUTPUT: 50

 */
import java.util.*;
public class Football
{
  public static void main(){
      Scanner sc = new Scanner(System.in);
      int T = Integer.parseInt(sc.nextLine());
      for(int a=0; a < T; a++){
          int N = Integer.parseInt(sc.nextLine());
          int scores[] = new int[N];
          for(int b=0; b < N; b++){
              String[] buffer = sc.nextLine().split(" ");
              int goals = Integer.parseInt(buffer[0]);
              int fouls = Integer.parseInt(buffer[1]);
              int score = (goals*20) - (fouls*10);
              scores[b] = score;
          }
          int max = 0;
          for(int i=0; i<scores.length;i++){
            if(scores[i] > max) max = scores[i];
          }
          System.out.println(max);
      }
  }
}