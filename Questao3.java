import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		String menor;
		
		System.out.println("Digite um nome:");
		Scanner entradan1 = new Scanner(System.in);
		String n1 = entradan1.nextLine();
		
		System.out.println("Digite um nome:");
		Scanner entradan2 = new Scanner(System.in);
		String n2 = entradan2.nextLine();
		
		System.out.println("Digite um nome:");
		Scanner entradan3 = new Scanner(System.in);
		String n3 = entradan3.nextLine();
		
		System.out.println("Digite um nome:");
		Scanner entradan4 = new Scanner(System.in);
		String n4 = entradan4.nextLine();
		
		System.out.println("Digite um nome:");
		Scanner entradan5 = new Scanner(System.in);
		String n5 = entradan5.nextLine();
		
		if(n1.compareTo(n2)<0) {
			menor = n1;
			System.out.println("Numero menor: " + menor);
		}else {
			menor = n2;
			System.out.println("Numero menor: " + menor);
		}
		if(n1.compareTo(n3)<0) {
			menor = n1;
			System.out.println("Numero menor: " + menor);
		}else {
			menor = n2;
			System.out.println("Numero menor: " + menor);
		}
		if(n1.compareTo(n3)<0) {
			menor = n1;
			System.out.println("Numero menor: " + menor);
		}else {
			menor = n3;
			System.out.println("Numero menor: " + menor);
		}
		if(n1.compareTo(n4)<0) {
			menor = n1;
			System.out.println("Numero menor: " + menor);
		}else {
			menor = n4;
			System.out.println("Numero menor: " + menor);
		}
		if(n1.compareTo(n5)<0) {
			menor = n1;
			System.out.println("Numero menor: " + menor);
		}else {
			menor = n5;
			System.out.println("Numero menor: " + menor);
		}
		entradan1.close();
		entradan2.close();
		entradan3.close();
		entradan4.close();
		entradan5.close();
	}
}

