import java.util.Scanner;
public class Patterns
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter (1) for first pattern and (2) for second pattern: ");
        int op = sc.nextInt();
        switch(op){
            case 1:
                int k = 65;
                for(int i=1; i<=5; i++){
                    for(int j=1; j<=i; j++){
                        System.out.print((char)(k++) + "  ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                int x = 1;
                for(int i=1; i<=5; i++){
                    int z = x;
                    for(int j=1; j<=i; j++){
                        System.out.print(z + "  ");
                        z-=2;
                    }
                    System.out.println("");
                    x+=2;
                }
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
