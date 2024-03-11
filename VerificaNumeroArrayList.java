import java.util.ArrayList;
import java.util.Scanner;

public class VerificaNumeroArrayList {
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

        System.out.print("Digite um número para verificar se está na lista: ");
        int numeroVerificar = scanner.nextInt();

        
        boolean presente = verificarNumero(listaDeNumeros, numeroVerificar);

        if (presente) {
            System.out.println(numeroVerificar + " está presente na lista.");
        } else {
            System.out.println(numeroVerificar + " não está presente na lista.");
        }

        scanner.close();
    }

    private static boolean verificarNumero(ArrayList<Integer> lista, int numero) {
        return lista.contains(numero);
    }
}
