package com.driver;
public class Main {
    // Task 1: Create a class Product inside Main class
    public static class Product {   
        
        // Task 3: Method to multiply two integers
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method to multiply three integers
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method to multiply two doubles
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create object of Product in Main function called p
        Product p = new Product();
        
        // Call the methods from Main using Product class object p
        int result1 = p.product(3, 4);
        System.out.println("Product of 3 and 4: " + result1);
    }
}
