package P14;

public class tugas {
    public static void main(String[] args) {
        DeretDescendingRekursif(10);
        int total = 0;
        total = PenjumlahanRekursif(10, total);
        System.out.println();
        System.out.println("total penjumlahan rekursif: " + total);
        System.out.println(CekPrimaRekursif(11, 2));
        for (int i = 0; i < 10; i++) {
 
            System.out.print(Fibonacci(i) + " ");
        }
        System.out.println();
    }

    static void DeretDescendingRekursif(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.print(n + " ");
            DeretDescendingRekursif(n - 1);
        }
    }

    static int PenjumlahanRekursif(int n, int total) {
        if (n == 0) {
            return total;
        }
        return n + PenjumlahanRekursif(n-1, total);
    }

    static boolean CekPrimaRekursif(int n, int startFrom) {
        if (n <= 2) {
            if (n == 2) {
                return true; 
            } else {
                return false;
            }
        } else if (n % startFrom == 0) {
            return false; 
        } else if (startFrom * startFrom > n) {
            return true;
        }

        return CekPrimaRekursif(n, startFrom + 1);
    }

    static int Fibonacci(int n)
    {
        if (n <= 1) {
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
