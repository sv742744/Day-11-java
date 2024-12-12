/*
5
2 1 3 45  0
[2, 1, 3, 45, 0]
[0, 1, 2, 3, 45]
*/
import java.util.*;
class arraylistsort {
    public static void main(String [] args){
        ArrayList<Integer> a=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int b=s.nextInt();
            a.add(b);
        }
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
    }
}