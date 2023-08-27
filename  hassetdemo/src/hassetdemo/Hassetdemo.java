package hassetdemo;
import java.util.HashSet;
public class Hassetdemo 
{
    public static void main(String[] args) 
    {
        HashSet<String> obj = new HashSet<String>(); 
        String sobj1 = new String("Element 1"); 
        String sobj2 = new String("Element 2");
        String sobj3 = new String("Element 3"); 
        String sobj4 = new String("Element 4"); 
        String sobj7 = new String("Kajal");
        obj.add(sobj1); 
        obj.add(sobj2); 
        obj.add(sobj3); 
        obj.add(sobj4);
        obj.add(sobj2); 
        obj.add(sobj7);
        System.out.println("\nHashSet after adding the objects: \n" + obj); 
        System.out.println(obj.contains(sobj3)); 
        System.out.println(obj.isEmpty()); 
    }
}
    

