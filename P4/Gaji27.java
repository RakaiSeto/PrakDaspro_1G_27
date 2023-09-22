import java.util.Scanner;

public class Gaji27 {
    public static void main(String[] args) {
        int jmlMasuk, jmlTidakMasuk, totGaji;
        int gaji = 40000;
        int potGaji = 25000;

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah masuk");
        jmlMasuk = sc.nextInt();
        System.out.println("Masukkan jumlah tidak masuk");
        jmlTidakMasuk = sc.nextInt();

        totGaji = (jmlMasuk * gaji) - (jmlTidakMasuk * potGaji);
        System.out.println("Total Gaji : " + totGaji);
    }
}
