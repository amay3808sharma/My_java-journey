public class recursion_factorial{
    public static int printfactorial(int n){
        if(n==1||n==0){
            return 1;
        }
        int fact=printfactorial(n-1);
        int newfact=n*fact;
        return newfact;
    }
public static void main(String [] args){
    int n=7;
   int ans= printfactorial(n);
   System.out.print(ans);
}
}