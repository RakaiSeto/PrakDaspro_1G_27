import java.util.Scanner;

/**
 * NestedLoop_2341720135
 */
public class NestedLoop_2341720135 {

    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        double[][] arrayKota = new double[5][7];

        for (int i = 0; i < arrayKota.length; i++) {
            System.out.println("Kota ke " + i);
            for (int j = 0; j < arrayKota[i].length; j++) {
                System.out.println("Hari ke " + (j+i) + ": ");
                arrayKota[i][j] = sc27.nextDouble();
            }
        }

        for (int i = 0; i < arrayKota.length; i++) {
            System.out.println("Kota ke " + i);
            for (int j = 0; j < arrayKota[i].length; j++) {
                System.out.print(arrayKota[i][j] + " ");
            }
            System.out.println();
        }
    }
}