package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;
public class App {
    public static void main(String[] args) {
        
        Set<Product> set=new TreeSet<>();

        set.add(new Product("tv", 2000.0));
        set.add(new Product("Notebook", 3000.0));
        set.add(new Product("Tablet", 1500.0));


        System.out.println(set);
       
        
    }
}
