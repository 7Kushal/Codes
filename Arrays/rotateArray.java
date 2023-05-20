public class rotateArray {
    public static void main(String[] args) {
        
        //requried an array to be rotated left with number of places 
        int[] arr  = {1,2,3,4,5};
        rotate(arr,n,k);

    }

    void rotate(int[] arr, int n , int k){

        k%=n;
        reverse(arr, 0, n-1); // It will rotate the entire array
        reverse(arr,0,k-1);
        reverse(arr, k, n-1); // complete left rotate

    }

    void reverse(int[] arr, int start, int end){
        while(start<end){
            int t = arr[start];
            arr[start]=arr[end];
            arr[end]=t;
            start++;
            end--;
        }
    }

}
