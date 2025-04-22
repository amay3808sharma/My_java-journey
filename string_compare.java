import java.util.Scanner;
public class string_compare{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        String name1=sc.nextLine();
        String name2=sc.nextLine();
        if(name1.compareTo(name2)==0){
            System.out.print("stringd are equal ");

        }
        else{
            System.out.print("strings are not equal ");
        }
    }
}