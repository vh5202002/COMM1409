/**
 * Class to model a Person
 * Lab 6 Solution
 *
 * @author Gary Tong
 * @version 1.0
 */
public class Playground
{
    private Person personArray[] = new Person[5];
    public static final int MAX_AGE = 65;

    /**
     * A method to add some people to the playground.
     */
    public void addPeople()
    {
        // some defaults
        double total = 0;
        double average = 0;
        
        // instantiate an object for each reference
        personArray[0] = new Person();
        personArray[1] = new Person();
        personArray[2] = new Person();
        personArray[3] = new Person();
        personArray[4] = new Person();
        
        // mutate their age
        personArray[0].setAge(10);
        personArray[1].setAge(20);
        personArray[2].setAge(30);
        personArray[3].setAge(40);
        personArray[4].setAge(50);
        
        // setup a loop based on size of the array
        int index = 0;
        while(index < personArray.length)
        {
            // using the index as the key to the array, grab everyone's age
            // add everyone's age to the total
            total += personArray[index].getAge();
            index++;
        }
        
        // math to calculate the average
        average = total / personArray.length;
        
        System.out.println("Average age of everyone is " + average);
    }

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
        p.setAge(32);
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

        Person p2 = new Person();
        p2.setFirstName("Bob");

        if(p.getFirstName().equals(p2.getFirstName()))
        {
            System.out.println("Same Person!");
        }
    }
}
