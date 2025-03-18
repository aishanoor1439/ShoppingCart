
package com.mycompany.mavenproject21;

public class WeightedItem extends Item{
    
//    Attributes
    private double weight;
    
//    Methods
    public WeightedItem(String name, double unitPrice, double weight){
//        Initializing attributes from parent class
        super(name, unitPrice);
        this.weight = weight;
    }
//    Overriding methodS from parent class
    @Override
    public double getPrice(){
        return super.getPrice()*weight;
    }
    @Override
    public String toString(){
        return super.toString() + " " + weight + "units" + getPrice() + "PKR";
    }
}
