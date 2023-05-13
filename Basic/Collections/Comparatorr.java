package Basic.Collections;
import java.util.*;
public class Comparatorr {
    // we will use comparator on collections class, it is an interface so we can override its
    // method to manupulate according to our use 
    public static void main(String[] args) {
        ArrayList<Integer> a  = new ArrayList<>();

        int i = 10;
        while(i-->0){
            a.add(i);
        }
        a.add(5);
        a.add(7);
        // so this will give an reverse arraylist we want to make it from 1 -10

        for (Integer integer : a) {
            System.out.print(integer+" ");
        }
        System.out.println();
        //sorting default
        Collections.sort(a); // increasing order sort default

        for (Integer integer : a) {
            System.out.print(integer+" ");
        }
        //we need to make comparator class object 
        Comparator<Integer> comp = new Comparator<Integer>(){
            public int compare(Integer a, Integer b){

                if(a<b)   // this means if b is greater then a return 1 that means we want an 
                return 1; // change here as we are returning 1 a positive, here a<b is itself
                else if(a>b) // an indicator that we are sorting on basis of this logic 
                return -1; // we dont want change 
                return 0; // we do nothing if both are same 

            }
        };
        Collections.sort(a, comp);
        System.out.println();

        for (Integer integer : a) {
            System.out.print(integer+" ");
        }

    }
}
