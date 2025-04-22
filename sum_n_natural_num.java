import java.util.Scanner;

public class sum_n_natural_num{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.print(sum);

        


}
}