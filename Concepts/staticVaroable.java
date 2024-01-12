package Codes.Concepts;
class mobile{
        int price;
        static String name =" smart";
        void print(){
            System.out.println(price +"  "+ name);
        }
}

public class staticVaroable {
    public static void main(String[] args) {
        /*
         * basically static varible means only one varible per class
         * if it is changed it will affect all the other objects as 
         * well
         */

         mobile m1 = new mobile();
         m1.price = 10;
         m1.print();
         mobile m2 = new mobile();
         mobile.name = "dumb"; // static variable should be accessed with class name 
         
         m1.print();
         m2.print();
    }
    
}
