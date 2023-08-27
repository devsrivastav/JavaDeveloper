///MULTI  LEVEL INHERITANCE PROGRAMING..............
package multilevel;
class Employee
{
    public void print_Employee()
    {
        System.out.println("Inside the Employee class");
    }
} 
class Manager extends Employee
{
    public void print_Manager()
    {
        System.out.println("Inside the Manager class");
    }
}
 class Supervisor extends Manager
 {
     public void print_Supervisor()
     {
         System.out.println("Inside the Supervisor");
     }           
 }
class Account extends Supervisor
{
    public void print_Account()
    {
        System.out.println("Inside the Account class");
    }
}
class HR extends Account
{
    public void print_HR()
    {
    System.out.println("Inside the HR class");
    }
}
public class Multilevel 
{
    public static void main(String[] args) 
    {
        HR obj=new HR();
        obj.print_HR();
    }
}
