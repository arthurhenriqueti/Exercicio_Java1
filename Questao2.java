import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		System.out.println("Digite uma senha:");
		Scanner entradaSenha = new Scanner(System.in);
		String senha = entradaSenha.nextLine();
		
		System.out.println("Digite um numero:");
		Scanner entradan1 = new Scanner(System.in);
		int n1 = entradan1.nextInt();
		
		System.out.println("Digite o segundo numero:");
		Scanner entradan2 = new Scanner(System.in);
		int n2 = entradan2.nextInt();
		

		double divisao = n1 / n2;
		
		System.out.println("Digite a senha novamente:");
		Scanner verificar = new Scanner(System.in);
		String verificarSenha = verificar.nextLine();
		
		if(verificarSenha.equals(senha)) {
			System.out.println("Resultado: " + divisao);
		}
		else {
			System.out.println("Algo errado!");
			
		}
		entradaSenha.close();
		entradan1.close();
		entradan2.close();
		verificar.close();
	}

}
