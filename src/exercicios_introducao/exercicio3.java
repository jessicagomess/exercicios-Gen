package exercicios_introducao;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		
		// Variaveis
		float salarioB;
		float adicionalN;
		float horaE;
		float descontos;
		float salarioL;
		
		// Construindo o leia
		Scanner leia = new Scanner(System.in);
		
		// Entrada de Dados
		System.out.println("Insira o salario bruto:");
		salarioB = leia.nextFloat();
		
		System.out.println("Insira o adicional noturno:");
		adicionalN = leia.nextFloat();
		
		System.out.println("Insira as horas extra:");
		horaE = leia.nextFloat();
		
		System.out.println("Insira os descontos:");
		descontos = leia.nextFloat();
		
		// Processamento
		salarioL = salarioB + adicionalN + (horaE * 5) - descontos;
		
		// Saida dos Dados
		System.out.printf("Seu salário Líquido é: " + salarioL);
	}
	
}
