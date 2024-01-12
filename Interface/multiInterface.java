package Codes.Interface;

/*
 * An interface extends other interface 
 * An class implements an interface 
 * class extends other other 
 * A class can implements multiple interface
 */
public class multiInterface {
    public static void main(String[] args) {
        
        c1 obj1 = new c1();
        obj1.show();
        obj1.show2();
        obj1.show3();

    }
}

/**
 * InnermultiInterface
 */
public interface InnermultiInterface {
    void show();
}
/**
 * InnermultiInterface_1
 */
public interface InnermultiInterface_1 extends InnermultiInterface {
    void show2();
}

class c1 implements InnermultiInterface_1, InnermultiInterface_2{

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("In show method");
        // throw new UnsupportedOperationException("Unimplemented method 'show'");
    }

    @Override
    public void show2() {
        // TODO Auto-generated method stub
        System.out.println("In show B method");
        // throw new UnsupportedOperationException("Unimplemented method 'show2'");
    }

    @Override
    public void show3() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'show3'");
    }
        
}

/**
 * InnermultiInterface_2
 */
public interface InnermultiInterface_2 {
    void show3();
}