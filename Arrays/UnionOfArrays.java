public class UnionOfArrays {
    public static void main(String[] args) {
        
    }

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> a = new ArrayList<>();
        int i= 0;
        int j =0; 
        
        while(i<n && j < m){
          
         while(i+1<n && arr1[i]==arr1[i+1])
         i++;
         while(j+1<m && arr2[j]==arr2[j+1])
         j++;
         
         if(arr1[i]<arr2[j]){
            a.add(arr1[i++]);
         }
         else if(arr1[i]>arr2[j]){
            a.add(arr2[j++]);
         }
         else{
             a.add(arr1[i++]);
             j++;
         }
        
        }
        
        while(i<n){
            while(i+1<n && arr1[i]==arr1[i+1])
            i++;
            a.add(arr1[i++]);
            // i++;
        }
        
        while(j<m){
            while(j+1<m && arr2[j]==arr2[j+1])
            j++;
            a.add(arr2[j++]);
        }
        
        
        return a;
    }

}
