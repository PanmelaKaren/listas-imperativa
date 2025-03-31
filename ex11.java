public class ex11 {
    public static void main(String[] args) {
    
        double[] V = {12, 15, 14, 10, 18, 20, 17, 13, 16, 19};
        int n = V.length;

        double soma = 0;
        for (double num : V) {
            soma += num;
        }
        double media = soma / n;

        double somaDiferencas = 0;
        for (double num : V) {
            somaDiferencas += Math.pow(num - media, 2);
        }

        double desvioPadrao = Math.sqrt(somaDiferencas / (n - 1));

        System.out.printf("Desvio Padrão: %.2f%n", desvioPadrao);
    }
}
