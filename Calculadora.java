import java.util.Scanner;

public class Calculadora {
	public static void main(String [] args) {
		start();
	}
	
	public static void start()
	{
	    Scanner scanner = new Scanner(System.in);
	 
	    System.out.println("Selecione a op��o desejada:");
		System.out.println("0) Sair");
		System.out.println("1) Soma");
		System.out.println("2) Subtra��o");
		System.out.println("3) Multiplica��o");
		System.out.println("4) Divis�o");
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
	            System.out.println("Insira o primeiro valor da subtra��o");
        	    valor1 = scanner.nextInt();
        	    
        	    System.out.println("Insira o segundo valor da subtra��o");
        	    valor2 = scanner.nextInt();
        	    
        	    System.out.println(valor1 + " - " + valor2 + " = " + (valor1 - valor2));
        	    
                break;
	        case 3:
	            System.out.println("Insira o primeiro valor da multiplica��o");
        	    valor1 = scanner.nextInt();
        	    
        	    System.out.println("Insira o segundo valor da multiplica��o");
        	    valor2 = scanner.nextInt();
        	    
        	    System.out.println(valor1 + " x " + valor2 + " = " + (valor1 * valor2));
        	    
                break;
	        case 4:
	            System.out.println("Insira o primeiro valor da divis�o");
        	    valor1 = scanner.nextInt();
        	    
        	    System.out.println("Insira o segundo valor da divis�o");
        	    valor2 = scanner.nextInt();
        	    
        	    System.out.println(valor1 + " / " + valor2 + " = " + (valor1 /valor2));
        	    
                break;
            default:
                System.out.println("op��o incorreta");

                break;
		}
		
		start();
	}
}

