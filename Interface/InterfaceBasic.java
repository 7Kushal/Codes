package Codes.Interface;
public class InterfaceBasic {
    public static void main(String[] args) {
        a obj = new a();
        obj.show();
        // below we created obj1 reference to InnerInterfaceBasic but we create object of
        // class a
        InnerInterfaceBasic obj1 = new a();
        obj1.showb();
        System.out.println(InnerInterfaceBasic.data);
        System.out.println(InnerInterfaceBasic.notebook);
    }
}

/*
 * InnerInterfaceBasic
 */
public interface InnerInterfaceBasic {

    final static int data = 2017;
    final static String notebook = "Old data";

    void show();
    void showb();
}

class a implements InnerInterfaceBasic{

    @Override
    public void show() {
       System.out.println("Implemented show a function"); 
    }

    @Override
    public void showb() {
        System.out.println("Implemented show b function");
    }
    
}