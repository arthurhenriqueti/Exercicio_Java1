import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		System.out.println("Digite seu peso:");
		Scanner entradaPeso = new Scanner(System.in);
		double peso = entradaPeso.nextDouble();
		
		System.out.println("Digite sua altura:");
		Scanner entradaAltura = new Scanner(System.in);
		double altura = entradaAltura.nextDouble();
		
		double imc = peso / (altura*altura);
		
		if(imc < 18.5) {
			System.out.println("Magro");
		}
		else if((imc > 18.5) && (imc < 24.9)) {
			System.out.println("Normal");
		}
		else if((imc > 25.0) && (imc > 29.9)) {
			System.out.println("Sobrepeso");
		}
		else if((imc > 30.0) && (imc > 34.9)) {
			System.out.println("Obeso");
		}
		else {
			System.out.println("Obesidade morbida");
		}
		entradaPeso.close();
		entradaAltura.close();

	}

}
