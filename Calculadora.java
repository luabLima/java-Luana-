public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora minhaCalculadora = new Calculadora();
        int resultado = minhaCalculadora.somar(50, 50);
        System.out.println("Resultado da soma: " + resultado);
    }
}
