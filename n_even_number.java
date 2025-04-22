import java.util.Scanner;
public class n_even_number{

    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:-  ");
        int num=sc.nextInt();

        for(int i=0;i<=num;i++){

            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}