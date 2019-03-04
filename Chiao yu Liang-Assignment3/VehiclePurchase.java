
/**
 * Write a description of class VehiclePurchase here.
 *
 * @author (Chiao yu Liang)
 * @version (2018-10-28)
 */
public class VehiclePurchase
{
    private Customer customer;
    private PurchaseDate purchaseDateprivate;
    private Vehicle vehiclePurchasedprivate;
    private boolean servicePackagepublic;
    public static final double SERVICE_FEE = 500.00;

    /**
     * Constructor for objects of class VehiclePurchase
     */
    public VehiclePurchase(Customer renter, PurchaseDate purchaseDate,
    Vehicle vehiclePurchased, boolean servicePackage)
    {
        this.customer = renter;
        this.purchaseDateprivate = purchaseDate;
        this.vehiclePurchasedprivate = vehiclePurchased;
        
        this.servicePackagepublic = servicePackage;
    }
    
    /**
     * @return the customer.
     */
    public Customer getCustomer(){
        return customer;
    }
    
    /**
     * @return the purchaseDateprivate.
     */
    public PurchaseDate getPurchaseDateprivate(){
        return purchaseDateprivate;
    }
    
    /**
     * @return the vehiclePurchasedprivate.
     */
    public Vehicle getVehiclePurchasedprivate(){
        return vehiclePurchasedprivate;
    }
    
    /**
     * @param servicePackage the servicePackage
     */
    public void setServicePackagepublic(boolean servicePackage){
        this.servicePackagepublic = servicePackage;
    }
    
    /**
     * @return the servicePackagepublic
     */
    public boolean getServicePackagepublic(){
        return servicePackagepublic;
    }
    
    /**
     * @param purchasePrice the purchasePrice to set
     * @return the total price of the purchased vehicle as a double
     */
    public void calculatePurchasePrice(double purchasePrice){
        vehiclePurchasedprivate.checkStandardSellingPrice(purchasePrice);
        
        if(servicePackagepublic){
            vehiclePurchasedprivate.setSellingPrice(vehiclePurchasedprivate.getSellingPrice()
            + SERVICE_FEE);
        }
        
    }
    
    /**
     * Display the rental agreement information
     */
    public void displayDetails(){
        
        System.out.println("Customer: " + customer.getFullName());
        System.out.println("Purchase Date: " + purchaseDateprivate.getFullDate());
        System.out.println("Vehicle Description: ");
        vehiclePurchasedprivate.printDetails();
        
        if(servicePackagepublic){
            System.out.println("SERVICE PACKAGE INCLUDED");
        }
        
	Inventory inventory = new Inventory();
	Inventory.removeVehicle(vehiclePurchasedprivate.getStockCode());        
        
        
    }
    
    
}
