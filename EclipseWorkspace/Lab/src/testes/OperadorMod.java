package testes;

public class OperadorMod {

	public static void main(String[] args) {
		for (int numero = 1; numero <= 100; numero ++) {
			if(numero % 3 == 0)		
				System.out.print(numero);
				System.out.print(" ");
			if(numero == 54)
				System.out.println();
		}
	}
}

