package P10;

import java.util.Scanner;

public class BioskopWithScanner27 {
    public static void main(String[] args) {
        Scanner sc27  = new Scanner(System.in);
        int baris, kolom;
        String nama, next="y";
        String menu = "";

        String[][] penonton = new String[4][2];

        for(; ;) {
            if (menu.equals("pilih") || menu.equals("")) {
                System.out.println("=========================");
                System.out.println("Pilih menu :");
                System.out.println("1. Input Data Penonton");
                System.out.println("2. Tampilkan Daftar Penonton");
                System.out.println("3. Exit");
                System.out.print("menu : ");
                menu = sc27.next();
            } else if (menu.equals("1")) {
                System.out.println();
                next = "y";
                while (next.equals("y")) {
                    System.out.print("Masukkan nama : ");
                    nama = sc27.next();
                    System.out.print("Masukkan baris : ");
                    baris = sc27.nextInt();
                    System.out.print("Masukkan kolom : ");
                    kolom = sc27.nextInt();

                    penonton[baris-1][kolom-1] = nama;

                    System.out.print("Input penonton lainnya? (Y/N) : ");
                    next = sc27.next();
                    if (next.equalsIgnoreCase("n")) {
                        menu = "";
                        continue;
                    }
                }
            } else if (menu.equals("2")) {
                System.out.println();
                for (int i = 0; i < penonton.length; i++) {
                    System.out.println(String.join(", ", penonton[i]));
                }
                menu = "";
                continue;
            } else if (menu.equals("3")) {
                break;
            } else {
                menu = "";
                continue;
            }
        }
    }
}
