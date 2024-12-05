package exercicios_estrutura_decisao;

import java.util.Scanner;

public class ExercicioIf3 {

	public static void main(String[] args) {
		String nome;
		int idade;
		boolean primeiraDoacao;

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		nome = leia.nextLine();

		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();

		System.out.print("Primeira doação: ");
		primeiraDoacao = leia.nextBoolean();

		if (idade >= 18 && idade <= 59)
		{
			System.out.print(nome + " está apto/a para doar sangue!");
		}else if (idade >= 60 && idade <= 69 && primeiraDoacao == false )
		{
			System.out.print(nome + " está apto/a para doar sangue!");
		}else{
			System.out.print(nome + " não está apto/a para doar sangue!");
		}
		
	}
}

