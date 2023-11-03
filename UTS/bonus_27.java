import java.util.Scanner;

public class bonus_27 {
    public static void main(String[] args) {
        int input27 = 0;
        int n27 = 0, charCounter27 = 0;

        String theString27 = "ABCDE";
        String outputString27 = "";

        Scanner scRakai = new Scanner(System.in);
        System.out.print("MASUKKAN NIM : ");
        input27 = scRakai.nextInt();
        if (input27 % 10 < 5) {
            n27 = input27 % 10 + 5;
        } else {
            n27 = input27 % 10;
        }

        for (int i = 0; i < n27; i++) {
            outputString27 += theString27.charAt(charCounter27);
            if (charCounter27 == 4) {
                charCounter27 = 0;
            } else {
                charCounter27++;
            }
        }

        System.out.println(outputString27);
    }
}
