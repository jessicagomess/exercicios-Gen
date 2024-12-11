package exercicios_estrutura_repeticao;

import java.util.Scanner;

public class exercicioDoWhile2 {

	public static void main(String[] args) {
		int i = 0, numero, soma = 0;
		double media = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número inteiro: ");
            numero = leia.nextInt();
            
            if (numero % 3 == 0 && numero != 0) {
            	soma = soma + numero;
            	i = i + 1;
            }
			
		} while (numero != 0);
			if(i > 0) {
				media = (double) soma / i;
			}
			System.out.printf("A média de todos os números múltiplos de 3 é: %.1f\n", media);
	}
}
