
package com.mycompany.mavenproject21;

public class Mavenproject21 {

    public static void main(String[] args) {
        CountedItem c = new CountedItem("pens", 4.5, 10);
        WeightedItem w = new WeightedItem("Banana", 3.00, 1.37);
        System.out.println(c.toString());
        System.out.println(w.toString());
    }
}
