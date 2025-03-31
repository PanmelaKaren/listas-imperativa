import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 10, cols = 10;
        int[][] seats = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = -1;
            }
        }
        
        System.out.print("Digite o número de tentativas de compra: ");
        int N = scanner.nextInt();
        
        for (int i = 0; i < N; i++) {
            System.out.print("Digite a linha e a coluna da poltrona desejada: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            
            if (seats[row][col] == 1) {
                System.out.println("Poltrona já foi vendida");
            } else {
                seats[row][col] = 1;
                System.out.println("Poltrona foi vendida");
            }
        }
        
        System.out.println("\nMatriz final com as poltronas ocupadas e vazias:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
