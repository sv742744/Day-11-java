import java.util.*;
interface printable{

}
class h implements printable{
    public void print(){
        System.out.println("hello");
    }
}
class makerinterface{
    public static void main(String args[]){
        h a=new h();
        a.print();
    }
}