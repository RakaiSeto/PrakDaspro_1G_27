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

                    if (baris > penonton.length || kolom > penonton[0].length) {
                        if (baris > penonton.length) {
                            System.out.println("=== Nomor Baris Tidak Tersedia ===");        
                        } else {
                            System.out.println("=== Nomor Kolom Tidak Tersedia ===");        
                        }
                    } else if (penonton[baris-1][kolom-1] != null) {
                        for (; penonton[baris-1][kolom-1] != null ;) {
                            System.out.println("=== Kursi terisi. Masukkan kembali baris dan kolom");
                            System.out.print("Masukkan baris : ");
                            baris = sc27.nextInt();
                            System.out.print("Masukkan kolom : ");
                            kolom = sc27.nextInt();
                        }
                    } else {
                        penonton[baris-1][kolom-1] = nama;
                   
                        System.out.print("Input penonton lainnya? (Y/N) : ");
                        next = sc27.next();
                        if (next.equalsIgnoreCase("n")) {
                            menu = "";
                            continue;
                        }
                    }
                }
            } else if (menu.equals("2")) {
                System.out.println();
                for (int i = 0; i < penonton.length; i++) {
                    String kursiBaris = String.join(", ", penonton[i]);
                    kursiBaris = kursiBaris.replaceAll("null", "***")
                    System.out.println(kursiBaris);
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
