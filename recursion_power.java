public class recursion_power{
    public static int printpow(int x,int n){
if(n==0){
    return 1;
}
if(x==0){
    return 0;
}
        int pownm1=printpow(x,n-1);
        int newpow=x*pownm1;
        return newpow;
    }
    public static void main(String [] args){
        int x=2,n=5;
       System.out.println(printpow(x,n));
    }
}