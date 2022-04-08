package Exercícios_Heranca_Polimorfismo;

public class Main {

	public static void main(String[] args) {
		Cachorro pinscher = new Cachorro();

		pinscher.setNome("Duke");
		pinscher.setIdade(4);
		pinscher.setRaca("pinscher");

		System.out.println(pinscher.getNome());
		System.out.println(pinscher.getIdade());
		System.out.println(pinscher.getRaca() + "\n");

		Cavalo horseDark = new Cavalo();
		Preguica jildo = new Preguica();

		pinscher.emitirSom();
		horseDark.emitirSom();
		jildo.emitirSom();
	}

}
