
package proje;
import java.util.Date;


public class Invoice extends ServiceProvider  {


    public double getUsagelimit() {
        return usagelimit;
    }

   
    public void setUsagelimit(double usagelimit) {
        this.usagelimit = usagelimit;
    }

   
    public double getCurrentspending() {
        return currentspending;
    }

    
    public void setCurrentspending(double currentspending) {
        this.currentspending += currentspending;
    }

  
    public Date getLastdaytopay() {
        return lastdaytopay;
    }

   
    public void setLastdaytopay(Date lastdaytopay) {
        this.lastdaytopay = lastdaytopay;
    }
    private double usagelimit;
    private double currentspending;
    public Date lastdaytopay;
    
    
   
  
    
    
 public void Invoice(double usagelimit, double currentspending, Date ldtp){
     
    
        
    }
 
 public void setldtp(){
   Date bugun = new Date(); 
    long gelecek = bugun.getTime() + (30 * 24 * 60 * 60 * 1000); 
    Date futureDate = new Date(gelecek);
    this.setLastdaytopay(futureDate);  
 }
 
 public Boolean isLimitExceed(double amount){
     if (amount>usagelimit) {
     return true; }
     else
         return false;

         
   
}
 
 public void addCost(double amount){
     currentspending+=amount;
 }
 
 public void pay(double amount){
     currentspending-=amount;
     if (currentspending==0) {
         setldtp();
         
     }
 }
 
 public void changeusagelimit(double amount){
     setUsagelimit(amount);
 }
    
    
}
