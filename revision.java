import java.util.Scanner;
public class revision{
  public static void permutation(String str,int indx,String newstring){
    String perm=str.charAt(indx);
    newstring=str+perm;
    permutation(newstring,0,perm);

  }
      
   }
  
    
   
    
   


  
