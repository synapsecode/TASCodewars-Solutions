import java.util.Scanner;
public class PrimeFactor
{
    public static void main(){
        int n = 66;
        int f=0;
        for(int x=1; x<=n; x++){
            int c = 0;
            for(int i=1; i<=x; i++){
                if(x%i==0){
                    c++;
                }
            }
            if(c==2)f++;
        }
        System.out.println(f);
        if(f==3)System.out.println("Sphenic number");
        else System.out.println("Not a sphenic number");
    }
}
