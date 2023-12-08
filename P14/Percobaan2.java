package P14;

import java.util.Scanner;

public class Percobaan2 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung : ");
        int bilangan = sc27.nextInt();
        System.out.print("Pangkat : ");
        int pangkat = sc27.nextInt();
        System.out.println(hitungPangkat(bilangan, pangkat));
    }

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y-1));
        }
    }
}
