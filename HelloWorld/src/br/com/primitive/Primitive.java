package br.com.primitive;

public class Primitive {
  public static void main(String[] args) {
    byte byteVar = 127; // Valor maximo do byte;
    short shortVar = 32767; // Valor máximo do short;
    int intVar = 2147483647; // Valor máximo do int;
    long longVar = 9223372036854770000L; // valor máximo do long;

    float floatVar = 10.10F;
    double doubleVar = 10000000000.299;
    char charVar = 's';
    boolean booleanVar = true;

    System.out.println(byteVar);
    System.out.println(shortVar);
    System.out.println(intVar);
    System.out.println(longVar);
    System.out.println(floatVar);
    System.out.println(doubleVar);
    System.out.println(charVar);
    System.out.println(booleanVar);
  }
}
