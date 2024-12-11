package exercicios_estrutura_decisao;

import java.util.Scanner;

public class ExercicioIf4 {

	public static void main(String[] args) {
		String palavra1, palavra2, palavra3;

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite a primeira caracteristica: ");
		palavra1 = leia.next();

		System.out.print("Digite a segunda caracteristica: ");
		palavra2 = leia.next();

		System.out.print("Digite a terceira caracteristica: ");
		palavra3 = leia.next();

		if (palavra1.equals("vertebrado")) {
			if (palavra2.equals("ave")) {
				if (palavra3.equals("carnivoro")) {

					System.out.print("aguia");

				} else if (palavra3.equals("onivoro")) {

					System.out.print("pomba");
				}
			} else if (palavra2.equals("mamifero")) {
				if (palavra3.equals("onivoro")) {

					System.out.print("homem");

				} else if (palavra3.equals("herbivoro")) {
					System.out.print("vaca");
				}
			}

		} else if (palavra1.equals("invertebrado")) {
			if (palavra2.equals("inseto")) {
				if (palavra3.equals("hematofago")) {

					System.out.print("pulga");

				} else if (palavra3.equals("herbivoro")) {

					System.out.print("lagarta");
				}
			} else if (palavra2.equals("anelideo")) {
				if (palavra3.equals("hematofago")) {

					System.out.print("sanguessuga");

				} else if (palavra3.equals("onivoro")) {
					System.out.print("minhoca");
				}
			}

		}
	}
}
