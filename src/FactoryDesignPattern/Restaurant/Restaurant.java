/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinks.Restaurant;
import chinks.factory.Restaurant_Factory;
import chinks.intf.RestaurantInterface;
import java.util.Scanner;
//import SelectRest;

/**
 *
 * @author PREENI
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
