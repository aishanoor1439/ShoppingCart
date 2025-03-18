
package com.mycompany.mavenproject21;

public class Item {
    
//    Attributes
    protected String name;
    protected double unitPrice;
    
//    Methods
    public Item(){
        this("No Item", 0);
    }
    public Item(String name, double unitPrice){
        this.name = name;
        this.unitPrice = unitPrice;
    }
    public double getPrice(){
        return unitPrice;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return name + " " + "@" + " " + unitPrice;
    }
}
