import java.util.Scanner;

public class atividade3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];
		int L, C;

		for (L = 0; L < a.length; L++) {
			for (C = 0; C < a.length; C++) {
				System.out.printf("Informe os números da matriz A: ");
				a[L][C] = entrada.nextInt();
			}
		}
		System.out.println();

		for (L = 0; L < b.length; L++) {
			for (C = 0; C < b.length; C++) {
				System.out.printf("Informe os números da matriz B: ");
				b[L][C] = entrada.nextInt();
			}
		}
		System.out.println();

		System.out.println("Matriz C (Matriz A + Matriz B):");
		for (L = 0; L < c.length; L++) {
			for (C = 0; C < c.length; C++) {
				c[L][C] = a[L][C] + b[L][C];
				System.out.printf("[%03d] ", c[L][C]);
			}
			System.out.println();
		}

	}
}