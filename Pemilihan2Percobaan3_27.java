import java.util.Scanner;

public class Pemilihan2Percobaan3_27 {
    public static void main(String[] args) {
        String kategori;
        int penghasilan, gajibersih;
        double pajak;

        Scanner sc27 = new Scanner(System.in);

        System.out.println("Masukkan kategori :");
        kategori = sc27.next();
        
        System.out.println("Masukkan penghasilan :");
        penghasilan = sc27.nextInt();

        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
        } else {
            System.out.println("kategori salah");
            return;
        }
        gajibersih = (int) (penghasilan - (penghasilan * pajak));
        System.out.printf("gaji bersih : ", gajibersih);

    }
}
