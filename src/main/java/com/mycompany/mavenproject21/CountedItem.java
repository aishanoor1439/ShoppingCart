
package com.mycompany.mavenproject21;

public class CountedItem extends Item{
    
//    Attributes
    private int quantity;
    
//    Methods
    public CountedItem(String name, double unitPrice, int quantity){
//        Initializing attributes from parent class
        super(name, unitPrice);
        this.quantity = quantity;
    }
//    Overriding methodS from parent class
    @Override
    public double getPrice(){
        return super.getPrice()*quantity;
    }
    @Override
    public String toString(){
        return super.toString() + " " + quantity + "units" + getPrice() + "PKR";
    }
}
