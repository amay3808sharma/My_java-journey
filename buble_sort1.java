public class buble_sort1{
    public static void sort(int n[]){
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] +" ");
            
        }
    }
        public static void main(String [] args){
            int n[]={9,7,5,6,8,2,1,3,4};
            for(int i=0;i<n.length-1;i++){
                for(int j=0;j<n.length-1-i;j++){
                    if(n[j]>n[j+1]){
                        int temp=n[j];
                        n[j]=n[j+1];
                        n[j+1]=temp;
                    }
                }

            }
            sort(n);
        }
    
}