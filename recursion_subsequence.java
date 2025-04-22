public class recursion_subsequence{
    public static void subseq(String str,int indx,String newstring){
if(indx==str.length()){
    System.out.println(newstring);
    return;
}
      char currchar=str.charAt(indx);
      subseq( str,indx+1,newstring+currchar);
      subseq(str,indx+1,newstring);
    }
    public static void main(String [] args){
        String str="abc";
        
        subseq(str,0,"");
    }
}