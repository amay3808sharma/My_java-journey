import java.util.Scanner;
public class recursion_sum_n_natural_number{
    public static void printsum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.print(sum);
            return;
        }
        sum+=i;
        printsum(i+1,n,sum);
        
    }
    public static void main(String [] args){
        printsum(1,5,0);
    }
}