/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinks.FactoryPattern.factory;

//import chinks.FactoryPattern.factory.*;
import chinks.FactoryPattern.impl.A2B_RestImpl;
import chinks.FactoryPattern.impl.DrunkenMonkey_RestImpl;
import chinks.FactoryPattern.impl.SkyDeck_RestImpl;
import chinks.FactoryPattern.intf.RestaurantInterface;

/**
 *
 * @author PREENI
 */
public class Restaurant_Factory {
    
    public RestaurantInterface Restaurant_Factory(String a)
    {
        switch (a) {
            case "bar":
                return (new DrunkenMonkey_RestImpl());
            case "normal":
                return (new A2B_RestImpl());
            default:
                return (new SkyDeck_RestImpl());
        }
    }
    
    
}
