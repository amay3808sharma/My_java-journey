import java.util.Scanner;
public class update_bit_manipulation{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=5;
        int pos=1;
        int bitMask=1<<pos;
        int oper=sc.nextInt();
        if(oper==1){
         int newnumber= bitMask | n;
         System.out.print(newnumber);
        }
        else{
            int newbitMask=~(bitMask);
            int newnumber=newbitMask & n;
            System.out.print(newnumber);
            
        }
        
        
    }
}