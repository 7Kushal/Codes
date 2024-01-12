package Codes.Concepts;
public class p1 {

    public static void main(String[] args) {
        System.out.println("test"); 
        
        System.out.println(System.currentTimeMillis());
        String a = "names";
        String b = new String("homes");

        int[] nums = {1,2,3,4};
        /*
         * above are immutable strings 
         * we can use String builder and stringbuffer to create mutable string
         */

         StringBuffer sb = new StringBuffer("Kishal");
         sb.replace(1, 2, "u");
         System.out.println(sb.toString());
        
         sb.append(" ");
         for(int i : nums)
         sb.append(i+" ");

         System.out.println(sb);

        //  StringBuffer is thread safe but StringBuilder is not
        // that is the only diff in them
    }
}