import java.util.Scanner;
public class array_index{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
            int size=sc.nextInt();
            int number[]=new int[size];
            for(int i=0;i<number.length;i++){
                number[i]=sc.nextInt();
                
            }
            int x=sc.nextInt();
            for(int i=0;i<number.length;i++){
                if(number[i]==x){
                System.out.println("x index number is : "+i);
            }
            }
            
            
            

        }
    }
