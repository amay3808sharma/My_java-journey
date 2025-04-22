public class get_bit_manipulation{
    public static void main(String []args){
        int n=7;
        int pos=4;
        int bitMask=1<<pos;
        if((bitMask & n)==0){
            System.out.print("number is zero");
        }
        else{
            System.out.print("number is one  ");
        }
    }
}