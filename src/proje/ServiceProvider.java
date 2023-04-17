
package proje;
import java.util.ArrayList;


public class ServiceProvider {

    /**
     * @return the p_id
     */
    public int getP_id() {
        return p_id;
    }

    /**
     * @param p_id the p_id to set
     */
    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    /**
     * @return the p_name
     */
    public String getP_name() {
        return p_name;
    }

    /**
     * @param p_name the p_name to set
     */
    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    /**
     * @return the voicecallcost
     */
    public double getVoicecallcost() {
        return voicecallcost;
    }

    /**
     * @param voicecallcost the voicecallcost to set
     */
    public void setVoicecallcost(double voicecallcost) {
        this.voicecallcost = voicecallcost;
    }

    /**
     * @return the messagecost
     */
    public double getMessagecost() {
        return messagecost;
    }

    /**
     * @param messagecost the messagecost to set
     */
    public void setMessagecost(double messagecost) {
        this.messagecost = messagecost;
    }

    /**
     * @return the internetcost
     */
    public double getInternetcost() {
        return internetcost;
    }

    /**
     * @param internetcost the internetcost to set
     */
    public void setInternetcost(double internetcost) {
        this.internetcost = internetcost;
    }

    /**
     * @return the discountratio
     */
    public int getDiscountratio() {
        return discountratio;
    }

    /**
     * @param discountratio the discountratio to set
     */
    public void setDiscountratio(int discountratio) {
        this.discountratio = discountratio;
    }
    public int p_id;
    public String p_name;
    public double voicecallcost;
    public double messagecost;
    public double internetcost;
    public int discountratio;
    
    
    
    
    public void ServiceProvider(int id, String name, double vcc, double mc, double ic, int dcrt, ArrayList subs){
       
        
    }
    
    public double calculatemessagecost(int min ,Subscriber caller){
       
       return 
        
    }
    
    public double calculatemessagecost(int quanity, Subscriber sender, Subscriber reciever){
        
    }
    
    public double calculateinternetcost(double amount){
        
    }
    public boolean addsubs(Subscriber s){
        
    }
    public boolean removesubs(Subscriber s){
        
    }
    
}
