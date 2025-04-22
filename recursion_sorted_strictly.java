

public class recursion_sorted_strictly{
    public static boolean sorted(int arr[], int indx){
        if(indx==arr.length-1){
            return true;

        }
        if(arr[indx]<arr[indx+1]){
            return sorted(arr,indx+1);
        }
        else{
            return false;
        }
    }
    public static void main(String [] args){
        int arr[]={1,3,4};
        System.out.println(sorted(arr,0));
    }
}