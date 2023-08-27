package linkedlistdemo;
import java.util.LinkedList;
import java.util.ListIterator;
  public class Linkedlistdemo 
{
 public static void main(String[] args)
 {
       LinkedList<Integer> ob = new LinkedList<Integer>();
       Integer iobj1 = new Integer(101);
       Integer iobj2 = new Integer(102);
       Integer iobj3 = new Integer(103);
       Integer iobj4 = new Integer(104);
       Integer iobj5 = new Integer(500);
       System.out.println("Size of LinkedList is:"+ob.size());
       ob.add(iobj1);
       ob.add(iobj2);
       ob.add(iobj3);
       ob.add(iobj4);
       ob.add(iobj5);
       System.out.println("\nLinkedList after adding the obejects:" +ob);
       System.out.println("Size of LinkedList after adding objects:" +ob.size());
       ob.remove(iobj2);
       ob.remove(iobj5);
        System.out.println("\nLinkedList after removing the obejects:" +ob);
       System.out.println("Size of LinkedList removing the objects:" +ob.size());
      
       System.out.println("\n The final Linked list :");
      ListIterator i = ob.listIterator();
      while(i.hasNext())//hasNext() condtions
      {
          System.out.println(i.next()); //next() print
      } 
    }
}

