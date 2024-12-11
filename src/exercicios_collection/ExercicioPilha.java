package exercicios_collection;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();

		Scanner leia = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("\nMenu:");
			System.out.println("1: Adicionar um novo livro na pilha");
			System.out.println("2: Listar todos os livros da pilha");
			System.out.println("3: Retirar um livro da pilha");
			System.out.println("0: Finalizar o programa");
			System.out.print("Digite uma opção: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1: {
				System.out.print("Digite o nome: ");
				String nomeLivro = leia.nextLine();
				pilha.push(nomeLivro);
				System.out.println("\nPilha:");
				System.out.println("\n" + nomeLivro);
				System.out.println("\nLivro adicionado");
				break;
			}
			case 2: {
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					System.out.println("Lista de Livros na pilha:");
					for (String livro : pilha) {
						System.out.println(livro);
					}
				}
				break;
			}
			case 3: {
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					String livroRetirado = pilha.pop();

					if (pilha.isEmpty()) {
						System.out.println("A pilha está vazia.");
					} else {
						for (String livro : pilha) {
							System.out.println(livro);
						}
						System.out.println("Um livro foi retirado!");
					}
				}
				break;
			}
			case 0: {
				System.out.println("Programa finalizado.");
				break;
			}
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 0);

	}

}
