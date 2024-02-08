import java.util.Scanner;

class Vetor {
    private int[] vetor;

    
    public void preencher(int n) {
        vetor = new int[n];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os elementos do vetor:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        
        scanner.close();
    }

     
    public int[] getVetor() {
        return vetor;
    }
}

class Matriz {
    private int[][] matriz;

    
    public void preencher(int m, int n) {
        matriz = new int[m][n];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os elementos da matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        
        scanner.close();
    }

    
    public int[][] getMatriz() {
        return matriz;
    }
}

class Verificador {
    
    public boolean ePar(int n) {
        return n % 2 == 0;
    }
}

 class Principal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Vetor vetorObj = new Vetor();

        
        System.out.print("Digite o tamanho do vetor: ");
        int tamanhoVetor = scanner.nextInt();
        vetorObj.preencher(tamanhoVetor);

        
        Matriz matrizObj = new Matriz();

        
        System.out.print("Digite o número de linhas da matriz: ");
        int linhasMatriz = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunasMatriz = scanner.nextInt();
        matrizObj.preencher(linhasMatriz, colunasMatriz);

        
        Verificador verificadorObj = new Verificador();

        
        System.out.println("\nVerificação para o vetor:");
        int[] vetor = vetorObj.getVetor();
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + (verificadorObj.ePar(vetor[i]) ? "Par" : "Ímpar"));
        }

        
        System.out.println("\nVerificação para a matriz:");
        int[][] matriz = matrizObj.getMatriz();
        for (int i = 0; i < linhasMatriz; i++) {
            for (int j = 0; j < colunasMatriz; j++) {
                System.out.println("Elemento [" + (i + 1) + "][" + (j + 1) + "]: "
                        + (verificadorObj.ePar(matriz[i][j]) ? "Par" : "Ímpar"));
            }
        }

        
       
    }
}
