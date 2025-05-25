import java.util.*;

public class Questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }

        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            if (vetor[i] == x) {
                System.out.println(i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("-1");
        }
    }
}
