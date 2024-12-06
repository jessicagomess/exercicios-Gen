package exercicios_estrutura_decisao;

import java.util.Scanner;

public class ExercicioSwitchCase1 {

	public static void main(String[] args) {
		int codigo;
		int quantidade;
		float precoU = 0;
		float valorT;
		String produto = null;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o código do pedido: ");
		
		codigo = leia.nextInt();

		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();
		
		switch(codigo) {
		case 1: produto = "Cachorro Quente";
				 precoU = 10;
				 break;
		case 2: produto = "X-Salada";
		 		precoU = 15;
		 		break;
		case 3: produto = "X-Bacon";
		 		precoU = 18;
		 		break;
		case 4: produto = "Bauru";
 				precoU = 12;
 				break;
		case 5: produto = "Refrigerante";
				precoU = 8;
				
		case 6: produto = "Suco de Laranja";
				precoU = 13;
			    break;
		}
		
		valorT = (quantidade * precoU);
			    
		System.out.println("Produto: " + produto + "\nValor Total: R$ " + valorT);
		}
	}


