import java.util.Scanner;

public class PemilihanPercobaan2_27 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        try {
            System.out.println("Masukkan nilai UAS : ");
            float UAS = input27.nextFloat();
            System.out.println("Masukkan nilai UTS : ");
            float UTS = input27.nextFloat();
            System.out.println("Masukkan nilai kuis : ");
            float kuis = input27.nextFloat();
            System.out.println("Masukkan nilai tugas : ");
            float tugas = input27.nextFloat();

            float result = (UAS * 0.4F) + (UTS * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

            if (result < 65) {
                System.out.println("Siswa perlu remidi karena nilai : " + result);
            } else {
                System.out.println("Siswa tidak perlu remidi karena nilai : " + result);
            }
        } finally {
            input27.close();
        }
    }
}