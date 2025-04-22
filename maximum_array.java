import java.util.Scanner;
public class maximum_array{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];
        for(int i=0;i<number.length;i++){
            number[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){

        if(number[i]<min){
            //System.out.print("number is max to max : "+ i);
           min=number[i];
        }
        if(number[i]>max){
           // System.out.print("number is min to min : "+i);
           max=number[i];
        }
        
            }
            System.out.println("number is max : "+max);
            System.out.println("number is min : "+min);
}
}