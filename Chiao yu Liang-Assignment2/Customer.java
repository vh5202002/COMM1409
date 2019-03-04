/**
 * Write a description of class Customer here.
 *
 * @author (Chiao yu Liang)
 * @version (2018-10-28)
 */
public class Customer
{
    private String firstName;
    private String lastName;
    private String driversLicense;
    private String address;
    private String phoneNumber;
    
    /**
     * Default constructor
     */
    public Customer()
    {
        firstName = "Choya";
        lastName = "Liang"; 
        driversLicense = "88888";
        address = "6392 Elgin";
        phoneNumber = "6047003258";
    }
    
    
    /**
     * Constructor for objects of class Customer
     */
    public Customer(String _firstName, String _lastName, String _driversLicense,
    String _address, String _phoneNumber)
    {
        setFirstName(_firstName);
        setLastName(_lastName);
        setDriversLicense(_driversLicense);
        setAddress(_address);
        setPhoneNumber(_phoneNumber);
    }
    
    /**
     * @param _firstName The new first name.
     */
    public void setFirstName(String _firstName){
        if(_firstName != null && _firstName.trim().length() > 0){
            String fName = _firstName.toLowerCase();
            firstName = fName.replace(fName.charAt(0),
                Character.toUpperCase(fName.charAt(0)));
        }
        else{
            System.out.println("error");
        }
    }
    
    /**
     * @param _lastName The new last name.
     */
    public void setLastName(String _lastName){
        if(_lastName != null && _lastName.trim().length() > 0){
            String lName = _lastName.toLowerCase();
            lastName = lName.replace(lName.charAt(0),
                Character.toUpperCase(lName.charAt(0)));
        }
        else{
            System.out.println("error");
        }
    }

    /**
     * @param _driversLicense The new driversLicense.
     */
    public void setDriversLicense(String _driversLicense){
        if(_driversLicense != null && _driversLicense.trim().length() > 0){
            this.driversLicense = _driversLicense;
        }
        else{
            System.out.println("error");
        }
    }    
    
    /**
     * @param _address The new address.
     */
    public void setAddress(String _address){
        if(_address != null && _address.trim().length() > 0){
            this.address = _address;
        }
        else{
            System.out.println("error");
        }
    }
    
    /**
     * @param _phoneNumber The new phoneNumber.
     */
    public void setPhoneNumber(String _phoneNumber){
        if(_phoneNumber != null && _phoneNumber.trim().length() > 0){
            this.phoneNumber = _phoneNumber;
        }
        else{
            System.out.println("error");
        }
    } 
    
    /**
     * @return The first name of this customer.
     */
    public String getFirstName(){
        return firstName;
    }
    
    /**
     * @return The first name of this customer.
     */
    public String getLastName(){
        return lastName;
    }    
    
    /**
     * @return The first name of this customer.
     */
    public String getDriversLicense(){
        return driversLicense;
    }    

    /**
     * @return The first name of this customer.
     */
    public String getAddress(){
        return address;
    }      
    
    /**
     * @return The first name of this customer.
     */
    public String getPhoneNumber(){
        return phoneNumber;
    } 
    
    /**
     * @return a full name of the name.
     */
    public String getFullName(){
        return firstName + " " + lastName;
    }
   
    
}
