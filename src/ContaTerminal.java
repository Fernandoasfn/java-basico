import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Bem vindo ao banco DIO!");
		
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		
		System.out.println("Digite seu número da conta: ");
		int numero = sc.nextInt();
		
		System.out.println("Digite sua agência: ");
		String agencia = sc.next();
		
		double saldo = 500.00;
		
		System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é \n" + agencia + ", conta " + numero + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque." );
		
		sc.close();
	}
}