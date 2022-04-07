package Exercícios_POO;

public class Paciente {
	
	private String nome;
	private String estadoAtual;
	private int idade;
	private double altura;
	private double peso;
	
	public Paciente(String n, String e, int i, double a, double p) {
		this.nome = n;
		this.estadoAtual = e;
		this.idade = i;
		this.altura = a;
		this.peso = p;
	}
	
	public void imprimirDados() {
		System.out.println("Paciente: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Estado atual: " + this.estadoAtual);
		System.out.println("Altura: " + this.altura);
		System.out.println("Peso: " + this.peso);
	}
	
	public static void main(String[] args) {
		Paciente ronaldo = new Paciente("Ronaldo", "acima do peso", 45, 1.68, 65.7);
		ronaldo.imprimirDados();

	}

}
