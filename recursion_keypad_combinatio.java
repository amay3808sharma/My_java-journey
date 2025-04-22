public class recursion_keypad_combinatio{
    public static String [] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void comb(String str,int indx,String combination){
if(indx==str.length()){
    System.out.println(combination);
    return;
}
        char currchar=str.charAt(indx);
       String mapping = keypad[currchar-'0'];
        for(int i=0;i<mapping.length();i++){
            comb(str,indx+1,combination+mapping.charAt(i));
        }
    }
    public static void main(String [] args){
        String str="23";
        comb(str,0,"");
    }
}