package introducao;

import java.util.Scanner; //Importando Scanner para dentro da Classe

public class EntradaSaida {

	public static void main(String[] args) {
		
		// Variaveis
		String nome;
		float temperatura;
		float fahrenheit;
		
		// Construindo o leia
		Scanner leia = new Scanner(System.in);
		
		// Entrada de Dados - Pedir/Inserir o nome, temperatura
		System.out.println("Insira o seu nome: ");
		nome = leia.next(); //nextline();
		
		System.out.println("Insira a temperatura em Celsius: ");
		temperatura = leia.nextFloat();
		
		// Processamento
		fahrenheit = temperatura * 1.8f + 32;
		
		// Saída de Dados
		System.out.println("Bom dia, " + nome);
		System.out.printf("A temperatura em Fahrenheit é %.2f. ", fahrenheit);
		System.out.printf("A temperatura em Fahrenheit é: " + fahrenheit); //Concatenação 
			
	}
}
