package Exerc�cios_POO;

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
		System.out.println("Ag�ncia: " + agencia);
		System.out.println("Conta: " + conta);
		System.out.println("Saldo Banc�rio: " + saldo);
		System.out.println("Saldo atual com aplica��o de imposto: " + imposto);
	}
	
	public static void main(String[] args) {
		ContaBancaria brasileiro = new ContaBancaria(5231, 882613, 500.25);
		brasileiro.imprimeSaldoBancario();

	}

}
