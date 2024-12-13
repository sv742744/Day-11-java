/*
5
4 3 2 1 0
[0, 1, 2, 3, 4]
*/
import java.util.*;
public class reverse_arraylist_using_twopointer{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            int s=sc.nextInt();
            a.add(s);
        }
        int l=0,r=a.size()-1;
        while(l<r){
            int temp=a.get(l);
            a.set(l,a.get(r));
            a.set(r,temp);
            l++;
            r--;
        }
        System.out.println(a);
    }
}