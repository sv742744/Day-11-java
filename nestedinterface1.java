//hello i am inner method//
import java.util.*;
interface out{
    void outs();
    interface in{
        void ins();
    }
}
public class nestedinterface1 implements out.in {
    public void ins(){
        System.out.println("hello i am inner method");
    }
    public static void main(String args[]){
        nestedinterface1 a=new nestedinterface1();
        a.ins();
    }

}