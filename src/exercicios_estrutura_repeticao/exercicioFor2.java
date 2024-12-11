package exercicios_estrutura_repeticao;

import java.util.Scanner;

public class exercicioFor2 {

	public static void main(String[] args) {
		int i = 1;
		int numero = 0, pares = 0, impares = 0;

		Scanner leia = new Scanner(System.in);
		
		for(i = 1; i < 11; i++) {
			System.out.println("Digite o " + i + " º número:");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}

		}

		System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números impares: " + impares);
	}
}


