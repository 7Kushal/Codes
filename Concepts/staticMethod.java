package Codes.Concepts;
public class staticMethod {
    public static void main(String[] args) throws ClassNotFoundException{
        
         System.out.println("Hi");
         Class.forName("InnerstaticMethod");
    }
}

/**
 * InnerstaticMethod
 */
class InnerstaticMethod {

    static String name;
    static{
            name = "kushal";
            System.out.println("In static block");
    }

}
