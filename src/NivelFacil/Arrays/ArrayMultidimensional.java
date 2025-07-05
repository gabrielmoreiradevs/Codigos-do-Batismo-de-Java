package NivelFacil.Arrays;

public class ArrayMultidimensional {
    public static void main(String[] args) {

        String[][] ninjasEAldeias = new String[3][3];
        ninjasEAldeias[0][0] = "Konaha";
        ninjasEAldeias[0][1] = "Naruto";
        ninjasEAldeias[0][2] = "Sasuke";

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza";
        ninjasEAldeias[1][2] = "Haku";

        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        for (int i = 0; i < 3 ; i++) {
            System.out.println("\n");
            for (int j = 0; j < 3; j++) {
                System.out.println(ninjasEAldeias[i][j]);
            }
        }

    }
}
