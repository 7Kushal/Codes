public class DutchNationalFlagAlgo {
    public static void main(String[] args) {
        // used to solve arrange 0,1,2 in order 
        int[] arr = {1,1,1,2,0,0,0,2,1};
        dnfa(arr,9);
        System.out.println(Arrays.toString(arr));
    }

    public static void dnfa(int[] arr, int n){
        int low = 0;
        int mid =0;
        int high = n-1;
        
        while(mid <=high){ // till we have an unsorted section 
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
         else if(arr[mid]==1){
               mid++;
            }
          else{
              swap(arr,mid,high);
              high--;
          }
        }

    }
    public static swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    }
}
