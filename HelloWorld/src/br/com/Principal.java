package br.com;

import br.com.primitive.Primitive;

public class Principal {
  public static void main(String[] args) {
    Primitive primitive = new Primitive();
//    String Hello = "Hello World";
    String product1 = "computer";
    String product2 = "Office desk";

    int age = 25;
    int code = 5290;
    char gender = 'm';

    double price1 = 2100.0;
    double price2 = 650.50;
    double measure = 532.234567;

    System.out.printf("%.2f", price1);
    System.out.printf("%.2f", price2);
    System.out.printf("%.2f", measure);
//    System.out.println(Hello);
    System.out.println(primitive.longVar);

  }
}
