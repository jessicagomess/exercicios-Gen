package estrutura_repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		String nome;
		int contador;
		Scanner leia = new Scanner(System.in);

		for (contador = 1; contador < 4; contador = contador + 1) {
			// código que vai ser repetido
			System.out.println("Digite o " + contador + "º nome: ");
			nome = leia.nextLine();
			System.out.println("O " + contador + "º nome é: " + nome);
		}

		leia.close();
	}

}
