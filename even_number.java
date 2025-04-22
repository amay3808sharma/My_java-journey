import java.util.Scanner;

public class even_number{
    public static void main(String arg[]){
        Scanner Sc = new Scanner(System.in);
        int num=Sc.nextInt();
        if(num%2==0){
            System.out.println("number is even");
        }
        
            
        else {
            System.out.println("number is odd");
        }


    }
}