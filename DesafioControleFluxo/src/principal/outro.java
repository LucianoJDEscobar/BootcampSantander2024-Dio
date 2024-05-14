package principal;

import java.util.Scanner;

public class outro {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO: Inicialize um bloco try-catch para capturar exceções:
		try {
			String conta = scanner.nextLine();
			verificarNumeroConta(conta);
			System.out.println("Numero de conta valido.");
		} catch (IllegalArgumentException e) {
			// Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à
			// exceção:
			// System.out.println("Erro: " + e.getMessage());
			System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
		}

		finally {
			scanner.close();
		}
	}

	// Declaração do método verificarNumeroConta, que verifica se o número de conta
	// tem exatamente 8 dígitos:
	private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException {
		if (numeroConta.length() == 8) {
			return;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
