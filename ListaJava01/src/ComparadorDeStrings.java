import java.util.Scanner;

public class ComparadorDeStrings {
	
	public static boolean ComparadorStrings(String frase1,String frase2) {
		StringBuilder rv = new StringBuilder(frase1);
		rv.reverse();
		String frase3 = rv.toString();
		if(frase2.compareTo(frase3) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a primeira string: ");
		String frase1 = scan.next();
		System.out.println("Digite a segunda string: ");
		String frase2 = scan.next();
		
		System.out.println(ComparadorStrings(frase1,frase2));
		scan.close();
	}

}
