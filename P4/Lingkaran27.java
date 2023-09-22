import java.util.Scanner;

class Lingkaran27 {
    public static void main(String[] args) {
        int r;
        double keliling, luas;
        double phi = 3.14;
        System.out.println("Masukkan jari-jari lingkaran");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();

        keliling = 2 * phi * r;
        luas = phi * r * r;

        System.out.println("Keliling : " + keliling);
        System.out.println("Luas : " + luas);
    }
}