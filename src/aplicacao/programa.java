package aplicacao;
import java.util.Scanner;
import java.util.Locale;
public class programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int compras;
		double ticket;
		
	// CABE�ALHO
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO �LTIMO ANO");
		System.out.println("");
	
	// LEITURA DO VOLUME
		System.out.print("Quantas compras o cliente fez no �ltimo ano? ");
		compras = sc.nextInt();
		System.out.print("Qual o ticket m�dio? ");
		ticket = sc.nextDouble();
		System.out.println("");
		
		
		sc.close();
	}

}
