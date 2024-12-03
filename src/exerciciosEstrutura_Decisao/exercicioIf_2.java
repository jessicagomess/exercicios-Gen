package exerciciosEstrutura_Decisao;

import java.util.Scanner;

public class exercicioIf_2 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0 && numero > 0) {
			System.out.println("O Número " + numero + " é par e positivo!");
		}
		if(numero % 2 != 0 && numero < 0) {
			System.out.println("O Número " + numero + " é ímpar e negativo!");
		} 
		if(numero % 2 == 0 && numero < 0) {
			System.out.println("O Número " + numero + " é par e negativo!");
		}
		if(numero % 2 != 0 && numero > 0) {
			System.out.println("O Número " + numero + " é ímpar e positivo!");
		}
	}

}
