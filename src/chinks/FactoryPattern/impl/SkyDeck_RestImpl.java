
package chinks.FactoryPattern.impl;

import chinks.FactoryPattern.intf.RestaurantInterface;

public class SkyDeck_RestImpl implements RestaurantInterface{

    @Override
    public void Price() {
        System.out.println("Its very expensive around 1000");
        
    }
}
