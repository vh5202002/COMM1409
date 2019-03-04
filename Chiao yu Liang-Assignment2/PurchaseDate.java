
/**
 * Write a description of class PurchaseDate here.
 *
 * @author (Chiao yu Liang)
 * @version (2018-10-28)
 */
public class PurchaseDate
{
   private int year;
   private int month;
   private int day;   

   public static final int CURRENT_YEAR = 2018;
   public static final int JANUARY = 1;
   public static final int DECEMBER = 12;      
   public static final int FIRST_DAY = 1;
   public static final int LAST_DAY = 31; 
   public static final int DOUBLE = 10;
   /**
     * Constructor for objects of class PurchaseDate
     */
    public PurchaseDate(int theYear, int theMonth, int theDay)
    {
        
        if(theYear <= CURRENT_YEAR){
            year = theYear;
        }
        else{
            year = CURRENT_YEAR;
        }
        
        if(theMonth >= JANUARY && theMonth <= DECEMBER){
            month = theMonth;
        }
        else{
            month = JANUARY;
        }
        
        if(theDay >= FIRST_DAY && theDay <= LAST_DAY){
            day = theDay;
        }
        else{
            day = FIRST_DAY;
        }
    }
   
   /**
    * @param theYear The new year.
    */
   public void setYear(int theYear){
       if(theYear >= CURRENT_YEAR){
           this.year = theYear;
        }
    }
   
   /**
    * @param theMonth The new month.
    */
   public void setMonth(int theMonth){
       if(theMonth >= JANUARY && theMonth <= DECEMBER){
           this.month = theMonth;
        }
    }    
   
   /**
    * @param theDay The new day.
    */
   public void setDay(int theDay){
       if(theDay >= FIRST_DAY && theDay <= LAST_DAY){
           this.day = theDay;
        }
    }    

   /**
    * @return The year of this PurchaseDate.
    */    
   public int getYear(){
       return year;
    }

   /**
    * @return The month of this PurchaseDate.
    */    
   public int getMonth(){
       return month;
    }

   /**
    * @return The day of this PurchaseDate.
    */    
   public int getDay(){
       return day;
    }    

   /**
    * @param date.
    * @return 0+ date 
    * @return  + date
    */ 
   private String getDateString(int date){
       if(date < DOUBLE){
           return "0" + date;
        }
       else{
           return "" + date;
        }
    }
        
   /**
    * @return The full date of this PurchaseDate.
    */    
   public String getFullDate(){
       return year + "-" + getDateString(month) + "-" + getDateString(day);
    }
    
}
