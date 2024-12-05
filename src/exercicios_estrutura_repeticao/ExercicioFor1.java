package exercicios_estrutura_repeticao;

import java.util.Scanner;

public class ExercicioFor1 {

	public static void main(String[] args) {

		int n1, n2 , contador;

		Scanner leia = new Scanner(System.in);

		System.out.printf("Digite o primeiro número do intervalo: ");
		n1 = leia.nextInt();

		System.out.printf("Digite o último número do intervalo: ");
		n2 = leia.nextInt();

		if (n1 < n2) {

			for (contador = n1; contador <= n2; contador = contador + 1) {
				if (contador % 3 == 0 && contador % 5 == 0)
				System.out.println(contador + " É multiplo de 3 e 5");
			}

		} else {
			System.out.print("Intervalo inválido!");
		}
	}
}