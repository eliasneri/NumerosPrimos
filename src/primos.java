import java.util.Scanner;

public class primos {
	
	/*
	 * Para que um n�mero seja primo, ele deve ser divisivel por 1 e por ele mesmo,
	 * sendo assim, ele pode ter apenas 2 divisores
	 * 
	 * no la�o ser� testado os restos das divis�es, se o resto for igual a zero,
	 * significa q ele a divis�o foi perfeita, sem restos.
	 * 
	 * o resultado para o numero primo dever� ser verdadeiro, e houver 2 divisores,
	 * caso contr�rio, esse numero n�o � primo
	 * 
	 */

	public static void main(String[] args) {
		int resultado = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int numero = sc.nextInt();
		
		for (int i=1; i <= numero; i++) {
			
			if(numero % i == 0) {
				resultado++;
			}
		}
		
		
		if (resultado == 2) {
			System.out.println("Primo");
		} else {
			System.out.println("n�o primo");
		}
		
		sc.close();

	}

}
