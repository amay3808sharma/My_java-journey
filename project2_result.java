import java.util.Scanner;

public class project2_result{

    public static void main (String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("BOARD OF SECONDARY EDUCATION BHOPAL");
        System.out.print("hindi=" );
        int hindi=sc.nextInt();
        System.out.print("english=");
        int english=sc.nextInt();
        System.out.print("maths=");
        int maths=sc.nextInt();
         System.out.print("physics=");
        int physics=sc.nextInt();
         System.out.print("chemestry=");
        int chemestry=sc.nextInt();
       
      /* System.out.println( hindi);
         System.out.println(english);
          System.out.println(maths);
           System.out.println(physics);
            System.out.println(chemestry);*/
             
             int total=(hindi+english+maths+physics+chemestry);
              System.out.println("total=" +total);
              System.out.println(total/5);

              if(total>450){
                System.out.println("Congratulation you got A+ grade");
              }
              else if(total>350&&total<450){
                System.out.println("grade=A");
              }
              else if(total>300&&total<350){
                System.out.println("B+");
              }
              else if(total>250&&total<300){
                System.out.print("B");
              }
              else if(total>200&&total<250){
                System.out.print("C+");
              }
              else if(total>150&&total<200){
                System.out.println("C");
              }
              else{
                System.out.println("pass with 3rd Division");
              }
              System.out.println("Thank you ");

    }}