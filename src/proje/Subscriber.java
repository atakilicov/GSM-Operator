package proje;
import java.util.Date;
import java.util.Random;


public class Subscriber extends Invoice {

    /**
     * @return the s_id
     */
    public int getS_id() {
        return s_id;
    }

    /**
     * @param s_id the s_id to set
     */
    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the isactive
     */
    public Boolean getIsactive() {
        return isactive;
    }

    /**
     * @param isactive the isactive to set
     */
    public void setIsactive(Boolean isactive) {
        this.isactive = isactive;
    }

    /**
     * @return the sp
     */
    public ServiceProvider getSp() {
        return sp;
    }

    /**
     * @param sp the sp to set
     */
    public void setSp(ServiceProvider sp) {
        this.sp = sp;
    }
    private int s_id ;
    private String name;
    private int age;
    private Boolean isactive=true;
    private ServiceProvider sp;
     
     
    public void Subscriber(String name,int age,ServiceProvider sp, double usagelimit ){
    setldtp();    
        
    }
    public void updatestatus(Subscriber s){
        Date now = new Date();
        long suan = now.getTime();
        long sont= lastdaytopay.getTime();
        if (suan<sont) {
        } else {
            s.setIsactive((Boolean) false);
        }
     
    }
    public void MakeVoiceCall(int min, Subscriber reciever, Subscriber sender){
        if (reciever.getIsactive() && sender.getIsactive()) {
            sender.addCost(min*voicecallcost);
            
        }
   
    }
    public void SendMessage(int quanity, Subscriber reciever, Subscriber sender){
       if (reciever.getIsactive() && sender.getIsactive()) {
            sender.addCost(quanity*messagecost);
            
        }
        
        
        
        
    }
    public void ConnectInternet(double amount){
        
        
    }
    
    public void ChangeSp(ServiceProvider spv){
        
        
    }
    
    public void setID(Subscriber s){
        Random rand = new Random();
        int upper = rand.nextInt(8000000)+1000000;
        this.setS_id(upper);
    }
}
