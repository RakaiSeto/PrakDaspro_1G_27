import java.util.Scanner;

public class ArrayRataNilai27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc27.nextInt();
        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totallulus = 0;
        double totaltidaklulus = 0;
        int lulus = 0;
        int tidaklulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke " + (i+1) + " : ");
            nilaiMhs[i] = sc27.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totallulus += nilaiMhs[i];
                lulus++;
            } else {
                totaltidaklulus += nilaiMhs[i];
                tidaklulus++;
            }
        }
        
        System.out.println("Rata rata nilai lulus       : " + (totallulus/lulus));
        System.out.println("Rata rata nilai tidak lulus : " + (totaltidaklulus/tidaklulus));
    }
}
