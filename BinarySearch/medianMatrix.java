public class medianMatrix {
    public static void main(String[] args) {
        
    }
    int median(int matrix[][], int R, int C) {
      
        int mindex = (R*C)/2;
        
        int start =1;
        int end = 3000;  // 10^9
        
        while(start<=end){
            int mid = (end-start)/2+start;
            int count =0;
            for(int i=0;i<R;i++){
                count = count+bs(matrix,0,C-1,mid,i);
            }
            
            if(count>mindex)
            end = mid -1;
            else 
            start=mid+1;
        }
        return start;
    }
    
    int bs (int[][] arr, int s, int e, int t, int row){
        int mid = (e-s)/2+s;
        
        if(s>e)
        return s;
        
        if(arr[row][mid]>t)
         return bs(arr,s,mid-1,t,row);
        
        else 
        return bs(arr,mid+1,e,t,row);
        
    }
}
