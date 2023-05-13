package Basic.Collections;
import java.util.*;
public class Comparable_interface {
    public static void main(String[] args) {
        // We have one interface name comparable it also provide facility to 
        // sort things 
        // lets create our class first 

        student s1 = new student(10,"A");
        student s2 = new student(12,"B");
        student s3 = new student(5,"C");
        student s4 = new student(20,"D");

        // SO WE HAVE 4 STUDENTS DEFINED 
        // 1ST NOW I WANT TO PRINT THEM IN SORTED ORDER WITH THERE AGE 
        // FOR THAT I NEED TO IMPLEMENT comparable interface on it

        ArrayList<student> s = new ArrayList<>();
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        
        Collections.sort(s);

        for (student a : s ) {
            System.out.println(a.age + " ");
        }

    }
}

// our class
class student implements Comparable<student>{
    int age;
    String name;

    student(int age, String name){
        this.age = age;
        this.name = name;
    }

    // we need to overwrite this to do so as it is an abstract method on an interface
    // so instead of an seperate comparator class implement we did it from here only 

    public int compareTo(student that){

        if(this.age > that.age){
            return 1;
        }
        return -1;
    }
}