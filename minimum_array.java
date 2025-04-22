import java.util.Scanner;
public class minimum_array{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

            int size=sc.nextInt();
            int number[]=new int[size];

            for(int i=0;i<number.length;i++){

                number[i]=sc.nextInt();

            }
            int min=Integer.MAX_VALUE;
            for(int i=0;i<number.length;i++){

                if(number[i]<min){
                   min=number[i];
                }
            }
            System.out.print("the mimimum value is : "+min);
        }
    }

