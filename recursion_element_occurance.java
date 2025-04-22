

public class recursion_element_occurance{
    public static int first=-1;
    public static int last=-1;
    public static void element(String str,char element,int indx){
        if(indx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
     char currchar=str.charAt(indx);
     if(currchar==element){
        if(first==-1){

            first=indx;
        }
        else{
            last=indx;
        }
     }
     element(str,element,indx+1);


    }
    public static void main(String [] args){
        String str="abhay";
        element(str,'a',0);
    }
}