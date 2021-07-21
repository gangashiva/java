package com.sync.test;

import com.sync.test.service.Product;
public class TestProduct {

  public TestProduct() {
    super();
  }

  public static void main(String[] args) {
    printMessage("Hello how are you");
    printMessage("I'm fine");
    Product product = new Product("Laptop1");
    Product product1 = new Product("Mobile");
    System.out.println(product.getName());
    System.out.println(product1.getName());
  }

  private static void printMessage(String hello) {
    System.out.println(hello);
    //System.out.println(hello);
  }
}
