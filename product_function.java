import java.util.Scanner;
public class product_function{
    public static int product(int a,int b){
        int multiply=a*b;
        System.out.println(multiply);
        return multiply;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int multiply=product(a,b);
        System.out.println("the product of a and b is here:- "+multiply);

    }
}