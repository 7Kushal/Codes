package BinarySearch;

public class kthelementinthemergedsorted {
    public static void main(String[] args) {
        
        int[] a = {2,3,}

    }

    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        int[] temp = new int[n+m];
        int i = 0;
        int j = 0;
        int start = 0; 
        while(i<n && j < m){
            
            if(arr1[i]<=arr2[j])
            temp[start++]=arr1[i++];
            else
            temp[start++]=arr2[j++];
        }
        
        while(i<n)
        temp[start++]=arr1[i++];
        while(j<m)
        temp[start++]=arr2[j++];
        
        
        return temp[k-1];
    }
    
}
