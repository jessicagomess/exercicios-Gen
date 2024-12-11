package exercicios_estrutura_repeticao;

import java.util.Scanner;

public class ExercicioWhile2 {

	public static void main(String[] args) {

		int idade = 0, genero = 0, areaDesenvolvimento = 0;
		int mulherCis = 0, homemCis = 0, mulherTrans = 0, homemTrans = 0, naoBinario = 0;
		int backend = 0, frontend = 0, mobile = 0, fullStack = 0;
		int somaIdades = 0, totalPessoas = 0;
		boolean novosDados = true;
		double mediaIdade = 0.0;

		Scanner leia = new Scanner(System.in);

		while (novosDados) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();

			System.out.println("Com qual gênero você se identifica:  ");
			genero = leia.nextInt();

			System.out.println("Qual sua área de desenvolvimento: ");
			areaDesenvolvimento = leia.nextInt();

			System.out.println("deseja continuar a leitura dos dados de um novo colaborador?: ");
			novosDados = leia.nextBoolean();

			if (areaDesenvolvimento == 1) {
				backend++;
			}
			if (areaDesenvolvimento == 2) {
				frontend++;
			}
			if (areaDesenvolvimento == 3) {
				mobile++;
			}
			if (areaDesenvolvimento == 4) {
				fullStack++;
			}

			somaIdades = somaIdades + idade;
			totalPessoas++;

			if (novosDados == false) {

				if ((genero == 1 || genero == 4) && areaDesenvolvimento == 2) {
					if (genero == 1) {
						mulherCis++;
					}
					if (genero == 4) {
						mulherTrans++;
					}
				}

				if ((genero == 2 || genero == 5) && areaDesenvolvimento == 3 && idade > 40) {
					if (genero == 2) {
						homemCis++;
					}
					if (genero == 5) {
						homemTrans++;
					}

					if (genero == 3 && areaDesenvolvimento == 4 && idade < 30) {
						if (genero == 3) {
							naoBinario++;
						}
					}

				}

			}

		}
		if (totalPessoas > 0) {
			mediaIdade = (double) somaIdades / totalPessoas;
		}
		System.out.println("Total de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend:" + (mulherCis + mulherTrans));
		System.out.println(
				"Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos:" + (homemCis + homemTrans));
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos:" + naoBinario);
		System.out.println("O número total de pessoas que responderam à pesquisa:" + totalPessoas);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa:%.2f", mediaIdade);

	}
}
