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
		System.out.println("3) Multiplicação");
		System.out.println("4) Divisão");
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
	        case 3:
	            System.out.println("Insira o primeiro valor da multiplicação");
        	    valor1 = scanner.nextInt();
        	    
        	    System.out.println("Insira o segundo valor da multiplicação");
        	    valor2 = scanner.nextInt();
        	    
        	    System.out.println(valor1 + " x " + valor2 + " = " + (valor1 * valor2));
        	    
                break;
	        case 4:
	            System.out.println("Insira o primeiro valor da divisão");
        	    valor1 = scanner.nextInt();
        	    
        	    System.out.println("Insira o segundo valor da divisão");
        	    valor2 = scanner.nextInt();
        	    
        	    System.out.println(valor1 + " / " + valor2 + " = " + (valor1 /valor2));
        	    
                break;
            default:
                System.out.println("opção incorreta");

                break;
		}
		
		start();
	}
}

