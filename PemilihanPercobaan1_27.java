import java.util.Scanner;

public class PemilihanPercobaan1_27 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        try {
            System.out.println("Masukkan angka");
            int angka = input27.nextInt();

            if (angka % 2 == 0) {
                System.out.println("Angka " + angka + " adalah Genap");
            } else {
                System.out.println("Angka " + angka + " adalah Ganjil");
            }
        } finally {
            input27.close();
        }
    }
}
