package exercicios_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();

		Scanner leia = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("\nMenu:");
			System.out.println("1: Adicionar um novo Cliente na fila");
			System.out.println("2: Listar todos os Clientes na fila");
			System.out.println("3: Chamar (retirar) uma pessoa da fila");
			System.out.println("0: Finalizar o programa");
			System.out.print("Escolha uma opção: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1: {
				System.out.print("Digite o nome: ");
				String nome = leia.nextLine();
				fila.add(nome);
				System.out.println("Fila:");
				System.out.println(nome);
				System.out.println("\nCliente Adicionado!");
				break;
			}
			case 2: {
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					System.out.println("Lista de Clientes na Fila:");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;
			}
			case 3: {
				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					String clienteAtendido = fila.poll();

					if (fila.isEmpty()) {
						System.out.println("A fila está vazia.");
					} else {
						for (String cliente : fila) {
							System.out.println(cliente);
						}
						System.out.println("O Cliente foi Chamado!");
					}
				}
				break;
			}
			case 0: {
				System.out.println("Programa Finalizado.");
				break;
			}
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 0);

	}

}
