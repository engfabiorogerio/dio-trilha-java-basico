import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		 int numero;
		 String agencia;
		 String nomeCliente;
		 BigDecimal saldo;
		 
		 Scanner receberDado = new Scanner(System.in);
		 
		 System.out.printf("Por favor, informe a agência: \n");
		 agencia = receberDado.next();
		 System.out.printf("Por favor, digite o número de sua Conta: \n");
		 numero = receberDado.nextInt();		 
		 System.out.println("Por favor informe o nome do Cliente: \n");
		 nomeCliente = receberDado.next();
		 System.out.printf("por favor informe o saldo da conta: \n");
		 saldo = receberDado.nextBigDecimal();
		 
		 System.out.println("Olá, "+nomeCliente+", obrigado por criar uma conta em nosso Banco, sua Agência é: "+
		 agencia+", Conta: "+numero+", e seu Saldo: "+saldo+"já está disponível para saque.");
	}

}
