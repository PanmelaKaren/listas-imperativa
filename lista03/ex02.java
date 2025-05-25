import java.util.*;

public class Questao02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();

        String[] livros = new String[n];
        for (int i = 0; i < n; i++) {
            livros[i] = s.nextLine();
        }

        String busca = s.nextLine().toLowerCase();
        boolean achou = false;

        for (String livro : livros) {
            if (livro.toLowerCase().contains(busca)) {
                System.out.println(livro);
                achou = true;
            }
        }

        if (!achou) {
            System.out.println("Livro nao encontrado!");
        }
    }
}
