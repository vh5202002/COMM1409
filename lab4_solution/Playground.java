/**
 * Class to model a Playground
 *
 * Lab 4 Solution
 *
 * @author Gary Tong
 * @version 1.0
 */
public class Playground
{
    public static final int MAX_AGE = 65;

    /**
     * Simple method demonstrating external method calls through object references.
     */
    public void run()
    {
        Person p = new Person();

        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());
        System.out.println(p.getAge());
        System.out.println(p.getHeight());

        p.setFirstName("Gary");
        p.setLastName("Tong");
        p.setAge(31);
        p.setHeight(175.0);

        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());
        System.out.println(p.getAge());
        System.out.println(p.getHeight());

        if(p.getAge() > MAX_AGE)
        {
            System.out.println("Person is old!");
        }
        else
        {
            System.out.println("Person is young!");
        }
        

    }
    
   public void run2(){
       String test1 = "Gary";
       String test2 = "Gary";
       
       if(test1.equals (test2)){
             System.out.println("equal!");  
            }
       else{
             System.out.println("not equal!");
            }
       
       /*
       int a = 10;
       int b = a;
       
       a = 20;
       
       System.out.println(b);
      
       
       
       
       
       
       
        Person person1 = new Person();
            Person person2 = new Person();
           
            
          if( person1.getFirstName().equals(person2.getFirstName()) ){
             System.out.println("equal!");  
            }
          else{
             System.out.println("not equal!");
            }*/
  }
}

