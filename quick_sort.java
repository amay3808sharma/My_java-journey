public class quick_sort{
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]>pivot){
                i++;
                int temp=arr[i];
                arr[i]=pivot;
                pivot=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return 1;
    }
    public static void quicksort(int arr[],int low,int high){
        if(low<high){
        
   int pidex = partition(arr,low,high);
quicksort(arr,low,pidex-1);
quicksort(arr,pidex+1,high);
        }
    }
    public static void main(String [] args){
        int arr[]={4,2,6,8,3,9,5};
        int n=arr.length;
        quicksort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");

        }
        System.out.println();
    }
}