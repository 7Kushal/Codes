import java.util.Arrays;
// Overall complexity is O(logn)  better than O(Nlog2N) which is of merge sort
public class quicksort {
    public static void main(String[] args) {
        

        int[] arr = {1,4,2,-10,8,20};
        quickSort(arr,0,5);
        System.out.println(Arrays.toString(arr));

    }
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low>=high)
        return;
        
        int p = partition(arr,low,high);
        quickSort(arr,low,p-1);
        quickSort(arr,p+1,high);
        
        
        
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int i = low;
        int j = high;
        
        int pivot = arr[low];
        
        while(i<=j){
            
            
            if(arr[i]>pivot && arr[j] < pivot)
            swap(arr,i,j);
            if(arr[i]<=pivot)
            i++;
            if(arr[j]>=pivot)
            j--;
            
            
        // while( arr[i]<=pivot && i+1<=high)
        // i++;
        // while(arr[j]>pivot && j-1>=low)
        // j--;
        // if(i<j)
        // swap(arr,i,j);
        
    }

        swap(arr,j,low);
        return j; // partition
        
    } 
    
    static void swap(int[] arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
