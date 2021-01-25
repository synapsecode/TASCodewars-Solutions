import java.util.*;
class Menu
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter 1 for first program or 2 for second program:");
       int n = sc.nextInt();
       switch(n){
           case 1:
              int sum = 0;
              boolean flag = true;
              for(int i=2; i<=20;i+=2){
              int z = 1;
              for(int j=1; j<=i;j++)
                z*=j;
              if(flag)
                sum+=z;
              else
                sum-=z;
              //reset flag
              flag = !(flag);
              }
              System.out.println("Sum = " + sum);
              break;
             
           case 2:
              System.out.println("Enter the value of x: ");
              int x = sc.nextInt();
              double s = 0.0;
              for(int i=2; i<=20; i+=3)
              s+=(double)(Math.pow(x, (i+1)) / i);
              System.out.println("Sum = " + s);
              break;
              
           default:
              System.out.println("Invalid Option");
        }
    }
}