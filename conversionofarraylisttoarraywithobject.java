/*
[10, 20, 2, 4, 1]
[10, 20, 2, 4, 1]
*/
import java.util.*;
class conversionofarraylisttoarraywithobject {
    public static void main(String [] args){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
         a.add(20);
          a.add(2);
           a.add(4);
            a.add(1);
         System.out.println(a);
        Object b[]=a.toArray();
        System.out.println(Arrays.toString(b));
    }
}