package exercicios_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet1 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite 10 valores inteiros não repetidos:");
		int i = 0;
		while (i < 10) {
			System.out.print("Digite um valor inteiro: ");
			int valor = leia.nextInt();

			set.add(valor);
			i++;
		}

		System.out.println("\nListar dados do Set:");
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
