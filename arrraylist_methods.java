/*
[10, 20, 2, 4, 1]
[10, 20, 4]
[10, 20, 4]
[]
*/
import java.util.*;
class arrraylist_methods {
    public static void main(String [] args){
        ArrayList<Integer> a=new ArrayList<>();
        // adding values into arrayindex
        a.add(10);
         a.add(20);
          a.add(2);
           a.add(4);
            a.add(1);
        System.out.println(a);
        a.remove(2);
        a.remove(3);
        System.out.println(a);
        a.contains(20);
        a.contains(25);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}