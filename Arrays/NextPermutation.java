import java.util.*;
public class NextPermutation {
    public static void main(String[] args) {
        
    }
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        // int smallest = arr[N-1];
        int i = N-2;
        
        while(i>=0 && arr[i]>=arr[i+1])
            i--;
        // int low = arr[i];
        if(i<0)
        Arrays.sort(arr);
        else{
            Arrays.sort(arr,i+1,N);
            for(int k = i+1;k<N;k++){
                if(arr[k]>arr[i]){
                    int temp = arr[k];
                    arr[k] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }
        List<Integer> l = new ArrayList<>();
        for(int p =0; p < N;p++){
            l.add(arr[p]);
        }
        
        return l;
    }
}
