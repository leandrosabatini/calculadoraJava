import java.util.Scanner;

public class Calculadora {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira o primeiro valor da soma");
	    int valor1 = scanner.nextInt();
	    
	    System.out.println("Insira o segundo valor da soma");
	    int valor2 = scanner.nextInt();
	    
	    System.out.println(valor1 + " + " + valor2 + " = " + (valor1 + valor2));
	}
}
