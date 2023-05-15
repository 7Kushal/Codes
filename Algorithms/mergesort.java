import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,10,3,9};
        mergeSort(arr, 0, 5);
        System.out.println(Arrays.toString(arr));
    }


    public static void mergeSort(int[] arr , int l, int h){
        if(l>=h)return;
        int mid = (l-h)/2+l;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, h);
        merge(arr,l,mid,h);
    }

    public static void merge(int[] arr, int l, int m, int h){
        int[] temp = new int[h-l-1];
        int i = l;
        int j = mid+1;
        int t =0;
        while(i<=mid && j<=h){
            if(arr[i]<=arr[j])
            temp[t++]=arr[i++];
            temp[t++]=arr[j++];
        }

        while(i<=mid){
            temp[t++]=arr[i++];
        }
        
        while(j<=h){
            temp[t++]=arr[j++];
        }

        for(int k=0,p=l; p<=h;k++,p++)
        arr[p]=temp[k];
    }
}


