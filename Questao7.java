import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		System.out.println("Digite um numero:");
		Scanner entradan1 = new Scanner(System.in);
		int valora = entradan1.nextInt();
		
		System.out.println("Digite um numero:");
		Scanner entradan2 = new Scanner(System.in);
		int valorb = entradan1.nextInt();
		
		System.out.println("Digite um numero:");
		Scanner entradan3 = new Scanner(System.in);
		int valorc = entradan1.nextInt();
		
		int resultado = valora + valorb;
		
		if(resultado>valorc) {
			System.out.println("A soma de A e B é maior que C");
		}else {
			System.out.println("O valor de C é maior que a soma de A e B");
		}
		entradan1.close();
		entradan2.close();
		entradan3.close();

	}

}
