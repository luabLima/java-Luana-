public class Funcionario {
			
	private String nome;
	private double salario;
					
Funcionario (String nome, double salario) {
	this.nome = nome;
	this.salario = salario;
	}
					
public String getNome() {
	return nome;
}
					
public void setSalario(double salario) {
	this.salario = salario;
}
public void aumentarSalario(double percentualDeSalario) {
	salario += aumento * (percentualdeAumento / 100);
						
  }
  public static void main(String[] args) {
	Funcionario meuFuncionario = new Funcionario("Luana", "1.200","percentualDeAUmento");
	System.out.println("Digite o percentual de aumento: ");

  }
}
