/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinks.BuilderPattern.RestBulder;

/**
 *
 * @author PREENI
 */
public class Restauarnt_Builder {
    
    int Price;
    String Area,Category="Veg",Type="Normal",RestName;
    /*
    public  Restauarnt_Builder(int p,String a, String c, String t)
    {
        this.Price=p;
        this.Area=a;
        this.Category=c;
        this.Type=t;
        //this.RestName=getRestName();
    }
    */

    public int getPrice() {
        return Price;
    }

    public String getArea() {
        return Area;
    }

    public String getCategory() {
        return Category;
    }

    public String getType() {
        return Type;
    }

    public String getRestName() {
        return RestName;
    }
    
    public Restauarnt_Builder build()
    {
        return this;
    }
    
    public Restauarnt_Builder setPrice(int p)
    {
        this.Price=p;
        return this;
    }
    
    public Restauarnt_Builder setArea(String a)
    {
        this.Area=a;
        return this;
    }
    
    public Restauarnt_Builder setCategory(String c)
    {
        this.Category=c;
        return this;
    }
    
    public Restauarnt_Builder setType(String t)
    {
        this.Type=t;
        return this;
    }

/*
    private String getRestName()
    {
        if(Price==600 & Area.equals("Whitefield") & Category.equals("Bar") )
        {
            return "Drunken Monkey" ;
        }
        
        else if (Price==100 & Area.equals("ESI") & Category.equals("Veg") & Type.equals("Normal"))
            return "A2B";
        
        else if ((Price==100 & Area.equals("Phoenix") & Category.equals("Non-Veg") & Type.equals("Buffet") ))
            return "SkyDeck";
        
        return "Find the Restaurant Name";
    }
    */
    
   
    
}
