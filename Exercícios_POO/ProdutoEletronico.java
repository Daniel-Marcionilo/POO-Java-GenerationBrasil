/*

3) Crie uma classe produto eletrônico e apresente os atributos e métodos
   referentes esta classe, em seguida crie um objeto produto eletrônico,
   defina as instancias deste objeto e apresente as informações deste objeto
   no console.
*/
package Exercícios_POO;

import java.util.*;

public class ProdutoEletronico {
	private double tamTela;
	private String marca;
	private int qtdeGB;
	private String cor;
	private int armazenamento;

	public ProdutoEletronico(String cor, double tamanhoDaTela, int quantidadeGB, int armazenamento) {
		this.marca = "XIAOMI";
		this.tamTela = tamanhoDaTela;
		this.qtdeGB = quantidadeGB;
		this.cor = cor;
		this.armazenamento = armazenamento;
	}
	
	
	public void abrirCalculadora() {
		double n1, n2, calc;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("\nCalculadora");
		System.out.println("\nDigite um valor para n1: ");
		n1 = leitor.nextInt();
		System.out.println("\nDigite um valor para n2: ");
		n2 = leitor.nextInt();
		calc = n1 + n2;
		
		System.out.println("\nResultado: " + calc);
	}
	
	public static void main(String[] args) {
		ProdutoEletronico celular = new ProdutoEletronico("azul", 18.3, 4, 64);
		
		System.out.println("Marca: " + celular.marca);
		System.out.println("Cor: " + celular.cor);
		System.out.println("Quantidade GigaBytes: " + celular.qtdeGB);
		System.out.println("Armazenamento: " + celular.armazenamento);
		System.out.println("Tamanho da Tela: " + celular.tamTela);
		
		celular.abrirCalculadora();
	}

}
