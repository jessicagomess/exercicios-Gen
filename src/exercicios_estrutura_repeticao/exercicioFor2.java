package exercicios_estrutura_repeticao;

import java.util.Scanner;

public class exercicioFor2 {

	public static void main(String[] args) {
		int numero = 0;
		
		Scanner leia = new Scanner(System.in);
	
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		if(numero < 10) {
			System.out.print("Digite outro número: ");
			numero = leia.nextInt();
		}
	}

}
