import java.util.Scanner;
import java.util.HashSet;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        HashSet<Integer> setNumeros = new HashSet<>();
        int contador = 0;

        while (contador < 10) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (!setNumeros.contains(numero)) {
                numeros[contador] = numero;
                setNumeros.add(numero);
                contador++;
            } else {
                System.out.println("Número já digitado! Tente outro.");
            }
        }


        System.out.print("Números digitados: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

