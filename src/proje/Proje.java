
package proje;
import java.util.ArrayList;
import java.util.Scanner;
public class Proje {

    ArrayList<String> Subs = new ArrayList<>();
     ArrayList<String> sps = new ArrayList<>();
    
 
    public static void main(String[] args) {
        System.out.println("welcome to menu. sellect your action;");
        System.out.println("1- Creating a new Service Provider\n" +
"2- Create a new Subscriber\n" +
"3- Voice Call: A subscriber calls another subscriber\n" +
"4- Messaging: A subscriber sends a message to another subscriber\n" +
"5- Internet: A subscriber connects to the Internet\n" +
"6- Pay Invoice: A subscriber pays his/her invoice\n" +
"7- Change ServiceProvider: A subscriber changes his/her provider\n" +
"8- Change Limit: A subscriber changes his/her usage limit for the Invoice\n" +
"9- List all Subscribers (show s_id, isActive, s_provider, invoice)\n" +
"10- List all Service Providers (show p_id, p_name, all costs, and discount)\n" +
"11- Exit");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        switch (i) {
            case 1:
                
                
                break;
            case 2:
                
            default:
                throw new AssertionError();
        }
 
       
    }
    
}
