package cinema;

public class Datas {
	private String datas[] = { "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira" + "Sábado",
			"Domingo" };
	private String escolha;
	private int preco;

	public Datas(String escolha) {
		super();
		this.escolha = escData(escolha);
	}

	public String escData(String escolha) {
		for (int i = 0; i < datas.length; i++) {
			if (datas[i].equals(escolha)) {
				System.out.println("--------------------------------------------------------------");
				System.out.println("Data: " + datas[i]);
			}
		}
		escPreco(escolha);
		return this.getEscolha();
	}

	public int escPreco(String escolha) {
		if (escolha == "Segunda-Feira" || escolha == "Terça-Feira" || escolha == "Quarta-Feira") {
			this.setPreco(20);
		}
		if (escolha == "Quinta-Feira" || escolha == "Sexta-Feira") {
			this.setPreco(30);
		}
		if (escolha == "Sábado" || escolha == "Domingo") {
			this.setPreco(40);
		}
		System.out.println("Preco: " + this.getPreco());
		return this.getPreco();
	}

	public String[] getDatas() {
		return datas;
	}

	public void setDatas(String[] datas) {
		this.datas = datas;
	}

	public String getEscolha() {
		return escolha;
	}

	public void setEscolha(String escolha) {
		this.escolha = escolha;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}
}
