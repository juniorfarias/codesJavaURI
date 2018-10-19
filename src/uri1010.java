import java.util.Scanner;

public class uri1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, qtdPecas1, codigoPeca2, qtdPecas2;
		double valorPeca1, valorPeca2, valorAPagar;
		
		codigoPeca1 = sc.nextInt();
		qtdPecas1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		codigoPeca2 = sc.nextInt();
		qtdPecas2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		valorAPagar = (qtdPecas1 * valorPeca1) + (qtdPecas2 * valorPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);
		
		sc.close();

	}

}
