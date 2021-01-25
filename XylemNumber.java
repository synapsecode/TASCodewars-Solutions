import java.util.Scanner;
public class XylemNumber
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n>99){
            String x = n + "";
            int extreme = Integer.parseInt(x.charAt(0) + "") + Integer.parseInt(x.charAt(x.length()-1) + "");
            int mean = 0;
            for(int i = 0; i < x.substring(1, x.length()-1).length(); i++){
                char z = x.substring(1, x.length()-1).charAt(i);
                mean += Integer.parseInt(z+"");
            }
            if(mean == extreme)
                System.out.println("Xylem Number");
            else
                System.out.println("Phloem Number");
        }else{
            System.out.println("Number is smaller than 100");
        }
    }
}
