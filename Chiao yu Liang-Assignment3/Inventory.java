import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Inventory here.
 *
 * @author (Chiao yu Liang)
 * @version (2018-11-13)
 */
public class Inventory
{
    private static ArrayList<Vehicle> vehicles;
    
    /**
     * Default construct
     */
    public Inventory(){
        vehicles = new ArrayList<Vehicle>();
    }
    
    /**
     * @return the Array of Vehicles
     */
    public static ArrayList<Vehicle> getVehicles(){
        return vehicles;
    }
    
    /**
     * @param _vehicles used to set the value of the vehicles array
     */
    public static void setVehicles(ArrayList<Vehicle> _vehicles){
        vehicles = _vehicles;
    }
    
    /**
     * @param vehicles used to add a vehicle to the inventory
     */
    public void addVehicle(Vehicle vehicle){
        
        if(vehicles != null){
            vehicles.add(vehicle);
        }
        
    }
    
    /**
     * @param model display all vehicles with given model
     */
    public void searchByModel(String model){
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        
        for(Vehicle index : vehicles){
            if(index.getModel().equals(model)){
                results.add(index);
            }
         }
        displaySearchResults(results);
    }
    
    /**
     * @param display all vehicles of given year
     */
    public void searchByYear(int year){
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        
        for(Vehicle index : vehicles){
            if(index.getYear() == year){
                results.add(index);
            }
        }
        displaySearchResults(results);
    }
    
    /**
     * @param maxPrice used to set the max price
     */
    public void searchByPrice(double minPrice, double maxPrice){
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        
        for(Vehicle index : vehicles){
           if(minPrice <= index.getSellingPrice() && maxPrice >= index.getSellingPrice()){
               results.add(index);
            }
        }
        displaySearchResults(results);
    }
    
    /**
     * @param results Prints the contents of results array to screen
     */
    public void displaySearchResults(ArrayList<Vehicle> results){
        for(Vehicle vehicle : results){
            System.out.println(vehicle.getModel()+ " of " + vehicle.getYear()+
             " of "+ vehicle.getSellingPrice());
        }
    }
    
    /**
     * @param stockCode remove a vehicle by stock code
     */
    public static void removeVehicle(String stockCode){
        
        Iterator<Vehicle> index = vehicles.iterator();
        while(index.hasNext()){
            Vehicle vehicle = index.next();
            if(vehicle.getStockCode().equals(stockCode)){
                index.remove();
            }
        }
    }
    
    /**
     * @return total number of vehicles in inventory
     */
    public String inventoryCount(){
        
        int inventoryCount = vehicles.size();
        return  "There is currently" + " " + inventoryCount+ " " + "vehicles in on lot";
    }
    
    /**
     * @return total dollar amount of inventory
     */
    public String inventoryValue(){
        
        double inventoryValue = 0;
        for(Vehicle index : vehicles){
            inventoryValue += index.getDealerCost();
        }
        return " you have $ " + inventoryValue + " in stock ";
    }
   
    /**
     * displays all inventory
     */
    public void displayInventory(){
        for(Vehicle index : vehicles){
            index.printDetails();
            System.out.println();
        }
        
        System.out.println(inventoryCount());
        System.out.println("Jalopies Are Us Vehicle Summary:");
    }
    
    
    
}
