public class NamaLoop27 {
    public static void main(String[] args) {
        String nama = "RakaiSetoSembodo";
        char[] Array = nama.toCharArray();
        char[][] namaArray = new char[8][5];
        int index = 0;

        for (int i = 0; i < namaArray.length; i++) {
            for (int j = 0; j < namaArray[0].length; j++) {
                if (index < Array.length) {
                    namaArray[i][j] = Array[index];
                    index++;
                    System.out.print(namaArray[i][j] + "  ");
                } else {
                    index = 0;
                    namaArray[i][j] = Array[index];
                    index++;
                    System.out.print(namaArray[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}
