import java.util.Scanner;

public class EXERCICIO02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double N1, N2, SOMA, SUB, MULTI,DIV = 0;
		
		System.out.println("Digite 2 numeros para escolher opera��es!");
		System.out.println("Digite o 1� numero:");
		N1 = scan.nextDouble();
		System.out.println("Digite o 2� numero:");
		N2 = scan.nextDouble();
		
		System.out.println("Digite a opera��o desejada: + | - | * | /");
		String ope;
		ope = scan.next();
		switch(ope) { //SWITCH SO ACEITA INT ou string NA ESCOLHA
		
		case ("+"): 
			SOMA = N1 + N2;
			System.out.println("A soma � = " +SOMA);
			break;
			
		case ("-"): 
			SUB = N1 - N2;
			System.out.println("A subtra��o � = " +SUB);
			break;
			
		case ("*"): 
			MULTI = N1 * N2;
			System.out.println("A soma � = " +MULTI);
			break;
			
		case ("/"): 
			if (N2 != 0) {
			DIV = N1 / N2;
			System.out.println("A divis�o � = " +DIV);
			}
			else {
			System.out.println("Voc� digitou um divisor = 0!!!");
			}
			break;
		}
		
	}
}