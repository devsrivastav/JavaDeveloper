package arraylistexample1;
 import java.util.ArrayList;
public class Arraylistexample1 
{
  public static void main(String[] args) 
    {
        ArrayList <Integer >list = new ArrayList<Integer>();
        Integer in1  = new Integer(33);
        Integer in2 = new Integer(55);
        Integer in3 = new Integer(99);
        System.out.println("Without parse any value List ="+list);
        System.out.println("Size ="+list.size());
        list.add(in1);
        list.add(in2);
        list.add(in3);
        System.out.println("After parse the value in the  List ="+list);
        System.out.println("Size ="+list.size());
        list.add(1,45);
        System.out.println("After add a new  value in the  List ="+list);
        System.out.println("Size ="+list.size());
        list.remove(in1);
        System.out.println("After remove the index   in the  List ="+list);
        System.out.println("Size ="+list.size());
        System.out.println("Present in the list: "+list.contains(42));
   }
}
    

