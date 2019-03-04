/**
 * Write a description of class Vehicle here.
 *
 * @author (Chiao yu Liang)
 * @version (20181011)
 */
import java.text.DecimalFormat;
public class Vehicle
{
    private String stockCode;
    private String make;
    private String model;
    private int year;

    private double dealerCost;
    private double sellingPrice;
    private double profitMargin;
    
    public static final int MAXIMUM_YEAR = 2018;
    public static final int MINIMUN_YEAR = 1970;    
    
    /**
     * default Constructor for objects of class Vehicle
     */
    public Vehicle()
    {
        
        stockCode = "Chevrolet";
        make = "Monte";
        model = "Carlo";
        year = 1974;
        
    }
    
     /**
     * Constructor for creating a Vehicle instance.
     * @param _stockCode The stockCode of Vehicle
     * @param _make The make of Vehicle
     * @param _model The model of Vehicle
     * @param _year The year of Vehicle
     */
      public Vehicle(String _stockCode, String _make, String _model, int _year){

        setStockCode(_stockCode);
        setMake(_make);
        setModel(_model);
        setYear(_year);
        
    }
    
    /**
     * @return the vehicle stockCode as String
     */
    public String getStockCode(){
        return stockCode;
    }
    
    /**
     * @return the make as String
     */
    public String getMake(){
        return make;
    }
    
    /**
     * @return the model as String
     */
    public String getModel(){
        return model;
    }
    
    /**
     * @return the year as int
     */
    public int getYear(){
        return year;
    }
    
    /**
     * @return the dealerCost as double
     */
    public double getDealerCost(){
        return dealerCost;
    }
    
    /**
     * @return the sellingPrice as double
     */
    public double getSellingPrice(){
        return sellingPrice;
    }
    
    /**
     * @return the profit margin on the vehicle if sold, as double
     */
    public double getProfitMargin(){
        return profitMargin;
    }
        
    
    /**
     * Sets the stockCode of Vehicle
     * @param _stockCode The new stockCode
     */
    public void setStockCode(String _stockCode){
       if(_stockCode != null  && _stockCode.trim().length() > 0){
         this.stockCode = _stockCode;
        }
       else{
           System.out.println("invalid input");
        }
    }
    
    /**
     * Sets the make of Vehicle
     * @param _make The new make
     */
    public void setMake(String _make){
       if(_make != null && _make.trim().length() > 0){
          this.make = _make;
        }
       else{
           System.out.println("invalid input");  
        }
    }
    
    /**
     * Sets the model of Vehicle
     * @param _model The new model
     */
    public void setModel(String _model){
       if(_model != null && _model.trim().length() > 0){
          this.model = _model;
        }
       else{
           System.out.println("invalid input");
        }
    }
    
    /**
     * Sets the year of Vehicle
     * @param _year The new year
     */
    public void setYear(int _year){
        if( _year >=  MINIMUN_YEAR && _year<= MAXIMUM_YEAR ){
            this.year = _year;
        }
        else{
            System.out.println("invalid input");
        }
    }
    
    /**
     * Sets the dealerCost of Vehicle
     * @param dealerCost sets the value for the dealerCost field
     */
    public void setDealerCost(double dealerCost){
        
        if(dealerCost >= 0 ){
            this.dealerCost = dealerCost;
        }
        else{
            System.out.println("invalid input");
        }
        
    }
    
    /**
     * @param sellingPrice sets the sellingPrice only if it is at least 25% than dealerCost
     */
    public void checkStandardSellingPrice(double sellingPrice){
        if(sellingPrice >= (dealerCost * 1.25)){
            this.sellingPrice = sellingPrice;
        }
        else{
            System.out.println("The dealer cost: $" + dealerCost + ". Sale price $"+ sellingPrice );
        }
       
    }
    
    /**
     * @param sellingPrice sets the value for sellingPrice
     */
    public void setSellingPrice(double sellingPrice){
         if(sellingPrice >=0 ){
             this.sellingPrice= sellingPrice;
            }
         else{
             System.out.println("invalid input");
            }
    }
    
    /**
     * calculates the profit margin for selling a vehicle
     */
    public void calculateProfitMargin(){
        profitMargin = (sellingPrice - dealerCost) / sellingPrice;
    }
    
    /**
     * @return the profit on selling a vehicle as a dollar value.
     */
    public double calculateProfit(){
        return sellingPrice-dealerCost;
    }
    
    /**
     * formats and displays all vehicle information.
     */
    public void printDetails(){

        DecimalFormat formatter = new DecimalFormat("$0.00");
        DecimalFormat percentFormatter  = new DecimalFormat("0%");
        
        System.out.println("Jalopies Are Us Vehicle Summar");
        System.out.println("Vehicle: "+ year +" "+ make + " "+ model );
        System.out.println("Stock Code: " + stockCode );
        System.out.println("Dealer Cost: " + formatter.format(dealerCost));
        System.out.println("Selling Price: " + formatter.format(sellingPrice));
        System.out.println("Profit Margin: " + percentFormatter.format(profitMargin));
        System.out.println("Dollar Profit: " + formatter.format(calculateProfit()));    
        
    }
    
    
    
}
