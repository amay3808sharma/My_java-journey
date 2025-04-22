public class selection_sort1{
   public static void printsort(int n[] ){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i] +" ");
        }
    }
    public static void main(String [] args){
        int n []={9,4,8,3,7,2,6,1};
        for(int i=0;i<n.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<n.length;j++){
                if(n[smallest]>n[j]){
                    smallest=j;

                }
            }
            int temp=n[smallest];
            n[smallest]=n[i];
            n[i]=temp;
        }
       printsort(n);
    } 
}


   
    
    

  
