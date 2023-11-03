import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        Random rand = new Random();
        int jawaban = rand.nextInt(100);

        int tebakan = 0;
        for (; tebakan != jawaban; ) {
            System.out.print("tebakan anda : ");
            tebakan = sc27.nextInt();

            if (tebakan == jawaban) {
                System.out.println("JAWABAN BENAR");
            } else if (tebakan < jawaban) {
                System.out.println("tebakan lebih kecil dari jawaban");
            } else {
                System.out.println("tebakan lebih besar dari jawaban");
            }
        }
    }
}
