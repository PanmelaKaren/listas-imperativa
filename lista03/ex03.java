import java.util.*;

public class Questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int alvo = sc.nextInt();

        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }

        int passos = 0;
        int esquerda = 0, direita = n - 1;
        while (esquerda <= direita) {
            passos++;
            int meio = (esquerda + direita) / 2;
            if (vetor[meio] == alvo) {
                System.out.println(meio + " " + passos);
                return;
            } else if (vetor[meio] < alvo) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        System.out.println("-1 " + passos);
    }
}
