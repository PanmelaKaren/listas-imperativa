import java.util.*;

public class Questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        for (int i = 1; i <= s; i++) {
            int n = sc.nextInt();
            double[] precos = new double[n];
            for (int j = 0; j < n; j++) {
                precos[j] = sc.nextDouble();
            }

            // Selection Sort
            for (int j = 0; j < n - 1; j++) {
                int min = j;
                for (int k = j + 1; k < n; k++) {
                    if (precos[k] < precos[min]) {
                        min = k;
                    }
                }
                double temp = precos[j];
                precos[j] = precos[min];
                precos[min] = temp;
            }

            System.out.print("Precos ordenados da secao " + i + ": ");
            for (double preco : precos) System.out.print(preco + " ");
            System.out.println();
            System.out.println("Preco mais barato da secao " + i + ": " + precos[0]);
            System.out.println("Preco mais caro da secao " + i + ": " + precos[n - 1]);
        }
    }
}
