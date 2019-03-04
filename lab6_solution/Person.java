/**
 * Class to model a Person
 *
 * Lab 5 Solution
 *
 * @author Gary Tong
 * @version 1.0
 */
public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private double height;

    private static int counter = 0;
    private static final int MAX_AGE = 100;
    private static final int MAX_HEIGHT = 200;

    /**
     * Default constructor.
     */
    public Person()
    {
        firstName = "John";
        lastName = "Doe";
        age = 1;
        height = 0.0;

        counter++;
    }

    /**
     * Constructor for creating a Person instance with just first name and last name.
     *
     * @param firstName The first name of our Person
     * @param lastName  The last name of our Person
     */
    public Person(String firstName, String lastName)
    {
        setFirstName(firstName);
        setLastName(lastName);

        counter++;
    }

    /**
     * Constructor for creating a Person instance.
     *
     * @param firstName The first name of our Person
     * @param lastName  The last name of our Person
     * @param age       The age of our Person
     * @param height    The height of our Person
     */
    public Person(String firstName, String lastName, int age, double height)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setHeight(height);

        counter++;
    }

    /**
     * Sets the first name of this person.
     *
     * @param firstName The new first name.
     */
    public void setFirstName(String firstName)
    {
        if(firstName != null && firstName.trim().length() > 0 )
        {
            this.firstName = firstName.trim();
        }
        else
        {
            this.firstName = "Bob";
            System.out.println("Bad first name!");
        }
    }

    /**
     * Sets the last name of this person.
     *
     * @param lastName The new last name.
     */
    public void setLastName(String lastName)
    {
        if(lastName != null && lastName.trim().length() > 0 )
        {
            this.lastName = lastName.trim();
        }
        else
        {
            this.lastName = "Smith";
            System.out.println("Bad last name!");
        }
    }

    /**
     * Sets the age of this person.
     *
     * Must be positive and less than or equal to 100.
     *
     * @param age The new age to set.
     */
    public void setAge(int age)
    {
        if(age > 0 && age <= MAX_AGE)
        {
            this.age = age;
        }
    }

    /**
     * Sets the height of this person
     *
     * Must be positive and less than or equal to 200.
     *
     * @param height The new height to set.
     */
    public void setHeight(double height)
    {
        if(height > 0 && height <= MAX_HEIGHT)
        {
            this.height = height;
        }
    }

    /**
     * Get the first name of this person.
     *
     * @return The first name of this person.
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Get the last name of this person.
     *
     * @return The last name of this person.
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Get the age of this person.
     *
     * @return The age of this person.
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Get the height of this person.
     *
     * @return The height of this person.
     */
    public double getHeight()
    {
        return height;
    }

    /**
     * Grab details of this person
     * @return A string showing the full name and age of this person.
     */
    public String getDetails()
    {
        return "Hello my name is " + firstName + " " + lastName + " and my age is " + age;
    }

    /**
     * @return The number of times a Person object was instantiated.
     */
    public String getNumberOfTimesCreated()
    {
        String howMany = "too many times!";

        switch(counter)
        {
            case 0:
                howMany = "none";
                break;
            case 1:
                howMany = "once";
                break;
            case 2:
                howMany = "twice";
                break;
        }

        return howMany;
    }
}

