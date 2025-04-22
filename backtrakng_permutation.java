public class backtrakng_permutation{
    public static void permu(String str,String perm, int indx ){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
 char currchar=str.charAt(i);
 String newstr=str.substring(0,i)+str.substring(i+1);
 permu(newstr,perm+currchar,indx+1);
      }   
    }
    public static void main(String [] args){
      String str="ABC";
      permu(str,"",0);
    }
}