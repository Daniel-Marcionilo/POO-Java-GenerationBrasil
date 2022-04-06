/*
1) Crie uma classe cliente e apresente os atributos e métodos referentes
   esta classe, em seguida crie um objeto cliente, defina as instancias deste
   objeto e apresente as informações deste objeto no console.
*/
package Exercícios_POO;

public class Cliente {
	private String nome;
	private int idade;
	private String email;
	
	public Cliente(String nomeRecebido, int idadeRecebido, String emailRecebido) {
		this.nome = nomeRecebido;
		this.idade = idadeRecebido;
		this.email = emailRecebido;
	}
	
	public void pedirAjuda() {
		System.out.println("\nCom licença, por favor, poderia me ajudar?");
	}
	
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Daniel", 19, "danielmarcionilo2002@gmail.com");
		Cliente c2 = new Cliente("Guilherme", 19, "guilhermemarcionilo@gmail.com");
		
		System.out.println(c1.nome + " " + c1.idade + " " + c1.email);
		System.out.println(c2.nome + " " + c2.idade + " " + c2.email);
		
		c1.pedirAjuda();
	}
}
