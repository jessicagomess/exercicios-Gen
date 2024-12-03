package exercicios_introducao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		// Variaveis
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float notaFinal;
		
		// Construindo o leia
		Scanner leia = new Scanner(System.in);
		
		// Entrada de Dados
		System.out.println("Insira a primeira nota:");
		nota1 = leia.nextFloat();
		
		System.out.println("Insira a segunda nota:");
		nota2 = leia.nextFloat();
		
		System.out.println("Insira a terceira nota:");
		nota3 = leia.nextFloat();
		
		System.out.println("Insira a quarta nota:");
		nota4 = leia.nextFloat();
		
		// Processamento
		notaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
				
		// Saida dos Dados
		System.out.printf("Sua nota final é: %.1f ", notaFinal);
	}
}
