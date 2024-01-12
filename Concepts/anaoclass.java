package Codes.Concepts;

class C{
    public void show(){
        System.out.println("IN class A");
    }
}

public class anaoclass {
    public static void main(String[] args) {
        System.out.println("Testing");
        C obj = new C();
        obj.show();

        // below is the anonymous defination of a class 
        // it means its an inner class of A
        C obj2= new C(){
            public void show(){
                System.out.println("Updated clas");
            }
        };

        obj2.show();
    }
}

