/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinks.FactoryPattern.impl;

//import chinks.impl.*;
import chinks.FactoryPattern.intf.RestaurantInterface;

/**
 *
 * @author PREENI
 */
public class DrunkenMonkey_RestImpl implements RestaurantInterface{

    @Override
    public void Price() {
       System.out.println("Its expensive around 600");
    }
}
