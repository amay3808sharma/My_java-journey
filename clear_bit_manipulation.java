public class clear_bit_manipulation{
    public static void main(String [] args)
{
    int n=5;
    int pos=2;
    int bitMask=1<<pos;
    int notBitmask= ~(bitMask);
    int newnumber=notBitmask &n;
    System.out.print(newnumber);


}}