package Codes.AbstractAndAnonymous;

public class basic {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        b objb = new b();
        objb.show(); // this will work fine

        A obj = new A() {
            public void show(){
                System.out.println("Implemented as inner anonymous class");
            }
        };

        obj.show();

        System.out.println(System.currentTimeMillis()- startTime);
    }
}

abstract class A{
        public abstract void show();
}

class b extends A{

    @Override
    public void show() {
        System.out.println("Implemented in b");
    }

}

