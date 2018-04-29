/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinks.FactoryPattern.impl;

//import chinks.FactoryPattern.impl.*;
import chinks.FactoryPattern.intf.RestaurantInterface;

/**
 *
 * @author PREENI
 */
public class A2B_RestImpl implements RestaurantInterface{

    /**
     *
     */
    @Override
    public void Price() {
        System.out.println("cheap aroundd 100");
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
