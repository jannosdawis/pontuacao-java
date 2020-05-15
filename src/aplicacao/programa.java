package aplicacao;
import java.util.Scanner;
import java.util.Locale;
public class programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int compras, atraso;
		double ticket;
		char tipocompra;
		
	// CABEÇALHO
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		System.out.println("");
	
	// LEITURA DO VOLUME
		System.out.print("Quantas compras o cliente fez no último ano? ");
		compras = sc.nextInt();
		System.out.print("Qual o ticket médio? ");
		ticket = sc.nextDouble();
		System.out.println("");
		
	// LEITURA DOS OUTROS DADOS
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		atraso = sc.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)? ");
		tipocompra = sc.next().charAt(0);
		
		
		
		sc.close();
	}

}
