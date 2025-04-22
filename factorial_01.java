public class factorial_01{
    public static int factorial(int n){
        if(n==0||n==1){
           // System.out.print(newfact);
            return 1;
        }
        int fact=factorial(n-1);
        int newfact=n*fact;
        return newfact;
    }
    public static void main (String [] args){
        int n=7;
        System.out.println(factorial(n));
    }
}