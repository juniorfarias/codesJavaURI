import java.util.Scanner;

public class uri1048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double ajuste = 0, salarioFinal = 0, aumento = 0;
		double salarioAtual = sc.nextDouble();

		if(salarioAtual <= 400.00) {
			ajuste = 15.0;
			aumento = salarioAtual * (ajuste/100);
			salarioFinal = salarioAtual + aumento;
		}else {
			if(salarioAtual > 400.00 && salarioAtual <= 800.00) {
				ajuste = 12.0;
				aumento = salarioAtual * (ajuste/100);
				salarioFinal = salarioAtual + aumento;
			} else {
				if(salarioAtual > 800.00 && salarioAtual <= 1200.00) {
					ajuste = 10.0;
					aumento = salarioAtual * (ajuste/100);
					salarioFinal = salarioAtual + aumento;
				} else {
					if(salarioAtual > 1200.00 && salarioAtual <= 2000.00) {
						ajuste = 7.0;
						aumento = salarioAtual * (ajuste/100);
						salarioFinal = salarioAtual + aumento;
					} else {
						ajuste = 4.0;
						aumento = salarioAtual * (ajuste/100);
						salarioFinal = salarioAtual + aumento;
					}
				}
			}
		}
		
		System.out.printf("Novo salario: %.2f%n", salarioFinal);
		System.out.printf("Reajuste ganho: %.2f%n", aumento);
		System.out.printf("Em percentual: %.0f ", ajuste);
		System.out.println("%");
		
		sc.close();
	}

}
