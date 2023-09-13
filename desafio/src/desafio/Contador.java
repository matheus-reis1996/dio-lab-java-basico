package desafio;

import java.util.Locale;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
	
		Scanner  scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o PRIMEIRO numero: ");
		Integer numero1 = scanner.nextInt();
			
		System.out.println("Digite o SEGUNDO numero: ");
		Integer numero2 = scanner.nextInt();
		
		
		try {
			contar( numero1, numero2);
			
		} catch (ParametrosInvalidosException e) {
			System.err.println("O PRIMEIRO é maior que o SEGUNDO numero " );
			System.err.println("Digite o primeiro numero menor que o segundo");
		} 
	}
	
	static void contar(int n1, int n2)throws ParametrosInvalidosException {
		if (n1 > n2) {
			throw new ParametrosInvalidosException();
		}else if (n1 == n2) {
			System.err.println("Os numeros são iguais");
			System.err.println("Digite o primeiro numero menor que o segundo");
			throw new ParametrosInvalidosException();
		}else
			System.out.println("");
			int contagem = n2 - n1;
			for (int i = 0; i < contagem; i++)
				System.out.println(i+1);
			
			//modo dois conta a partir do primeri numero ate o segundo
			//for (int i = n1; i <= n2; i++)
			//System.out.println("o numero e " + i);
			
	}

}
