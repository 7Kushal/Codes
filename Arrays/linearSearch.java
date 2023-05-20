public class linearSearch {
    public static void main(String[] args) {
        // LS is Binary Search 
        // O(log(n)) TC
        
    }
    static int BS(int[] arr, int start, int end, int target){
        int mid = (end-start)/2+start;
        if(start>=end)
        return -1;
        if(arr[mid]<target){
            return BS(arr, mid+1, end, target);
        }
        else if(arr[mid]>target){
            return BS(arr, start, mid, target);
        }
        return 1;
    }
}
