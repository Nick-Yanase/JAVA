import java.util.Scanner;

public class EXERCICIO04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String mes;
		System.out.println("Informe o m�s atual para que seja mostrado a esta��o do ano");
		System.out.println("Digite o M�s:");
		mes = scan.next();
		
		// primavera
		if (mes.equalsIgnoreCase("setembro")){
			System.out.println("Agora � primavera!");
		}
		if (mes.equalsIgnoreCase("outubro")){
			System.out.println("Agora � primavera!");
		}
		if (mes.equalsIgnoreCase("novembro")){
			System.out.println("Agora � primavera!");
		}
		
		// ver�o
		
		if (mes.equalsIgnoreCase("dezembro")){
			System.out.println("Agora � ver�o!");
		}
		if (mes.equalsIgnoreCase("janeiro")){
			System.out.println("Agora � ver�o!");
		}
		if (mes.equalsIgnoreCase("fevereiro")){
			System.out.println("Agora � ver�o!");
		}
		
		//outono
		
		if (mes.equalsIgnoreCase("mar�o")){
			System.out.println("Agora � outono!");
		}
		if (mes.equalsIgnoreCase("abril")){
			System.out.println("Agora � outono!");
		}
		if (mes.equalsIgnoreCase("maio")){
			System.out.println("Agora � outono!");
		}
	
		//inverno
		if (mes.equalsIgnoreCase("junho")){
			System.out.println("Agora � inverno!");
		}
		if (mes.equalsIgnoreCase("julho")){
			System.out.println("Agora � inverno!");
		}
		if (mes.equalsIgnoreCase("agosto")){
			System.out.println("Agora � inverno!");
		}
		
	}
}
