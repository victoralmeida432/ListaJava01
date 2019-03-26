
public class Estatistica {
	public int maiorValor;
	
	public Estatistica(int maiorValor) {
		this.maiorValor = maiorValor;
	}
	
	public double somatorio(int num) {
		double soma = 0;
		while(num != 0) {
			soma += num;
			num--;
		}
		System.out.println("Somatorio: " + soma);
		return soma;
	}
	
	public double quantidadeNumeros(int num) {
		int cont = 0;
		for(int i = 0;i <= num;i++) {
			cont++;
		}
		System.out.println("Quantidade de numeros" + cont);
		return cont;
	}
	
	public double media(int num) {
		int media = 0;
		System.out.println("Média: " + somatorio(num)/quantidadeNumeros(num));
		return media;
	}
	
	public double variancia(int num) {
		double des = 0;
		double tot = 0;
		for(int i = 0;i<=num;i++) {
			des = ((i - media(num))*(i-media(num)));
			tot+=des;
			
		}
		System.out.println("Variancia: " + tot/quantidadeNumeros(num));
		return 0;
	}
	
	public void parImpar() {
		int num = 0;
		while(num <= maiorValor) {
			if((num % 1) == 0) {
				System.out.println(num + "é impar");
			}
			else {
				System.out.println(num + "é par");
			}
		}
	}
	public static void main(String[] args) {
		

	}

}
