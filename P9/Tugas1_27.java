import java.util.Scanner;

public class Tugas1_27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array : ");

        int elemen = sc27.nextInt();
        int[] arrayInt = new int[elemen];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen ke " + (i+1) + " : ");
            arrayInt[i] = sc27.nextInt();
        }

        int total = 0;
        int tertinggi = 0;
        int terendah = 100;

        for (int i = 0; i < arrayInt.length; i++) {
            total += arrayInt[i];
            if (arrayInt[i] > tertinggi) {
                tertinggi = arrayInt[i];
            }
            if (arrayInt[i] < terendah) {
                terendah = arrayInt[i];
            }
        }

        System.out.println("nilai rata2     : " + (total / elemen));
        System.out.println("nilai tertinggi : " + tertinggi);
        System.out.println("nilai terendah  : " + terendah);
    }
}
