import java.util.Scanner;

public class PersegiAngka27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int n = scanner.nextInt();
        
        if (n < 3) {
            System.out.println("Nilai N minimal 3.");
            return;
        }
        
        String[][] grid = new String[n][n];

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = Integer.toString(n);
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1) {
                        grid[i][j] = Integer.toString(n);
                    } else {
                        grid[i][j] = " ";
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
