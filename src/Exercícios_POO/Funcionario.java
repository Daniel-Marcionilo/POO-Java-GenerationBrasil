package Exercícios_POO;

public class Funcionario {

	private int matricula;
	private String nome;
	private int idade;
	private String cargo;
	
	public Funcionario(int m, String n, int i, String c) {
		this.matricula = m;
		this.nome = n;
		this.idade = i;
		this.cargo = c;
	}
	
	public void trabalhar() {
		System.out.println("Trabalhando...");
	}
	
	public void almocar() {
		System.out.println("Almoçar!");
	}
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(233, "Jake", 54, "Dev Java");
		Funcionario f2 = new Funcionario(236, "Daniel", 19, "Dev Java Jr Full Stack");
		
		System.out.println(f2.matricula + " " + f2.nome + " " + f2.idade + " " + f2.cargo);
		
		f2.almocar();
		f2.trabalhar();
	}

}
