import java.util.*;

public class Questao07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] avaliacoes = new int[n];

        for (int i = 0; i < n; i++) {
            avaliacoes[i] = sc.nextInt();
        }

        // Bubble Sort decrescente
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (avaliacoes[j] < avaliacoes[j + 1]) {
                    int temp = avaliacoes[j];
                    avaliacoes[j] = avaliacoes[j + 1];
                    avaliacoes[j + 1] = temp;
                }
            }
        }

        System.out.print("Avaliacoes ordenadas: ");
        for (int v : avaliacoes) System.out.print(v + " ");
        System.out.println("\nMelhor avaliacao: " + avaliacoes[0]);
        System.out.println("Pior avaliacao: " + avaliacoes[n - 1]);
    }
}
