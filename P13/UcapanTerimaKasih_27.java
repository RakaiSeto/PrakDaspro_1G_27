package P13;

import java.util.Scanner;

public class UcapanTerimaKasih_27 {
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+ nama + "for being the best teacher in the world.\n" + "You inspired in me a love for learning and made me feel like i can ask you anything");
        String ucapan = "Terima Kasih Pak.. Bu.. Semoga Sehat Selalu";
        UcapanTambahan(ucapan);
    }

    public static String PenerimaUcapan() {
        Scanner sc27 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan");
        String namaOrang = sc27.nextLine();
        sc27.close();
        return namaOrang;
    }

    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }
}
