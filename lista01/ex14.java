import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de alunos: ");
        int numAlunos = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        
        String[] alunos = new String[numAlunos];
        String[] presencas = new String[numAlunos];
        
        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Digite o nome do aluno: ");
            alunos[i] = scanner.nextLine();
            
            System.out.print("Digite a presença do aluno (F para falta, P para presença): ");
            presencas[i] = scanner.nextLine();
        }
        
        System.out.println("\nAlunos reprovados por falta:");
        for (int i = 0; i < numAlunos; i++) {
            int faltas = 0;
            StringBuilder diasFalta = new StringBuilder();
            
            for (int j = 0; j < presencas[i].length(); j++) {
                if (presencas[i].charAt(j) == 'F') {
                    faltas++;
                    diasFalta.append(j + 1).append(" ");
                }
            }
            
            if (faltas > 10) {
                System.out.println(alunos[i] + " - dias: " + diasFalta.toString().trim());
            }
        }
        
        scanner.close();
    }
}

