import java.util.Scanner;
public class BubbleSort
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String[] arr = {"Manas", "Arun", "Bharath", "Safwaan"};
        //start ascending
        for(int i=0; i < arr.length-1; i++){
            for(int j=0; j < arr.length-1-i; j++){
                if(arr[j].compareTo(arr[j+1]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int x=0; x<arr.length; x++){
            System.out.print(arr[x] + " ");
        }
        System.out.println("");
        //start decending
        for(int i=0; i < arr.length-1; i++){
            for(int j=0; j < arr.length-1-i; j++){
                if(arr[j].compareTo(arr[j+1]) < 0){
                    String temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int x=0; x<arr.length; x++){
            System.out.print(arr[x] + " ");
        }
    }
}
