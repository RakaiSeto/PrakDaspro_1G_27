import java.util.Scanner;

public class Pemilihan2Percobaan1_27 {
    public static void main(String[] args) {
        int tahun;

        Scanner sc27 = new Scanner(System.in);
        System.out.print("Masukkan Tahun : ");
        tahun = sc27.nextInt();

        if (tahun%4 == 0) {
            if (tahun %100 == 0) {
                System.out.println("Bukan tahun kabisat");
            } else {
                System.out.println("tahun kabisat");
            }
        }
        System.out.println("tahun kabisat");
    }
}
