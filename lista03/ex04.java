import java.util.*;

public class Questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();

        String[] generos = new String[l];
        for (int i = 0; i < l; i++) {
            generos[i] = sc.nextLine();
        }

        String[][] matriz = new String[l][c];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = sc.nextLine();
            }
        }

        String busca = sc.nextLine();
        for (int i = 0; i < l; i++) {
            int esq = 0, dir = c - 1;
            while (esq <= dir) {
                int meio = (esq + dir) / 2;
                int cmp = matriz[i][meio].compareToIgnoreCase(busca);
                if (cmp == 0) {
                    System.out.println(generos[i]);
                    return;
                } else if (cmp < 0) {
                    esq = meio + 1;
                } else {
                    dir = meio - 1;
                }
            }
        }
        System.out.println("Nao encontrado");
    }
}
