import java.util.Scanner;

public class ArrayDua27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        int data[][] = new int[4][4];

        int jam[] = {3, 6, 9, 12};
        int min[] = {100, 100, 100, 100};
        double total[] = {0, 0, 0, 0};
        double rata[] = {0, 0, 0, 0};

        for (int i = 0; i < data.length; i++) {
            System.out.printf("Jam %s\n", jam[i]);
            for (int j = 0; j < data[0].length; j++) {
                switch (j) {
                    case 0:
                        System.out.println("Masukkan suhu :");
                        data[i][j] = sc27.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        total[j] = data[i][j];
                        break;
                    case 1:
                        System.out.println("Masukkan kelembapan :");
                        data[i][j] = sc27.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        total[j] = data[i][j];
                        break;
                    case 2:
                        System.out.println("Masukkan kecepatan angin :");
                        data[i][j] = sc27.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        total[j] = data[i][j];
                        break;
                    case 3:
                        System.out.println("Masukkan index UV :");
                        data[i][j] = sc27.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        }
                        total[j] = data[i][j];
                        break;
                }
                rata[j]= total[j] / data[0].length;
            }
        }

        System.out.println("-----------------");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.println(data[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("-----------------");
        System.out.printf("Rata rata suhu: %.2f\n", rata[0]);
        System.out.printf("Persentase kelembapan terendah: %s\n", min[1]);
        System.out.println("-----------------");
        System.out.println("Kecepatan angin : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i][2]);
        }
    }
}
