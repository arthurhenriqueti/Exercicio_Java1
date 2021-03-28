import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		
		System.out.println("Gols do Nacional:");
		Scanner entradaPatos = new Scanner(System.in);
		int g1 = entradaPatos.nextInt();
		
		System.out.println("Gols do Treze:");
		Scanner entradaTreze = new Scanner(System.in);
		int g2 = entradaTreze.nextInt();
		
		if(g1>g2) {
			System.out.println("Vitoria do Nacional!");
		}
		else if(g2>g1) {
			System.out.println("Vitoria do Treze!");
		}
		else {
			System.out.println("Empate!");
		}
		entradaPatos.close();
		entradaTreze.close();
	}
}
