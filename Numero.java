import java.util.Scanner;

class Numero {
   
    public static boolean eImpar(int n) {
        return n % 2 != 0;
    }

    public static boolean ePositivo(int n) {
        return n > 0;
    }
}

 class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Insira um número inteiro: ");
        int numero1 = scanner.nextInt();

        if (Numero.eImpar(numero1)) {
            System.out.println(numero1 + " é ímpar.");
        } else {
            System.out.println(numero1 + " não é ímpar.");
        }

        
        System.out.print("Insira outro número inteiro: ");
        int numero2 = scanner.nextInt();

        
        if (Numero.ePositivo(numero2)) {
            System.out.println(numero2 + " é positivo.");
        } else {
            System.out.println(numero2 + " não é positivo.");
        }

        
        scanner.close();
    }
}
