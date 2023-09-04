import java.util.Scanner;
import java.util.Locale;

public class contaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---------- DIOBANK ----------");
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("-----------------------------");
		
		System.out.println("Digite a Conta: ");
			Integer conta = scanner.nextInt(); // entrada de dados: CONTA
			
		System.out.println("-----------------------------");
		
		System.out.println("Digite a Agencia: ");
			String agencia = scanner.next();// entrada de dados: AGENCIA

		System.out.println("-----------------------------");	
		
		System.out.println("Digite o nome do cliente: ");
			String nomeCliente = scanner.next();// entrada de dados: NOME DO CLIENTE
		
		System.out.println("-----------------------------");
		
		System.out.println("Digite o sobrenome do cliente: ");
		String sobrenomeCliente = scanner.next();// entrada de dados: SOBRE NOME DO CLIENTE
	
		System.out.println("-----------------------------");
		
		System.out.println("Digite o saldo: ");
			Double saldo = scanner.nextDouble();// entrada de dados: SALDO
			
			
		System.out.println("Olá "+ nomeCliente + " " + sobrenomeCliente +", obrigado por criar uma conta DIOBANK !!!"
				+ " Sua agência é " + agencia + ", conta " + conta + " e seu saldo "
				+ saldo + " já está disponível para saque !!!");
	}

}
