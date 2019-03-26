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
		
		double numero1, numero2;
		char operacao;
		
		Calculadora calcular = new Calculadora();
		operacao = scan.next().charAt(0);
		
		numero1 = scan.nextDouble();
		numero2 = scan.nextDouble();
		
		if(operacao == '+') {
			System.out.println(calcular.Somar(numero1, numero2));
		}
		else if(operacao == '-') {
			System.out.println(calcular.Subtrair(numero1, numero2));
		}
		else if(operacao == '*') {
			System.out.println(calcular.Multiplicar(numero1, numero2));
		}
		else if(operacao == '/') {
			System.out.println(calcular.Dividir(numero1, numero2));
		}
		else {
			System.out.println("Erro, Operação incorreta.");
		}
		scan.close();

	}

}
