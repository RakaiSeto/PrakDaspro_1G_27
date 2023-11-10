package P10;

import java.util.Scanner;

public class BioskopWithScanner27 {
    public static void main(String[] args) {
        Scanner sc27  = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Masukkan nama : ");
            nama = sc27.nextLine();
            System.out.println("Masukkan baris : ");
            baris = sc27.nextInt();
            System.out.println("Masukkan kolom : ");
            kolom = sc27.nextInt();

            penonton[baris-1][kolom-1] = nama;

            System.out.println("Input penonton lainnya? (Y/N)");
            next = sc27.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
