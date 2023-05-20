public class longestSubArrayWithSum {
    public static void main(String[] args) {
        
    }

    public static int longestSubarrayWithSumK(int []a, long K) {
        // Write your code here
        // Sliding Window way
 
        int sum = 0;
        int i = 0;
        int j = 0;
        int length =0;
        int n = a.length;
        
       while(j<n){

           sum +=a[j];
           if(sum == K ){
               length = Math.max(length, j-i+1);
               j++;
            //    System.out.println("Curr length = " + length + " i = " + i + " j = "+j);
           }

           else if(sum < K){
               
               
            //    System.out.println("Sum is below K " + sum);
               j++;
           }
           else if(sum >K){
               sum = sum - a[i++];
               while(sum>K){
                   sum = sum -a[i++];
               }
            //    System.out.println("Sum is above K " + sum);
               if(sum==K){
                   length=Math.max(length,j-i+1);
               }
               j++;
           }

        }
        return length;
    }

}
