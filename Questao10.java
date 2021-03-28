import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {

			System.out.println("Digite a primeira nota: ");
			Scanner entradan1 = new Scanner(System.in);
			double notas1 = entradan1.nextDouble();
			
			System.out.println("Digite a segunda nota: ");
			Scanner entradan2 = new Scanner(System.in);
			double notas2 = entradan2.nextDouble();
			
			System.out.println("Digite a terceira nota: ");
			Scanner entradan3 = new Scanner(System.in);
			double notas3 = entradan3.nextDouble();
			
			double media = (notas1+notas2+notas3)/3;
			
			System.out.println("A media do aluno é de: " + media + "\n");
			
			}
		}
}
