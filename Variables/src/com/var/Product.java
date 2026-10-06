package com.var;

public class Product {

	static byte quantity = 10;
    static  short stock ;
    static int productId = 101;
    static long barcode = 123456789012L;

    static float discount = 10.5f;
    static double price = 999.99;

    static char categoryCode = 'E';
    static boolean available;

    static String productName = "Laptop";
    static String brand = "Dell";

    static int warranty = 2;
    static double weight = 1.75;
    static char rating = 'A';
    static boolean returnable = true;

    static String color = "Black";
    public static void main(String[] args) {

        

        System.out.println(quantity);
        System.out.println(stock);
        System.out.println(productId);
        System.out.println(barcode);
        System.out.println(discount);
        System.out.println(price);
        System.out.println(categoryCode);
        System.out.println(available);
        System.out.println(productName);
        System.out.println(brand);
        System.out.println(warranty);
        System.out.println(weight);
        System.out.println(rating);
        System.out.println(returnable);
        System.out.println(color);
    }
}