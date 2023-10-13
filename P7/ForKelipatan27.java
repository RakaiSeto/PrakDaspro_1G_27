package P7;

import java.util.Scanner;

public class ForKelipatan27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        int kelipatan, jumlah=0, counter=0, rata;
        System.out.println("masukkan bilangan kelipatan (1-9)");
        kelipatan=sc27.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah+=i;
                counter++;
            }
        }

        rata = jumlah/counter;

        System.out.printf("rata rata : %d%n", rata);
        System.out.printf("banyaknya : %d%n", counter);
        System.out.printf("jumlah : %d%n", jumlah);
    }
}
