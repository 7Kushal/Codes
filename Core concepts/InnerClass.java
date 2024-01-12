package Codes.Concepts;
/*
 * 
 * Only inner class can be static 
 * 
 */

public class InnerClass {
    
    public static void main(String[] args) {
        A objA = new A();
        A.B objB = objA.new B();
        objA.show();
        objB.showB();
    }

}

class A {
    void show (){
        System.out.println("Inside A class");
    }
    class B {
         void showB (){
            System.out.println("Inside B class");
         }
    }
}
