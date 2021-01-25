public class vectorfloyd
{
    public static void main(){
        //floyds skeleton
        boolean vector=true;
        int k=-1;
        for(int i=1; i<=20; i++){
            String s = "";
            for(int j=1; j<=i; j++){
                k=k+2;
                if(vector)
                    s+=k+" ";
                else
                    s=k+" "+s;
            }
            System.out.println(s);
            vector = !(vector);
        }
    }
}
