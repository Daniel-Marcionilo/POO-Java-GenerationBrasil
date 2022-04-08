package Exercícios_Heranca_Polimorfismo;

public abstract class Animal {

	protected String nome;
	protected int idade;
	
	/*
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}*/
	
	public void emitirSom() {
		System.out.println("Som genérico! ");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
