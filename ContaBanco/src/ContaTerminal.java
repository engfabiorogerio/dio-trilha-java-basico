import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		 int numero;
		 String agencia;
		 String nomeCliente;
		 float saldo;
		 
		 Scanner receberDado = new Scanner(System.in);
		 
		 System.out.printf("Por favor, informe a agencia: \n");
		 agencia = receberDado.next();
		 System.out.printf("Por favor, digite o numero de sua Conta: \n");
		 numero = receberDado.nextInt();		 
		 System.out.println("Por favor informe o nome do Cliente: \n");
		 nomeCliente = receberDado.next();
		 System.out.printf("por favor informe o saldo da conta: \n");
		 saldo = receberDado.nextFloat();
		 
		 System.out.println("Oi, "+nomeCliente+", obrigado por criar uma conta em nosso Banco, sua Agencia: "+
		 agencia+", Conta: "+numero+", e seu Saldo: "+saldo+" ja esta disponivel para saque.");
	}

}
