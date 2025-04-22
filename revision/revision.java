public class revision{
    public static int countdigits(int num){
        int temp=num;
        int cunt=0;
        while(num>0){
            int ans=num%10;
            cunt=cunt+1;
            num=num/10;
          //  if(temp%ans==0){cunt=cunt+1;}
            


        }
        return cunt;
    }
    public static void main(String [] args){
        int num=131;
       System.out.println(countdigits(num));
    }
           
    
}