package exercicios_introducao;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		
		// Variaveis
		float n1;
		float n2;
		float n3;
		float n4;
		float calculo;
		
		// Construindo o leia
				Scanner leia = new Scanner(System.in);
				
		// Entrada de Dados		
		System.out.println("Insira o primeiro valor:");
		n1 = leia.nextFloat();
		
		System.out.println("Insira o segundo valor:");
		n2 = leia.nextFloat();
		
		System.out.println("Insira o terceiro valor:");
		n3 = leia.nextFloat();
		
		System.out.println("Insira o quarto valor:");
		n4 = leia.nextFloat();
		
	   // Processamento
	  calculo =  (n1 * n2) - (n3 * n4);
	  
	  // Saida dos Dados
	  System.out.printf("A diferença do produto entre " + n1 + " e " + n2 + " pelo produto entre " + n3 + " e " + n4 + " é: " + calculo);
	}
}
