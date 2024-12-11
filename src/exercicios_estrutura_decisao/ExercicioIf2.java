package exercicios_estrutura_decisao;

import java.util.Scanner;

public class ExercicioIf2 {

	public static void main(String[] args) {

		int numero;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número: ");
		numero = leia.nextInt();

		if (numero % 2 == 0 && numero > 0) {
			System.out.println("O Número " + numero + " é par e positivo!");
		} else if (numero % 2 != 0 && numero < 0) {
			System.out.println("O Número " + numero + " é ímpar e negativo!");
		} else if (numero % 2 == 0 && numero < 0) {
			System.out.println("O Número " + numero + " é par e negativo!");
		} else if (numero % 2 != 0 && numero > 0) {
			System.out.println("O Número " + numero + " é ímpar e positivo!");
		}
	}

}
