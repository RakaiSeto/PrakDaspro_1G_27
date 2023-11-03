import java.util.Scanner;

public class gaji {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok : ");
        
        int gaji = sc27.nextInt();
        int thr = (int) ((gaji - (0.05 * gaji)) + 55000);
        int total = (int) (gaji + thr);
        System.out.println("THR : " + thr);
        System.out.println("Total : " + total);
        sc27.close();
    }
}
