package exercicios_estrutura_decisao;

import java.util.Scanner;

public class ExercicioSwitchCase4 {

	public static void main(String[] args) {

		int codigo;
		float valor, novoSaldo, saldo = 1000;
		String operacao;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o código da operação: ");
		codigo = leia.nextInt();

		switch (codigo) {
		case 1: {
			System.out.println("Operação - Saldo");
			System.out.printf("Saldo: R$ %.2f", saldo);
			break;
		}

		case 2: {
			System.out.println("Operação - Saque");
			System.out.println("Digite o valor a ser sacado: R$ ");
			valor = leia.nextInt();
			if (saldo > valor) {
				novoSaldo = (saldo - valor);
				System.out.printf("Novo Saldo: R$ %.2f ", novoSaldo);
			} else {
				System.out.printf("Saldo Insuficiente!");
			}
			break;
		}

		case 3: {
			System.out.println("Operação - Depósito");
			System.out.println("Digite o valor a ser depositado: R$ ");
			valor = leia.nextInt();
			novoSaldo = (saldo + valor);
			System.out.printf("Novo Saldo: R$ %.2f ", novoSaldo);
			break;
		}

		}
		
		if (codigo > 3 || codigo < 1) {
			System.out.println("Operação Inválida !");
		}
	}
}
