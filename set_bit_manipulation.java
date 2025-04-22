public class set_bit_manipulation{
   public static void main(String [] args){
    int n=5;
    int pos=3;
    int bitMask=0<<pos;
    int newnumber=bitMask| n;
    System.out.println(newnumber);
   }
}