package com.example.beeradvise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by А on 03.06.2017.
 */

public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<String>();
       if (color.equals("amber")){
           brands.add("Jack Amber");
           brands.add("Red Moose");
       }
       if (color.equals("light")){
           brands.add("Jail Pale Ale");
           brands.add("Gout Stout");
       }
       if (color.equals("brown")){
           brands.add("Grom Brot");
           brands.add("Nick Ham");
       }
       if (color.equals("dark")){
           brands.add("Fat bat");
           brands.add("Brot Shot");
       }
       return brands;
    }
}
