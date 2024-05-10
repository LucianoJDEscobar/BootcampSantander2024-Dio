package principal;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		int contador = 0;
		String continua;
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"============================================///////////////////////======================================");
		System.out.println(
				"Será solicitado que o usuário lance dois número inteiros, onde o primeiro deve ser menor do que o segundo!");
		System.out.println(
				"============================================///////////////////////======================================\n");
		while (contador == 0) {

			perguntas();

			System.out.println("Deseja continuar? [S] Sim / [N] Não");
			continua = scan.next();

			switch (continua) {
			case "S": {
				System.out.println("\nQue LEGAL! Vamos novamente.");
				break;
			}
			case "N": {
				System.out.println("\nObrigado por participar da brincadeira..");
				contador = 1;
				break;
			}
			default:
				System.out
						.println("\nO usuário deve lançar apenas S ou N maiúsculo para se comunicar com o programa..");
				System.out.println(
						"\n############################ VAMOS TENTAR NOVAMENTE ############################\n");
			}
		}

	}

	static void perguntas() {
		int numero1, numero2;
		Scanner scan = new Scanner(System.in);

		System.out.print("\nDigite o primeiro parâmetro: ");
		numero1 = scan.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		numero2 = scan.nextInt();
		System.out.println("");
		
		try {
			start(numero1, numero2);
		} catch (ParametrosInvalidosException e) {
			// TODO Auto-generated catch block
			System.out.println("\n\nATENÇÃO - O segundo número não pode ser maior do que o primeiro!\n\n");
			System.out.println("Quer ver a lista de erro? [S] Sim / [N] Não");
			String opcao = scan.next();
			if (opcao.equals("S")) {
				System.out.println("");
				e.printStackTrace();
				System.out.println("");
			} else if (opcao.equals("N")) {
				System.out.print("Ok. ");;
			} else {
				System.out
						.println("\nO usuário deve lançar apenas S ou N maiúsculo para se comunicar com o programa..\n");
			}

		}

	}

	static void start(int valor1, int valor2) throws ParametrosInvalidosException {
		conferencia(valor1, valor2);

	}

	static void conferencia(int n1, int n2) throws ParametrosInvalidosException {
		if (n1 > n2) {
			throw new ParametrosInvalidosException();
		} else {
			int contagem = n2 - n1;
			for (int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o número " + i);
			}
			System.out.println("");
		}
	}
}