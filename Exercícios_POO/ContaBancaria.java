package Exercícios_POO;

public class ContaBancaria {
	
	private int agencia;
	private int conta;
	private double saldo;
	private double imposto;
	
	public ContaBancaria(int agencia, int conta, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.imposto = saldo - ((8.0/100) * saldo);
	}
	
	public void imprimeSaldoBancario() {
		System.out.println("Agência: " + agencia);
		System.out.println("Conta: " + conta);
		System.out.println("Saldo Bancário: " + saldo);
		System.out.println("Saldo atual com aplicação de imposto: " + imposto);
	}
	
	public static void main(String[] args) {
		ContaBancaria brasileiro = new ContaBancaria(5231, 882613, 500.25);
		brasileiro.imprimeSaldoBancario();

	}

}
