package exerciciosEstrutura_Decisao;

import java.util.Scanner;

public class exercicioSwitchCase_2 {

		public static void main(String[] args) {
		String nome;
		String cargo = null;
		int codigo;
		float salario;
		float percentualR = 0;
		float novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite seu código: ");
		codigo = leia.nextInt();
		
		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();
		
		switch(codigo) {
		case 1: { cargo = "Gerente";
				percentualR = 0.10f;
				break;
		}
		case 2: { cargo = "Vendedor";
				  percentualR = 0.07f;
				  break;
		}
		case 3: { cargo = "Supevisor";
		          percentualR = 0.09f;
		          break;
		}
		case 4: { cargo = "Motorista";
		          percentualR = 0.06f;
		          break;
		}
		 
		case 5: { cargo = "Estoquista";
				  percentualR = 0.05f;
		          break;
		}
		case 6: { cargo = "Técnico de TI";
				  percentualR = 0.08f;
	              break;		
		}
			}
		
		novoSalario = salario + (percentualR  * salario);
		
		System.out.println("Nome do colaborador: " + nome + "\nCargo: " + cargo + "\nSalário: R$ " + novoSalario);
		}

	}


