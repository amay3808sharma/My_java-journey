import java.util.Scanner;

public class conditons
{

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter your age  ");
    int a=sc.nextInt();
    if(a<18){
        System.out.println("you are not adult");
    }
    else{
        System.out.println("you are adult");
    }
    System.out.println("thank you");
 }
}