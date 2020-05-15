package aplicacao;
import java.util.Scanner;
import java.util.Locale;
public class programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int qtdcompras, atraso, scorecompras;
		double volumecompras;
		char tipocompra;
		
	// CABEÇALHO
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		System.out.println("");
	
	// LEITURA DO VOLUME
		System.out.print("Quantas compras o cliente fez no último ano? ");
		qtdcompras = sc.nextInt();
		System.out.print("Qual o ticket médio? ");
		volumecompras = sc.nextDouble();
		System.out.println("");
		
	// LEITURA DOS OUTROS DADOS
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		atraso = sc.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)? ");
		tipocompra = sc.next().charAt(0);
	
	// SCORE DE VOLUME DE COMPRAS
		System.out.println("");
		if (volumecompras == 0){
			scorecompras = 0;
		}else if (volumecompras <= 3000.00){
				scorecompras = 20;
				if (qtdcompras > 2){
					scorecompras = 40;
				}
		}else{
			scorecompras = 60;
		}
		System.out.println("Score de volume de compras = " + scorecompras + " pontos");
		System.out.println("");
		
		
		sc.close();
	}

}
