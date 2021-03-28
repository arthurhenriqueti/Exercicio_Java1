import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		
		System.out.println("Digite uma senha:");
		Scanner entradaSenha = new Scanner(System.in);
		String senha = entradaSenha.nextLine();
		
		if(senha.equals("12345")) {
			
			System.out.println("Acesso permitido!");
		}
		else{
			System.out.println("Acesso negado!");
		}
		entradaSenha.close();

	}

}
