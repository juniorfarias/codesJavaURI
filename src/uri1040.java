import java.util.Scanner;

public class uri1040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float media;
		float N1 = sc.nextFloat();
		float N2 = sc.nextFloat();
		float N3 = sc.nextFloat();
		float N4 = sc.nextFloat();
		
		media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4))/10;
		System.out.printf("Media: %.1f%n", media);
		
		if(media >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else {
			if(media < 5.0) {
				System.out.println("Aluno reprovado.");
			} else {
				//if(media >= 5.0 && media >= 6.9) {
				System.out.println("Aluno em exame.");
				float recuperaNota = sc.nextFloat();
				System.out.printf("Nota do exame: %.1f%n", recuperaNota);
				float notaFinal = (recuperaNota + media)/2; 
				if(notaFinal >= 5.0) {
					System.out.println("Aluno aprovado.");
					System.out.printf("Media final: %.1f%n", notaFinal);
				} else {
						System.out.println("Aluno reprovado.");
						System.out.printf("Media final: %.1f%n", notaFinal);
				}
			}
			
		}
		
		sc.close();
	}

}
