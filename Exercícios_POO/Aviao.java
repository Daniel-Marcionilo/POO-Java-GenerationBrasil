/*
2) Crie uma classe avião e apresente os atributos e métodos referentes
   esta classe, em seguida crie um objeto avião, defina as instancias deste
   objeto e apresente as informações deste objeto no console.
*/

package Exercícios_POO;

public class Aviao {
	private String cor;
	private double tamanho;
	private int qtdeTurbinas;
	private int qtdeJanelas;

	public Aviao(String cor, double tam) {
		this.qtdeTurbinas = 2;
		this.qtdeJanelas = 16;
		this.cor = cor;
		this.tamanho = tam;
	}

	public void ligar() {
		System.out.println("\nLigando sistema de voo...");
	}

	public void desligar() {
		System.out.println("Desligando sistema");
	}

	public void pousar() {
		System.out.println("Calculando rota de pouso. Contatar torre de controle.");
	}

	public static void main(String[] args) {
		Aviao tekoTeko = new Aviao("Branco e Azul", 35.5);

		System.out.println("Avião TekoTeko Boing " + tekoTeko.cor + " " + tekoTeko.tamanho + " " + tekoTeko.qtdeJanelas
				+ " " + tekoTeko.qtdeTurbinas);

		tekoTeko.ligar();

		tekoTeko.pousar();

		tekoTeko.desligar();
	}
}
