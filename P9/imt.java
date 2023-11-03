import java.util.Scanner;

public class imt {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        System.out.print("Input tinggi badan dalam meter   : ");
        double tinggi = sc27.nextDouble();
        System.out.print("Input berat badan dalam kilogram : ");
        int berat = sc27.nextInt();

        double imt = (berat / (tinggi * tinggi));


        System.out.println("imt : " + imt);
        if (imt < 17) {
            System.out.println("sangat kurus");
        } else if (imt >= 17 && imt < 18.5) {
            System.out.println("kurus");
        } else if (imt >= 18.5 && imt <= 25.0) {
            System.out.println("normal");
        } else if (imt > 25.0 && imt <= 27.0) {
            System.out.println("gemuk");
        } else {
            System.out.println("obesitas");
        }
    }
}
