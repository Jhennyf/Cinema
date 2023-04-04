package cinema;

public class AssentosCinema {
	private boolean[][] assentos;
	private int numLinhas;
	private int numColunas;

	public AssentosCinema() {
		this.numLinhas = 5;
		this.numColunas = 5;
		assentos = new boolean[numLinhas][numColunas];
	}

	public void mostrarAssentos() {
		for (int i = 0; i < numLinhas; i++) {
			for (int j = 0; j < numColunas; j++) {
				if (assentos[i][j]) {
					System.out.print("X ");
				} else {
					System.out.print((char) ('A' + i) + "" + (j + 1) + " ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------");
	}

	public boolean verificaAssento(int linha, int coluna) {
		if (linha < 0 || linha >= numLinhas || coluna < 0 || coluna >= numColunas) {
			System.out.println("Assento invalido");
			return false;
		}
		if (assentos[linha][coluna]) {
			System.out.println("Assento ocupado");
			return false;
		} else {
			System.out.println("Assento reservado!");
			return true;
		}
	}

	public void reservarAssento(int linha, int coluna) {
		if (verificaAssento(linha, coluna)) {
			assentos[linha][coluna] = true;
		}
	}

}
