
package chinks.BuilderPattern.Restaurant;

import chinks.BuilderPattern.RestBulder.Restauarnt_Builder;

public class Restaurant {
    
    int Price;
    String Area,Category,Type,RestName;
    
    public static void main(String args[])
    {
        Restaurant r=new Restaurant();
       Restauarnt_Builder rb=new Restauarnt_Builder().setPrice(1000).setArea("ESI").setCategory("Veg").build();
       String s=toString(rb,r);
       System.out.println(s);
    }
    
    public static String toString(Restauarnt_Builder rb,Restaurant r)
    {
        return ("Price="+ rb.getPrice()+"\nArea="+ rb.getArea()+"\nCategory="+rb.getCategory()+"\nType="+rb.getType()+"\nRestaurant Name="+r.getRest_Name(rb));
    }
    
    public String getRest_Name(Restauarnt_Builder rb)
    {
        if(rb.getPrice()==600 & rb.getArea().equals("Whitefield") & rb.getCategory().equals("Bar") )
        {
            return "Drunken Monkey" ;
        }
        
        else if (rb.getPrice()==1000 & rb.getArea().equals("ESI") & rb.getCategory().equals("Veg") & rb.getType().equals("Normal"))
            return "A2B";
        
        else if ((rb.getPrice()==100 & rb.getArea().equals("Phoenix") & rb.getCategory().equals("Non-Veg") & rb.getType().equals("Buffet") ))
            return "SkyDeck";
        
        return "Find the Restaurant Name on your OWN";
    }

   
    }

