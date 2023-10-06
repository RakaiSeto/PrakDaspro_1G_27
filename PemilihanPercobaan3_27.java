import java.util.Scanner;

public class PemilihanPercobaan3_27 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        try {
            double angka1, angka2, hasil;
            char operator;

            System.out.println("Masukkan angka pertama");
            angka1 = input27.nextDouble();
            System.out.println("Masukkan angka kedua");
            angka2 = input27.nextDouble();
            System.out.println("Masukkan operator (+ - * /)");
            operator = input27.next().charAt(0);

            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                    break;
                case '/':
                    hasil = angka1 / angka2;
                    System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                    break;
                default :
                    System.out.println("operator tidak dikenali");
                    break;
            }
        } finally {
            input27.close();
        }
    }
}
