
package chinks.BuilderPattern.RestBulder;


public class Restauarnt_Builder {
    
    int Price;
    String Area,Category="Veg",Type="Normal",RestName;
  

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

  
    
}
