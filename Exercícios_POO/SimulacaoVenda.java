package Exercícios_POO;

import java.util.Scanner;

public class SimulacaoVenda {
	
	public static Scanner leitor = new Scanner(System.in);
	
	public static void menuProdutos() {
		char continuar;
		int opcaoDigitadaProdutos;
		double carrinho = 0;
		
		do {
			System.out.println(" _________________________________");
			System.out.println("| Listagem dos Produtos           |");
			System.out.println("|                                 |");
			System.out.println("| 1 - Pipoca              R$40,00 |");
			System.out.println("| 2 - Coca Cola 350ml     R$5,00  |");
			System.out.println("| 3 - Balde Personalizado R$45,00 |");
			System.out.println("|_________________________________|");
			System.out.print("Digite uma das opções acima: ");
			opcaoDigitadaProdutos = leitor.nextInt();

			switch (opcaoDigitadaProdutos) {
			case 1:
				carrinho += 40.00;
				break;
			case 2:
				carrinho += 5.00;
				break;
			case 3:
				carrinho += 45.00;
				break;
			}

			System.out.print("Deseja incluir mais algum produto? s/n: ");
			continuar = leitor.next().charAt(0);
		} while (continuar != 'n');
		System.out.println("Total Pedido: " + carrinho);
	}

	public static void main(String[] args) {
		int opcaoDigitada;

		System.out.println("BEM-VINDO!");

		System.out.println("\nMenu Principal");
		System.out.println(" _______________________");
		System.out.println("| O que deseja fazer?   |");
		System.out.println("|                       |");
		System.out.println("| 1 - Montar Pedido     |");
		System.out.println("| 2 - Cadastrar Usuário |");
		System.out.println("| 3 - Login             |");
		System.out.println("|_______________________|");

		System.out.print("Digite uma das opções acima: ");
		opcaoDigitada = leitor.nextInt();

		switch (opcaoDigitada) {
		case 1:
			menuProdutos();
			break;
		default:
			break;
		}
	}

}
