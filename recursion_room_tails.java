public class recursion_room_tails{
    public static int tails(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertical=tails(n-m,m);
        int horizontal=tails(n-1,m);
        return vertical+horizontal;
    }
    public static void main(String [] args){
        int n=4,m=2;
        System.out.print(tails(n,m));
    }
}