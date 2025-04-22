
import java.util.HashSet;
public class recursion_subseq_hashset{
    public static void subseq(String str,int indx,String newstring,HashSet<String> set){
if(indx==str.length()){
    if(set.contains(newstring)){
        return;
    }
    else{
    System.out.println(newstring);
    set.add(newstring);
    return;
    }

}
        char currchar=str.charAt(indx);
        subseq(str,indx+1,newstring+currchar,set);
        subseq(str,indx+1,newstring,set);

    }
    public static void main(String [] args){
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        subseq(str,0,"",set);
    }
}