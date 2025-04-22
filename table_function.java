import java.util.Scanner;
public class table_function{
    public static void table(int n){
        int tab;
        
        for(int i=1;i<=10;i++){
           
            tab=i*n;
            System.out.println(tab);}
           

            return ;
    }
            
            public static void main(String[] args){

                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                table(n);
             
            }
        
    }

