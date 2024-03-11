import java.util.Scanner;

public class MediaVetor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        
        int[] vetor = new int[tamanho];

        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        
        double media = calcularMedia(vetor);
        System.out.println("A média dos elementos do vetor é: " + media);

        
        scanner.close();
    }

    
    private static double calcularMedia(int[] vetor) {
        int soma = 0;

    
        for (int elemento : vetor) {
            soma += elemento;
        }

    
        double media = (double) soma / vetor.length;

        return media;
    }
}
