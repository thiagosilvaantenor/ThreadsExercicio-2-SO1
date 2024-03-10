package controller;

public class ThreadEx2Controller extends Thread {
	
//	2) Fazer uma aplicação que insira números aleatórios em uma matriz 3 x 5 e tenha 3
//	chamadas de Threads, onde cada uma calcula a soma dos valores de cada linha,
//	imprimindo a identificação da linha e o resultado da soma.
//	Dica: A main deve gerar uma matriz com números aleatórios, mas a Thread recebe um vetor
//	(uma linha da matriz)
	
	private int[] linha;
	private int indice;
	public ThreadEx2Controller(int[] linha, int indice) {
		this.linha = linha;
		this.indice = indice;
	}
	
	@Override
		public void run() {
			int soma = 0;
			int id = (int) getId();
			for (int el: linha) {
				soma += el;
			}
			
			System.out.println("A soma da linha " + indice + " foi: " + soma);
		}
}
