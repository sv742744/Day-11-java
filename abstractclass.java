/*
select the menu
Hello Raju 
rate our app
89898989879
*/
import java.util.*;
abstract class mobileapp{
  abstract void menu();
  abstract void rating();
  abstract void contact();
}
class b extends mobileapp
{
  public void menu()
  {
    System.out.println("select the menu");
  }
  public void rating()
  {
    System.out.println("Hello Raju \n rate our app");
  }
  public void contact()
  {
    System.out.println("89898989879");
  }
}
public class abstractclass {
  public static void main(String args[])
  {
    b a = new b();
    a.menu();
    a.rating();
    a.contact();
  }
}