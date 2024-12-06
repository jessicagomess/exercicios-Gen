package exercicios_vetor;

import java.util.Scanner;

public class exerciciosVetor1 {

	public static void main(String[] args) {

		// 2 5 1 3 4 9 7 8 10 6

		int numeros[] = new int[10];
		double soma = 0;
		int indiceSoma = 0;
		double media = 0;
		Scanner leia = new Scanner(System.in);

		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º Número: ");
			numeros[indice] = leia.nextInt();
		}
		
		System.out.printf("Os números impares são: ");
		for (int indice = 0; indice < 10; indice++) {
			if (indice % 2 != 0) {
				System.out.printf(numeros[indice] + " ");
			}
		}
		System.out.println("");
		
		System.out.printf("Os números pares são: ");	
		for (int indicePar = 0; indicePar < 10; indicePar++) {
			if (indicePar % 2 == 0) {
				System.out.printf(numeros[indicePar] + " ");							
			}
		}
		System.out.println("");
		for (int indicePar = 0; indicePar < 10; indicePar++) {
		soma = soma + numeros[indicePar];
		}
		media = soma/10;
		
		System.out.println("Soma:" + soma);
		System.out.printf("Média: %.2f ", media);
}
}