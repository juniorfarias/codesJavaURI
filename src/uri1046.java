import java.util.Scanner;

public class uri1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int tempo;
		
		if(A >= B) {
			B += 24;
			tempo = B - A;
		} else {
			tempo = B - A;
		}
		
		if(tempo >= 1 && tempo <= 24) {
			System.out.printf("O JOGO DUROU %d HORA(S)%n", tempo);
		}
		sc.close();
	}

}
