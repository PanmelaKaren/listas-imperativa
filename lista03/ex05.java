import java.util.*;

public class Questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();

        for (int i = 1; i <= p; i++) {
            int n = sc.nextInt();
            int[] vendas = new int[n];
            for (int j = 0; j < n; j++) {
                vendas[j] = sc.nextInt();
            }

            // Insertion sort
            for (int j = 1; j < n; j++) {
                int chave = vendas[j];
                int k = j - 1;
                while (k >= 0 && vendas[k] > chave) {
                    vendas[k + 1] = vendas[k];
                    k--;
                }
                vendas[k + 1] = chave;
            }

            // Mediana
            double mediana = (n % 2 == 0)
                ? (vendas[n / 2 - 1] + vendas[n / 2]) / 2.0
                : vendas[n / 2];

            System.out.print("Vendas ordenadas do produto " + i + ": ");
            for (int v : vendas) System.out.print(v + " ");
            System.out.println("\nMediana das vendas do produto " + i + ": " + mediana);
        }
    }
}
