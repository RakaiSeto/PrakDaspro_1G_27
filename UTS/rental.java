import java.util.Scanner;

/**
 * rental
 */
public class rental {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        String currentCustName, custAddress, custPhone, custCar="", rentalLen, sopir="", menu="";

        System.out.println("=== UTS PRAKTIKUM DASAR PEMROGRAMAN TI-1G ===");
        System.out.println("dibuat oleh : Rakai Seto Sembodo");
        System.out.println("NIM         : 2341720135");

        for(; ;) {
            if (menu.equals("pilih") || menu.equals("")) {
                System.out.println("=========================");
                System.out.println("Pilih menu :");
                System.out.println("1. Data Peminjam");
                System.out.println("2. Data Rental");
                System.out.print("menu : ");
                menu = sc27.next();
            } else if (menu.equals("1")) {
                System.out.println("=========================");
                System.out.println("Data Peminjam");
                System.out.println("=========================");
                System.out.print("Nama : ");
                currentCustName = sc27.next();
                System.out.print("Alamat : ");
                custAddress = sc27.next();
                System.out.print("Nohp : ");
                custPhone = sc27.next();
                for (; !custCar.equalsIgnoreCase("avanza") && !custCar.equalsIgnoreCase("innova") && !custCar.equalsIgnoreCase("fortuner") ;) {
                    System.out.print("jenis mobil : (avanza/innova/fortuner): ");
                    custCar = sc27.next();
                }
                System.out.print("lama rental : ");
                rentalLen = sc27.next();
                for (; !sopir.equalsIgnoreCase("y") && !sopir.equalsIgnoreCase("t") ;) {
                    System.out.print("Apakah menggunakan sopir? (y/t): ");
                    sopir = sc27.next();
                }
                System.out.println("\n\n");
                String cetak = "";
                for (; !cetak.equalsIgnoreCase("y") && !cetak.equalsIgnoreCase("t") ;) {
                    System.out.print("Apakah anda ingin mencetak data peminjam? (y/t): ");
                    cetak = sc27.next();
                }
                if (cetak.equalsIgnoreCase("y")) {
                    System.out.println("=========================");
                    System.out.println("Data Peminjam");
                    System.out.println("=========================");
                    System.out.println("Nama : " + currentCustName);
                    System.out.println("Alamat : " + custAddress);
                    System.out.println("Nohp : " + custPhone);
                    System.out.println("Jenis Mobil : " + custCar);
                    System.out.println("Apakah menggunakan sopir : " + sopir);
                    System.out.println("Perkiraan lama rental : " + rentalLen);
                    
                    String kembali = "";
                    for (; !kembali.equalsIgnoreCase("y") && !kembali.equalsIgnoreCase("t") ;) {
                        System.out.print("Apakah anda ingin kembali ke menu utama? (y/t): ");
                        kembali = sc27.next();
                    }
                    if (kembali.equalsIgnoreCase("y")) {
                        menu = "pilih";
                        continue;
                    } else {
                        break;
                    }

                } else {
                    String kembali = "";
                    for (; !kembali.equalsIgnoreCase("y") && !kembali.equalsIgnoreCase("t") ;) {
                        System.out.print("Apakah anda ingin kembali ke menu utama? (y/t): ");
                        kembali = sc27.next();
                    }
                    if (kembali.equalsIgnoreCase("y")) {
                        menu = "pilih";
                        continue;
                    } else {
                        break;
                    }
                }
            } else if (menu.equals("2")) {
                
            } else {
                menu = "";
                continue;
            }
        }

    }
}