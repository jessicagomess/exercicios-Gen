package exercicios_introducao;

import java.util.Scanner; 

public class exercicio1 {
	
	public static void main(String[] args) {
	// Variaveis
	
	float salario;
	float abono;
	float NovoSalario;
	
	// Construindo o leia
	Scanner leia = new Scanner(System.in);
	
	// Entrada de Dados
	System.out.println("Insira o seu salário:");
	salario = leia.nextFloat();
	
	
	System.out.println("Insira o abono:");
	abono = leia.nextFloat();
	
	// Processamento
	NovoSalario = salario + abono;
	
	// Saida dos Dados
	System.out.printf("Seu novo salário será: " + NovoSalario); 
}
}