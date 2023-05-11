package Basic.Collections;
import java.util.*;

public class All {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<Integer> a = new ArrayList<>();

        // basically all the collections framwork datatypes and ds have some common functions like : -
        // add ( DATA of defined type ) ;
        // remove( DATA ) it will bascially remove first occurance of that data in the ds
        // removeAll( DATA ) similer to remove but it remove all occurances 
        // size() output the length of DS
        // contains(Object element) its an boolean and return true if value is present
        // containsAll( Collection <> ) also boolean and checks if an collections is present or not 
        // public Iterator iterator() -- we define it to iterate over an collection
        // isEmpty()
        // equals(Object element) it matches two collecitons
        // clear()	It removes the total number of elements from the collection.
        // addAll(Collection); used to add an collection in invoking collection.

        a.add(5);
        for (Integer integer : a) {
            System.out.println(integer);
        }

        a.clear();
        System.out.println("Length of arraylist is:-  " + a.size());
        for (Integer integer : a) {
            System.out.println(integer + " size of arraylist is:-  " + a.size());
        }
        a.add(10);
        a.add(20);

        // checking addAll() method over it is used to add an existing 
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(13);

        a.addAll(l1);

        System.out.println(a.size()+"\n");
        for (Integer integer : a) {
            System.out.println(integer);
        }

        System.out.println();

        // we can use iterator to iterate over an collection
        // we use hasNext() to check if an element is present and next() to print it.

        Iterator<Integer> iterator =  a.iterator(); // needs for every collection

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // -----------------------------------------------------------------------------------

        // contains ()
        System.out.println(a.containsAll(l1)); // for a collection

        System.out.println(a.contains(10)); // for a element of that collection

        // isEmpty()
        System.out.println(a.isEmpty());

        // equals 
        ArrayList<Integer> b = new ArrayList<>();
        b.add(10);
        b.add(20);
        b.add(10);
        b.add(20);
        b.add(13);

        System.out.println(a.equals(b));

        // -----------------------------------------------------------------------------------

        // In similer way we can use them on all other collections 
        
    }
}
