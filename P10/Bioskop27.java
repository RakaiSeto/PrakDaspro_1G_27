package P10;

public class Bioskop27 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];

        penonton[0][0] = "Rakai";
        penonton[0][1] = "Linlin";
        penonton[1][0] = "Dina";
        penonton[1][1] = "Fabian";
        penonton[2][0] = "Yefta";
        penonton[2][1] = "Adam";
        penonton[3][0] = "Fandy";
        penonton[3][1] = "Adani";

        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

        System.out.println(penonton.length);
        for (String[] barisPenonton : penonton) {
            System.out.println(barisPenonton.length);
        }

        System.out.println("Penonton pada baris ke 3 : ");
        for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }

        
    }
}