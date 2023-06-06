public class MooresVotingAlgo {
    public static void main(String[] args) {
        
    }
    static int majorityElement(int a[], int size)
    {
        // your code here
        // HASHING
        // Moores Voting Algorithm
        int fc=0;
        
        int count=1;
        int ele = a[0];
        
        for(int i=1;i<size;i++){
            
            if(count==0){
            ele = a[i];
            }
            if(a[i]==ele)
            count++;
            else {
                count--;
            }
            
        }
        
        if(count==0){
            return -1;
        }
        else{
            for(int j =0;j<size;j++){
                if(a[j]==ele)
                fc++;
            }
            if(fc>size/2)
            return ele;
            return -1;
        }
    }
}
