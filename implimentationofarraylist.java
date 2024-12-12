/*
[10, 20, 2, 4, 1]//adding value
[90, 60, 10, 20, 2, 4, 1]//adding at particular index
[90, 60, 10, 55, 2, 25, 1]//modifying avalues
*/
import java.util.*;
class implimentationofarraylist {
    public static void main(String [] args){
        ArrayList<Integer> a=new ArrayList<>();
        // adding values into arrayindex
        a.add(10);
         a.add(20);
          a.add(2);
           a.add(4);
            a.add(1);
        System.out.println(a);
        // adding value at particular index
        a.add(0,90);
        a.add(1,60);
        System.out.println(a);
        // modifying the value at index
        a.set(3,55);
        a.set(5,25);
        System.out.println(a);

    }
}