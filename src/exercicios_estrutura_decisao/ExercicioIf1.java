package exercicios_estrutura_decisao;

import java.util.Scanner;

public class ExercicioIf1 {

	public static void main(String[] args) {
		
		//variaveis
		
		int A;
		int B;
		int C;
		
		// Construindo o lei
		
		Scanner leia = new Scanner(System.in);
		
		// Entrada de Dados
		
		System.out.println("Digite um número: ");
		 A = leia.nextInt();
		 
		 System.out.println("Digite outro número: ");
		 B = leia.nextInt();
		 
		 System.out.println("Digite outro número: ");
		 C = leia.nextInt();
		 
		 //Processamento 
		 if(A + B > C) {
			 System.out.println("A soma de A + B é Maior do que C");
		 }
		if(A + B < C) {
			 System.out.println("A soma de A + B é Menor do que C");
		 }
		if(A + B == C)
			 System.out.println("A soma de A + B é igual a C");
		 }

	}


