import java.util.Scanner;


public class EXERCICIO03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String sexo;
		double alt=0, peso=0;
		
		System.out.println("Digite seu Sexo  para calcular seu peso ideal:");
		System.out.println("M - masculino ||  F - Feminino");
		sexo = scan.next();
		
		if (sexo.equalsIgnoreCase("M")) {
			System.out.println("Digite sua altura:");
			alt = scan.nextDouble();
			peso = (72.7 * alt) - 58;
			
			System.out.println("O seu peso ideal é "+peso);
			
		}
		
		else if (sexo.equalsIgnoreCase("F")) {
			System.out.println("Digite sua altura:");
			alt = scan.nextDouble();
			peso = (62.1 * alt) - 44.7;
			
			System.out.println("O seu peso ideal é "+peso);
		}
		
		else {
			System.out.println("ERRO! Vc digitou um sexo invalido!");
		}
	}
}



