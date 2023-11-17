import java.util.Scanner;

public class Star27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        System.out.println("Masukkan nilai N");
        int N = sc27.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("*");
        }
    }
}
