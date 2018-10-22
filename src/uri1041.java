import java.util.Scanner;

public class uri1041 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		String quadrante = "";
		
		if(x==0 && y==0) {
			quadrante = "Origem";
		} else {
			if(x==0 && y!=0) {
				quadrante = "Eixo Y";
			} else {
				if(y==0 && x!=0) {
					quadrante ="Eixo X";
				} else {
					if(x>0 && y>0) {
						quadrante = "Q1";
					} else {
						if(x<0 && y>0) {
							quadrante = "Q2";
						} else {
							if(x<0 && y<0) {
								quadrante = "Q3";
							} else {
								if(x>0 && y<0) {
									quadrante = "Q4";
								}
							}
						}
					}
				}
		
			}
		}
		
		System.out.println(quadrante);		
		sc.close();
	}

}