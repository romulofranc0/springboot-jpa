package application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import entities.Product;

public class App {
    public static void main(String[] args) {
      

        Map<Product, Double> stock=new HashMap<>();

        Product p1=new Product("Tv", 900.0);
        Product p2=new Product("Notebook",1200.0);
        Product p3=new Product("Tablet", 400.0);

        stock.put(p1, 1000.0);
        stock.put(p2, 2000.0);
        stock.put(p3, 3000.0);

        Product ps=new Product("Tv", 900.0);

        System.out.println("Contains key'Tv': "+stock.containsKey(ps));
    }
}
