import java.util.Scanner;

public class EXERCICIO04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String mes;
		System.out.println("Informe o mês atual para que seja mostrado a estação do ano");
		System.out.println("Digite o Mês:");
		mes = scan.next();
		
		// primavera
		if (mes.equalsIgnoreCase("setembro")){
			System.out.println("Agora é primavera!");
		}
		if (mes.equalsIgnoreCase("outubro")){
			System.out.println("Agora é primavera!");
		}
		if (mes.equalsIgnoreCase("novembro")){
			System.out.println("Agora é primavera!");
		}
		
		// verão
		
		if (mes.equalsIgnoreCase("dezembro")){
			System.out.println("Agora é verão!");
		}
		if (mes.equalsIgnoreCase("janeiro")){
			System.out.println("Agora é verão!");
		}
		if (mes.equalsIgnoreCase("fevereiro")){
			System.out.println("Agora é verão!");
		}
		
		//outono
		
		if (mes.equalsIgnoreCase("março")){
			System.out.println("Agora é outono!");
		}
		if (mes.equalsIgnoreCase("abril")){
			System.out.println("Agora é outono!");
		}
		if (mes.equalsIgnoreCase("maio")){
			System.out.println("Agora é outono!");
		}
	
		//inverno
		if (mes.equalsIgnoreCase("junho")){
			System.out.println("Agora é inverno!");
		}
		if (mes.equalsIgnoreCase("julho")){
			System.out.println("Agora é inverno!");
		}
		if (mes.equalsIgnoreCase("agosto")){
			System.out.println("Agora é inverno!");
		}
		
	}
}
