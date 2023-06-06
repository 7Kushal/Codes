package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {

        //Hashing is an way to precompute data which is reusable 
        // Precompute it and fetch it later 

        // example we want to print number of occurance of an char in a string 
        // we can do it 

       

        int[] hash = new int[256]; // becoz there are 256 char in ASCII table 

        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();

         // precompute 
        for(int i = 0; i < s.length();i++){
            hash[s.charAt(i)]++;
        }
        // Fetch
        System.out.println(Arrays.toString(hash));

        // we could have done this in O(Q x N) TC which is expensive
    }
}
