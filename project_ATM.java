import java.util.Scanner;
public class project_ATM{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" WELCOM TO MY ATM MACHINE");
       System.out.println("");
        System.out.println("");
        // System.out.println("");
       System.out.println("what you want to do.......??");
        System.out.println("");
       
       System.out.println("1> CHECK YOUR BALANCE");
        System.out.println("");
       System.out.println("2> WITHDRAWAL MONEY");
        System.out.println("");
         System.out.print("Enter Your Choice : ");
       int button=sc.nextInt();
        System.out.println();
       if(button==1||button==2){
       if(button==1){
       
        System.out.print("Enter Your Account number :- ");
         int account=sc.nextInt();
         System.out.println(" your balance is :-");

       }
       else if(button==2){
        System.out.print("Enter your Account number :-  ");
         int account=sc.nextInt();
          System.out.println();
         System.out.print("Enter Money & Enter :- ");
         int money=sc.nextInt();
          System.out.println();
         System.out.println("processing pls wait");
         System.out.println();
        System.out.println("Money is avilable you can tak");
        System.out.println();
        System.out.print("plz enter exit");

       }
      
         System.out.println();
    System.out.println();   
System.out.println("THANK YOU for Use My Machine ");
System.out.println();
System.out.println("plz give your Auspicious Feedbck ");
System.out.println();
System.out.print("plz give Rating between 1 to 5 : -");
int rating=sc.nextInt();
 System.out.println();


if(rating==1){
    System.out.println("average");
}
if(rating==2){
    System.out.println("good");
}
if(rating==3){
    System.out.println("very good");
}
if(rating==4){
    System.out.println("Great");
}
if(rating==5){
    System.out.println("Excellent");
}
       }
       else {
        System.out.println("Wrong Choice");
        System.out.println();
         System.out.println();

      

       }
    }
}

      
        

       
    