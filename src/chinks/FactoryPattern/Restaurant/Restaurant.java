
package chinks.FactoryPattern.Restaurant;
import chinks.FactoryPattern.factory.Restaurant_Factory;
import chinks.FactoryPattern.intf.RestaurantInterface;
import java.util.Scanner;

public class Restaurant {

   public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String c;
        do{
        Restaurant_Factory sr=new Restaurant_Factory();
        System.out.println("Select any of the 3 three restaurants: rooftop,bar,normal.");
        System.out.println("We'll tell u the price range for it");
        String s=sc.nextLine();
        
        RestaurantInterface r=sr.Restaurant_Factory(s);
        r.Price();
        
        System.out.println("Wanna check another restaurant(yes/no)");
         c=sc.nextLine();
        }
        while(c.equals("yes"));
    }
    
}
