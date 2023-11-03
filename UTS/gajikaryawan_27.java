import java.util.Scanner;

public class gajikaryawan_27 {
    public static void main(String[] args) {
        Scanner scRakai = new Scanner(System.in);
        String nama27="", alamat27="", phone27="", golongan27="", masakerja27="", jumlahhadir27="", menu27="";
        Boolean isInput27 = false;

        System.out.println("=== UTS PRAKTIKUM DASAR PEMROGRAMAN TI-1G ===");
        System.out.println("dibuat oleh : Rakai Seto Sembodo");
        System.out.println("NIM         : 2341720135");
        System.out.println("=============================================\n");

        for(; ;) {
            if (menu27.equals("pilih") || menu27.equals("")) {
                System.out.println("=========================");
                System.out.println("Pilih menu :");
                System.out.println("1. Data Karyawan");
                System.out.println("2. Gaji Karyawan");
                System.out.print("menu : ");
                menu27 = scRakai.next();
            } else if (menu27.equals("1")) {
                System.out.println("=========================");
                System.out.println("Data Karyawan");
                System.out.println("=========================");
                System.out.print("Nama : ");
                nama27 = scRakai.next();
                System.out.print("Alamat : ");
                alamat27 = scRakai.next();
                System.out.print("Nohp : ");
                phone27 = scRakai.next();
                for (; !golongan27.equalsIgnoreCase("1") && !golongan27.equalsIgnoreCase("2") && !golongan27.equalsIgnoreCase("3") ;) {
                    System.out.print("Golongan : (1/2/3): ");
                    golongan27 = scRakai.next();
                }
                System.out.print("Masa kerja : ");
                masakerja27 = scRakai.next();
                System.out.print("Jumlah Kehadiran : ");
                jumlahhadir27 = scRakai.next();
                isInput27 = true;

                System.out.println("\n\n");
                String cetak27 = "";
                for (; !cetak27.equalsIgnoreCase("y") && !cetak27.equalsIgnoreCase("t") ;) {
                    System.out.print("Apakah anda ingin mencetak data karyawan? (y/t): ");
                    cetak27 = scRakai.next();
                }
                if (cetak27.equalsIgnoreCase("y")) {
                    System.out.println("=========================");
                    System.out.println("Data Karyawan");
                    System.out.println("=========================");
                    System.out.println("Nama : " + nama27);
                    System.out.println("Alamat : " + alamat27);
                    System.out.println("Nohp : " + phone27);
                    System.out.println("Golongan : " + golongan27);
                    System.out.println("Masa Kerja : " + masakerja27);
                    System.out.println("Jumlah Kehadiran : " + jumlahhadir27);
                    
                    String kembali27 = "";
                    for (; !kembali27.equalsIgnoreCase("y") && !kembali27.equalsIgnoreCase("t") ;) {
                        System.out.print("kembali ke menu? {y/t}: ");
                        kembali27 = scRakai.next();
                    }
                    if (kembali27.equalsIgnoreCase("y")) {
                        menu27 = "pilih";
                        continue;
                    } else {
                        System.out.println("=== TERIMA KASIH ===");
                        break;
                    }

                } else {
                    String kembali27 = "";
                    for (; !kembali27.equalsIgnoreCase("y") && !kembali27.equalsIgnoreCase("t") ;) {
                        System.out.print("kembali ke menu? {y/t}: ");
                        kembali27 = scRakai.next();
                    }
                    if (kembali27.equalsIgnoreCase("y")) {
                        menu27 = "pilih";
                        continue;
                    } else {
                        System.out.println("=== TERIMA KASIH ===");
                        break;
                    }
                }
            } else if (menu27.equals("2")) {
                if (isInput27) {
                    
                    System.out.println("=========================");
                    System.out.println("Gaji Karyawan");
                    System.out.println("=========================");
                    System.out.println("Nama : " + nama27);
                    double gajiPokok27 = 0;
                    switch (golongan27) {
                        case "1":
                            gajiPokok27 = 2000000;
                        case "2":
                            gajiPokok27 = 2500000;
                        case "3":
                            gajiPokok27 = 3000000;
                    }
                    double tunjangan27 = 0;
                    double newMasaKerja27 = Double.valueOf(masakerja27);
                    if (newMasaKerja27 < 1) {
                        tunjangan27 = 0;
                    } else if (newMasaKerja27 >= 1 && newMasaKerja27 < 6) {
                        tunjangan27 = 0.1 * gajiPokok27;
                    } else if (newMasaKerja27 >= 6 && newMasaKerja27 <= 8) {
                        tunjangan27 = 0.2 * gajiPokok27;
                    } else {
                        tunjangan27 = 0.25 * gajiPokok27;
                    }

                    double newKehadiran27 = Double.valueOf(jumlahhadir27);
                    double makan27 = newKehadiran27*35000;
                    double totalGaji27 = makan27 + tunjangan27 + gajiPokok27;

                    System.out.println("Gaji Pokok         : " + gajiPokok27);
                    System.out.println("Tunjangan          : " + tunjangan27);
                    System.out.println("Uang makan         : " + makan27);
                    System.out.println("Gaji yang diterima : " + totalGaji27);

                    String kembali27 = "";
                    for (; !kembali27.equalsIgnoreCase("y") && !kembali27.equalsIgnoreCase("t") ;) {
                        System.out.print("kembali ke menu? {y/t}: ");
                        kembali27 = scRakai.next();
                    }
                    if (kembali27.equalsIgnoreCase("y")) {
                        menu27 = "pilih";
                        continue;
                    } else {
                        System.out.println("=== TERIMA KASIH ===");
                        break;
                    }

                } else {
                    System.out.println("Masukkan data karyawan terlebih dahulu");
                    String kembali27 = "";
                    for (; !kembali27.equalsIgnoreCase("y") && !kembali27.equalsIgnoreCase("t") ;) {
                        System.out.print("kembali ke menu? {y/t}: ");
                        kembali27 = scRakai.next();
                    }
                    if (kembali27.equalsIgnoreCase("y")) {
                        menu27 = "pilih";
                        continue;
                    } else {
                        System.out.println("=== TERIMA KASIH ===");
                        break;
                    }
                }
            } else {
                menu27 = "";
                continue;
            }
        }
    }
}
