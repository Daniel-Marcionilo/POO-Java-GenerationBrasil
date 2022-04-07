package Exercícios_POO;

public class Patinete {

	private int velocidade;
	private String cor;
	private double tamanho;

	public Patinete(int v, String c, double t) {
		this.velocidade = v;
		this.cor = c;
		this.tamanho = t;
	}

	public int acelerar(int v) {
		v = v + 20;
		return v;
	}

	public static void main(String[] args) {
		Patinete patineteRapido = new Patinete(2, "Cinza", 1.45);
		System.out.println(patineteRapido.cor + " " + patineteRapido.tamanho + " " + patineteRapido.velocidade);
		System.out.println(patineteRapido.acelerar(50));
	}

}
