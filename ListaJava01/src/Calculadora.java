import java.util.Scanner;

public class Calculadora {
	public double Somar(double a, double b) {
		return a+b;
	}
	public double Subtrair(double a, double b) {
		return a-b;
	}
	public double Multiplicar(double a, double b) {
		return a*b;
	}
	public double Dividir(double a, double b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char operacao;
		
		Calculadora calcular = new Calculadora();
		System.out.println("Digite a operação desejada");
		operacao = scan.next().charAt(0);
		
		System.out.println("Digite o primeiro número: ");
		double numero1 = scan.nextDouble();
		System.out.println("Digite o segundo número: ");
		double numero2 = scan.nextDouble();
		
		if(operacao == '+') {
			System.out.println("Soma %n" + calcular.Somar(numero1, numero2));
		}
		else if(operacao == '-') {
			System.out.println("Subtração %n" + calcular.Subtrair(numero1, numero2));
		}
		else if(operacao == '*') {
			System.out.println("Multiplicação %n" + calcular.Multiplicar(numero1, numero2));
		}
		else if(operacao == '/') {
			System.out.println("Divisão %n" + calcular.Dividir(numero1, numero2));
		}
		else {
			System.out.println("Erro, Operação incorreta.");
		}
		scan.close();

	}

}
