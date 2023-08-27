 package hashtabledemo;
 import java.util.Hashtable;
public class Hashtabledemo 
{
    public static void main(String[] args)
    {
        Hashtable<Integer,Double>obj=new Hashtable<Integer,Double>();
        Double dobj1=new Double(55.6);
        Double dobj2=new Double(34.6);
        Double dobj3=new Double(98.6);
        Double dobj4=new Double(12.5);
        obj.put(1, dobj1);
        obj.put(2, dobj2);
        obj.put(3, dobj3);
        obj.put(4, dobj4);
        obj.put(3, dobj3);
        System.out.println("Hashtable after adding the objects:"+obj);
        System.out.println("\nDoes Hashtable contain the key as 5:"+obj.containsKey(5));
        System.out.println("\nDoes Hashtable contain the value as 34.6:"+obj.containsValue(34.6));
    }
}
