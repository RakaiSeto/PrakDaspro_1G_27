package P13;

import java.util.Scanner;

public class Percobaan6_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukkan panjang : ");
        p = input.nextInt();
        System.out.print("Masukkan lebar : ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah : " + L);
        
        vol = hitungVolume(p, l, t);
        System.out.println("Volume balok adalah : " + vol);
    }

    static int hitungLuas (int pjg, int lb) {
        int Luas = pjg*lb;
        return Luas;
    }
    static int hitungVolume (int pjg, int lb, int t) {
        int Volume = pjg*lb*t;
        return Volume;
    }
}
