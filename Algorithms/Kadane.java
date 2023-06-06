package Algorithms;

public class Kadane {
    public static void main(String[] args) {
        
    }
    public static int Kadanee(int[] arr, int n){
        int sum =0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>max)
            max=sum;
            if(sum<0)
            sum=0;
        }
        return max;
    }
}
