import java.util.Scanner;

public class Harga_Bayar_27 {
    public static void main(String[] args) {
        int harga, jumlah, halamanBuku;
        double dis, total, bayar, jmlDis;
        String merkBuku;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan harga yang dibeli");
        harga = sc.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli");
        jumlah = sc.nextInt();
        System.out.println("Masukkan Jumlah halaman buku yang dibeli");
        halamanBuku = sc.nextInt();
        System.out.println("Masukkan Jumlah diskon");
        dis = sc.nextDouble();
        System.out.println("Masukkan Merk buku");
        merkBuku = sc.next();
        total = harga * jumlah;
        jmlDis = total*dis;
        bayar = total-jmlDis;
        System.out.println("Anda membeli buku dengan merk : " + merkBuku + " dengan jumlah halaman : " + halamanBuku);
        System.out.println("Diskon yang anda dapatkan : " + jmlDis);
        System.out.println("Jumlah yang harus anda bayar : " + bayar);
    }
}
