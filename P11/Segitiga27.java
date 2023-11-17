import java.util.Scanner;

public class Segitiga27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        System.out.println("Masukkan nilai N");
        int N = sc27.nextInt();

        if(N >= 3) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai tidak valid");
        }
    }

    
}
