import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		System.out.println("Digite um numero de 1 a 7: ");
		Scanner entradaNum = new Scanner(System.in);
		int numero = entradaNum.nextInt();
		
		switch(numero) {
		
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Algo de errado");
		}
		entradaNum.close();

	}

}
