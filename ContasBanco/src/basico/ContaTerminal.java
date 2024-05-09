package basico;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		int numero;
		String agencia, nomeCliente;
		double saldo;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Por favor, digite o seu nome: ");
		nomeCliente = scanner.nextLine();

		System.out.print("O número da Agência: ");
		agencia = scanner.next();

		System.out.print("O número da conta: ");
		numero = scanner.nextInt();

		System.out.print("Digite o valor inicial de depósito ");
		saldo = scanner.nextDouble();

		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
	}

}
