/*
7
1*/
import java.util.*;
interface math{
    public int operation(int a,int b);
}
class makerinterface2{
    public static void main(String [] args){
        math add=(a,b)->a+b;
        math sub=(a,b)->a-b;
        System.out.println(add.operation(3,4));
        System.out.println(sub.operation(5,4));
    }
}