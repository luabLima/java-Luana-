public class Main {
// Definindo a classe "Carro"
static class Carro { //colocar o static
    // Atributos da classe
    private String marca; // Atributo privado para encapsulamento
    private String modelo;
    private int anoDeFabricacao;
    private String cor;
    private int velocidadeAtual;  // Atributo privado para encapsulamento
    
    // Método construtor da classe para inicializar os atributos
    Carro(String marca, String modelo, int anoDeFabricacao, String cor, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.cor = cor;
        this.velocidadeAtual = velocidadeAtual;
    }
    
    // Método getter para obter a marca do carro
    public String getMarca() {
        return marca;
    }
    
    // Método getter para obter a modelo do carro
    public String getModelo() {
        return modelo;
    }
    // Método getter para obter o ano de fabricação do carro
    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }
    // Método getter para obter a cor do carro
    public String getCor() {
        return cor;
    }
    // Método getter para obter a velocidade atual do carro
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}

// Classe principal que contém o método main
//public class Main { //não tem aqui so la em cima 
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa chamado "pessoa1"
        Carro carro1 = new Carro("Ferrari", "GTR", 1990, "vermelho", 40); //aspas tudo que for STRING
        
        // Usando os métodos getters para obter e imprimir as informações da pessoa
        System.out.println("Marca: " + carro1.getMarca()); // Obtém e imprime a marca do carro
        System.out.println("Modelo: " + carro1.getModelo()); // Obtém e imprime o modelo dao carro
        System.out.println("AnoDeFabricacao: " + carro1.getAnoDeFabricacao()); // Obtém e imprime o ano de fabricação do carro
        System.out.println("Cor: " + carro1.getCor()); // Obtém e imprime a cor do carro
        System.out.println("VelocidadeAtual: " + carro1.getVelocidadeAtual()); // Obtém e imprime a velocidade atual do carro
    }
}
