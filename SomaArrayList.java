import java.util.ArrayList;
import java.util.Scanner;

public class SomaArrayList {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        
        System.out.print("Digite o tamanho da lista: ");
        int tamanho = scanner.nextInt();

        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            listaDeNumeros.add(numero);
        }

        int soma = calcularSoma(listaDeNumeros);
        System.out.println("A soma dos elementos na lista é: " + soma);

        scanner.close();
    }

    private static int calcularSoma(ArrayList<Integer> lista) {
        int soma = 0;

        for (int numero : lista) {
            soma += numero;
        }

        return soma;
    }
}

