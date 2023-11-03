import java.util.Scanner;

public class LinearSearch27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array : ");

        int elemen = sc27.nextInt();
        int[] arrayInt = new int[elemen];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen ke " + (i+1) + " : ");
            arrayInt[i] = sc27.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari : ");

        int key = sc27.nextInt();
        int hasil = 0;
        boolean isfound = false;

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                isfound = true;
                break;
            }
        }

        if (isfound) {
            System.out.println("Key ada dalam array pada posisi index ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan");
        }
    }
}
