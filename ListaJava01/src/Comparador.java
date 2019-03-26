import java.util.Scanner;
public class Comparador {
	private int numero1;
	private int numero2;
	private int numero3;
	
	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int num1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int num2) {
		this.numero2 = numero2;
	}
	public int getNumero3() {
		return numero3;
	}
	public void setNumero3(int numero3) {
		this.numero3 = numero3;
	}
	
	public int getMaior() {
		int maior = this.numero1 > this.numero2 ? numero1 : numero2;
		maior = maior > this.numero3 ? maior : numero3;
		return maior;
	}
	
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Digite o primeiro número: ");
	int numero1 = input.nextInt();
	System.out.println("Digite o segundo número: ");
	int numero2 = input.nextInt();
	System.out.println("Digite o terceiro número: ");
	int numero3 = input.nextInt();
	
	Comparador comparar = new Comparador();
	comparar.setNumero1(numero1);
	comparar.setNumero2(numero2);
	comparar.setNumero3(numero3);
	
	System.out.println("O maior número é: " + comparar.getMaior());
	
	input.close();
	}

}
