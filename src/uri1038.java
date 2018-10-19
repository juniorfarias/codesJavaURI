import java.util.Scanner;

public class uri1038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigoSet = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double precoProd = 0, total;
		
		switch (codigoSet) {
			case 1: precoProd = 4.00;
			break;
			case 2: precoProd = 4.50;
			break;
			case 3: precoProd = 5.00;
			break;
			case 4: precoProd = 2.00;
			break;
			case 5: precoProd = 1.50;
			break;
		}
		
		total = precoProd * quantidade;
		
		System.out.printf("Total: R$ %.2f%n", total);
		sc.close();
	}

}
