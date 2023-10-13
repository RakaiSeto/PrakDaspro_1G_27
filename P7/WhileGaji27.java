package P7;

import java.util.Scanner;

/**
 * WhileGaji27
 */
public class WhileGaji27 {

    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        int jumlahKaryawan, jumlahLembur;
        double gajiLembur=0, jumlahGajiLembur=0;
        String jabatan;

        System.out.println("Masukkan jumlah karyawan: ");
        jumlahKaryawan = sc27.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke " + (i++) + " : ");
            jabatan = sc27.next();
            System.out.print("Masukkan jam lembur : ");
            jumlahLembur = sc27.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahLembur * 75000;
            }

            jumlahGajiLembur += gajiLembur;
        }
    }
}