import java.util.Scanner;

public class MaiorValorVetor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        int maiorValor = encontrarMaiorValor(vetor);
        System.out.println("O maior valor no vetor é: " + maiorValor);

        scanner.close();
    }

    private static int encontrarMaiorValor(int[] vetor) {
        int maiorValor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
            }
        }

        return maiorValor;
    }
}
