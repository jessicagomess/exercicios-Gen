package exercicios_estrutura_decisao;

import java.util.Scanner;

public class ExercicioSwitchCase3 {

	public static void main(String[] args) {
		float n1, n2, operacao = 0;
		int codigo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextFloat();

		System.out.println("Digite o código da operação matemática: ");
		codigo = leia.nextInt();
		
		switch(codigo) {
		case 1: operacao = (n1 + n2);
			
		case 2: operacao = (n1 - n2);
			
		case 3: operacao = (n1 * n2);
			
		case 4: operacao = (n1 / n2);
			
		
			
		}
		System.out.println(operacao);
		
	}

}
