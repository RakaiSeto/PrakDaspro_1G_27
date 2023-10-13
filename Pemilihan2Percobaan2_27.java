import java.util.Scanner;

public class Pemilihan2Percobaan2_27 {
    public static void main(String[] args) {
        int sudut1, sudut2, sudut3, totalSudut;

        Scanner sc27 = new Scanner(System.in);
        System.out.print("Masukkan Sudut 1 : ");
        sudut1 = sc27.nextInt();
        System.out.print("Masukkan Sudut 2 : ");
        sudut2 = sc27.nextInt();
        System.out.print("Masukkan Sudut 3 : ");
        sudut3 = sc27.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
                System.out.println("Segitiga Siku-siku");
            } else {
                System.out.println("Bukan Segitiga Siku-siku");
            }
        } else {
            System.out.println("Bukan segitiga");
        }
        sc27.close();
    }
}
