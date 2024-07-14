package org.example;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        ProductService service = new ProductService();
        service.addProduct(new Product("Asus vivobook", "Laptop", "Brown Table", 2024));
        service.addProduct(new Product("Cable", "Type-c", "Black Table", 2023));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2022));
        service.addProduct(new Product("Asus Rog", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Wacom pad", "Writing pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Drawer", 2019));
        service.addProduct(new Product("HDMI Cable", "Cable", "Brown Shelf", 2018));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Shelf", 2017));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Shelf", 2016));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Yellow Table", 2015));
        service.addProduct(new Product("Blackbeast", "Computer", "Green Table", 2014));
        service.addProduct(new Product("Java Black Book", "Cable", "Yellow Drawer", 2013));
        service.addProduct(new Product("Lenovo g20", "Laptop", "Green Drawer", 2012));
        service.addProduct(new Product("Macbook pro", "Laptop", "Yellow Shelf", 2011));
        service.addProduct(new Product("FocusRite Mixer", "Audio System", "Green Shelf", 2010));

        List<Product> prods = service.getAllProducts();
        for(Product p : prods)
        {
            System.out.println(p);
        }
        System.out.println("====================================================================");

        System.out.println("A particular product");
        Product p = service.getProduct("Logi Mouse");
        System.out.println(p);

        System.out.println("====================================================================");

        System.out.println("A particular text");
        List<Product> pr = service.getProductsWithText("Black");
        for(Product p1 : pr)
        {
            System.out.println(p1);
        }
        //        Product p = new Product();
//        System.out.println(p);
    }
}