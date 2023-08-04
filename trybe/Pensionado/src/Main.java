import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.println("How many rooms will be ranted? ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.println("Rent #" + i + ":");
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Room: ");
            int roomNumber = sc.nextInt();

            Rent rent = new Rent(name, email);

            vect[roomNumber] = rent;
        }

        for (Rent r : vect) {
            if (r != null) {
                System.out.println(r);
            }
        }

        sc.close();
    }
}