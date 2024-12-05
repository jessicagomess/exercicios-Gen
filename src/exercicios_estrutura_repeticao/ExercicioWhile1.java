package exercicios_estrutura_repeticao;

import java.util.Scanner;

public class ExercicioWhile1 {

	public static void main(String[] args) {
		int idade = 0;
		int MenorIdade = 0, MaiorIdade = 0;

		Scanner leia = new Scanner(System.in);


		while (idade >= 0) {
			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();
			if (idade < 21) {
				MenorIdade = MenorIdade + 1;
			} else if (idade > 50) {
				MaiorIdade = MaiorIdade + 1;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: " + MenorIdade);
		System.out.println("Total de pessoas maiores de 50 anos: " + MaiorIdade);
	}
}
