// helooooooooooooooo//
import java.util.*;
abstract interface math{
    void print();
}
class d implements math{
    public void print(){
        System.out.println("helooooooooooooooo");
    }
}
class abstractinterface1{
    public static void main(String args[]){
        d a=new d();
        a.print();
    }

}