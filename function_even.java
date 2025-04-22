import java.util.Scanner;
public class function_even{
public static int even(int n){
    
    if(n%2==0){
        System.out.print("number is even");
    }
    else{
        System.out.print("number is odd");
    }
    return 0;
}
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    even(n);

}
}