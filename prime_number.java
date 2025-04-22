import java.util.Scanner;
public class prime_number{
    public static void prime(int n){
       for(int i=1;i<=n;i++){
      int count=n%i;
      if(count==2){
        System.out.println("number is prime");
      }
      else{
        System.out.println("number is not prime");
      }
       }
        
       
    }
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prime(n);
    }
}