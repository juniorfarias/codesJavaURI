import java.util.Scanner;

public class uri1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double R, VOLUME;
		
		R = sc.nextDouble();
		
		VOLUME = (4/3.0) * pi * Math.pow(R, 3);

		System.out.printf("VOLUME = %.3f%n", VOLUME);
		
		sc.close();
	}

}
