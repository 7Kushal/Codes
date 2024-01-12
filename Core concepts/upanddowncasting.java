package Codes.Concepts;
public class upanddowncasting {

    public static void main(String[] args) {
        
        A obj = new B(); // this is upcasting so obj will have methods of A as well
        obj.showA(); // but here showB() won't work as we are upcasting to A class 

        // B obj1 = obj; // this will also not work as we cannot refer to diff object which is upcasted ==> A don't B
        // if you create an variable or object of A it cannot use B methods 
        B obj1 = (B)obj; // here downcast will work

        obj1.showB(); 
        // So basically casting and downcasting work when class are linked 
        obj1.showA(); // this will also work as B extends A, 
    }

}
class A {
    void showA(){
        System.out.println("Showing from A");
    }
}
class B extends A{
    void showB(){
        System.out.println("Showing from B");
    }
}