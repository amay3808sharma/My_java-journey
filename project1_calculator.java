
import java.util.Scanner;
public class project1_calculator{
    public static void main (String agrs[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int operator=sc.nextInt();


        // 1=+(addition)
        // 2=-(substracton)
        // 3=*(multiply)
        // 4=/(division)
        // 5=%(module)

switch(operator){

    case 1: System.out.println(a+b);
    break;
    case 2: System.out.println(a-b);
    break;
    case 3: System.out.println(a*b);
    break;
    case 4: if(b==0){
        System.out.println("Error");
        System.out.println("Invali Divison");
    }
    else{
        System.out.println(a/b);
    }
    break;
    case 5: System.out.println(a%b);
    break;
}
    
System.out.println("thanks for use my calculator");
    }

}