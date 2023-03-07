package view;

public class Main {
	
	static int[][]matriz = new int[3][5];
	
	public static void carregar() {
		for (int i =0; i<3; i++) {
			for (int j=0; j<5;j++) {
				matriz[i][j] = (int) (Math.random() * 1000) + 1;
			}
		}
	}

	static Thread somaLinha1 = new Thread() {
		public void run() {
			int soma = 0;
			for (int j=0; j<5;j++) {
				soma = soma + matriz[0][j];
			}
			System.out.println("Soma da linha 1:" + soma);
		}
	};
	static Thread somaLinha2 = new Thread() {
		public void run() {
			int soma = 0;
			for (int j=0; j<5;j++) {
				soma = soma + matriz[1][j];
			}
			System.out.println("Soma da linha 2:" + soma);
		}
	};
	static Thread somaLinha3 = new Thread() {
		public void run() {
			int soma = 0;
			for (int j=0; j<5;j++) {
				soma = soma + matriz[2][j];
			}
			System.out.println("Soma da linha 3:" + soma);
		}
	};
	
	static Thread mostrarMatriz = new Thread() {
		public void run() {
			for (int i =0; i<3; i++) {
				System.out.println("");
				for (int j=0; j<5;j++) {
					System.out.print(matriz[i][j] + " ");
				}
			}
		}
	};
	public static void main(String[] args) {
			carregar();
			somaLinha1.start();
			somaLinha2.start();
			somaLinha3.start();
			mostrarMatriz.start();
	}
}

