package BinarySearch;

public class findnoinrotatedarray {
    public static void main(String[] args) {
        
    }

    static int search(int A[], int l, int h, int key)
    {       
        int mid = (h-l)/2+l;
      
       
        if(l>h)
        return -1;
        
         if(A[mid]==key)
        return mid;
        
        // we can only use BS in sorted array so we check wheather left half is sort or right is sort 
       
        if(A[l]<=A[mid]){
            // System.out.println(mid);
            if(A[l]<=key && A[mid] >= key)
            return search(A,l,mid-1,key);
            return search(A,mid+1,h,key);
        }
         // if left is not sort we will check right half with mid +1 as no sense in checking left 
        else{
            if(A[h]>=key && A[mid]<=key)
            return search(A,mid+1,h,key);
            return search(A,l,mid-1,key);
        }
        
    }

}
