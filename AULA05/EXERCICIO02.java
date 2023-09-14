import java.util.Scanner;

public class EXERCICIO02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double N1, N2, SOMA, SUB, MULTI,DIV = 0;
		
		System.out.println("Digite 2 numeros para escolher operações!");
		System.out.println("Digite o 1° numero:");
		N1 = scan.nextDouble();
		System.out.println("Digite o 2° numero:");
		N2 = scan.nextDouble();
		
		System.out.println("Digite a operação desejada: + | - | * | /");
		String ope;
		ope = scan.next();
		switch(ope) { //SWITCH SO ACEITA INT ou string NA ESCOLHA
		
		case ("+"): 
			SOMA = N1 + N2;
			System.out.println("A soma é = " +SOMA);
			break;
			
		case ("-"): 
			SUB = N1 - N2;
			System.out.println("A subtração é = " +SUB);
			break;
			
		case ("*"): 
			MULTI = N1 * N2;
			System.out.println("A soma é = " +MULTI);
			break;
			
		case ("/"): 
			if (N2 != 0) {
			DIV = N1 / N2;
			System.out.println("A divisão é = " +DIV);
			}
			else {
			System.out.println("Você digitou um divisor = 0!!!");
			}
			break;
		}
		
	}
}