package view;

import controller.ThreadEx2Controller;

public class Main {

	public static void main(String[] args) {

		int[][] matriz = new int[3][5];
		System.out.println("Início da matriz");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = (int) (Math.random() * 100) + 1;
				System.out.println("linha: " + i + ", coluna: " + j + " = " + matriz[i][j]);
			}
		}
		System.out.println("Fim da matriz\nResultados:");

		for (int i = 0; i < 3; i++) {
			ThreadEx2Controller ex2 = new ThreadEx2Controller(matriz[i]);
			System.out.print("A soma da linha " + i + " foi: ");
			ex2.run();
			System.out.print("\n");
		}

	}

}
