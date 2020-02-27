import java.util.Scanner;

public class Calculadora {
	public static void main(String [] args) {
		start();
	}
	
	public static void start()
	{
	    Scanner scanner = new Scanner(System.in);
	 
	    System.out.println("Selecione a opção desejada:");
		System.out.println("0) Sair");
		System.out.println("1) Soma");
		System.out.println("2) Subtração");
		int opcao = scanner.nextInt();
		
		int valor1, valor2;
		
		switch (opcao) {
		    case 0:
		        System.exit(0);
		    case 1:
	    
        		System.out.println("Insira o primeiro valor da soma");
        	    valor1 = scanner.nextInt();
        	    
        	    System.out.println("Insira o segundo valor da soma");
        	    valor2 = scanner.nextInt();
        	    
        	    System.out.println(valor1 + " + " + valor2 + " = " + (valor1 + valor2));
        	
	            break;
	        case 2:
	            System.out.println("Insira o primeiro valor da subtração");
        	    valor1 = scanner.nextInt();
        	    
        	    System.out.println("Insira o segundo valor da subtração");
        	    valor2 = scanner.nextInt();
        	    
        	    System.out.println(valor1 + " - " + valor2 + " = " + (valor1 - valor2));
        	    
                break;
            default:
                System.out.println("opção incorreta");

                break;
		}
		
		start();
	}
}

