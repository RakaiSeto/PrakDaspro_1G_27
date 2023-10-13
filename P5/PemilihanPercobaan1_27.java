import java.util.Scanner;

public class PemilihanPercobaan1_27 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        try {
            System.out.println("Masukkan angka");
            int angka = input27.nextInt();
            String result = (angka % 2 == 0) ? (result = "Genap") : (result = "Ganjil");
                System.out.println("Angka " + angka + " adalah " + result);
        } finally {
            input27.close();
        }
    }
}
