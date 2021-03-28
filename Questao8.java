import java.util.Random;

public class Questao8 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int i;
		
		for(i=0;i<3;i++) {
			int numeroAleatorio = random.nextInt(60);
			System.out.println("Numero sorteiado: " + numeroAleatorio);

		}
	}
}
