import java.util.Scanner;

public class Harga_Bayar_27 {
    public static void main(String[] args) {
        int harga, jumlah;
        double dis = 0.1, total, bayar, jmlDis;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan harga yang dibeli");
        harga = sc.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli");
        jumlah = sc.nextInt();
        total = harga * jumlah;
        jmlDis = total*dis;
        bayar = total-jmlDis;
        System.out.println("Diskon yang anda dapatkan : " + jmlDis);
        System.out.println("Jumlah yang harus anda bayar : " + bayar);
    }
}
