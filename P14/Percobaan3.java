package P14;

import java.util.Scanner;

public class Percobaan3 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        System.out.print("Jumlah saldo awal : ");
        int saldoAwal = sc27.nextInt();
        System.out.print("Lama investasi (tahun) : ");
        int tahun = sc27.nextInt();
        System.out.println("Jumlah saldo setelah " + tahun + " tahun : ");
        System.out.println(hitungLaba(saldoAwal, tahun));
    }

    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return saldo;
        } else {
            return (1.11 * hitungLaba(saldo, tahun-1));
        }
    }
}
