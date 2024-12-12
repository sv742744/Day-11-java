/*
5
1 2 3 4 5 
[1, 2, 3, 4, 5]
[1, 2, 3, 4, 5, 10, 23]
*/
import java.util.*;
class acceptingarraylistelements {
    public static void main(String [] args){
        ArrayList<Integer> a=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int b=s.nextInt();
            a.add(b);
        }
        System.out.println(a);
        a.add(10);
        a.add(23);
        System.out.println(a);
    }
}