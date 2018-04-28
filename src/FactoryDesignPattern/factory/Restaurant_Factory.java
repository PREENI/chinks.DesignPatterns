/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinks.factory;

import chinks.impl.A2B_RestImpl;
import chinks.impl.DrunkenMonkey_RestImpl;
import chinks.impl.SkyDeck_RestImpl;
import chinks.intf.RestaurantInterface;

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
