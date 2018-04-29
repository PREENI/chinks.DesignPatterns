
package chinks.FactoryPattern.impl;

import chinks.FactoryPattern.intf.RestaurantInterface;

public class DrunkenMonkey_RestImpl implements RestaurantInterface{

    @Override
    public void Price() {
       System.out.println("Its expensive around 600");
    }
}
