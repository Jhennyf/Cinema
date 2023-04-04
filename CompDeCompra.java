package cinema;

public class CompDeCompra {

	public static void main(String[] args) {
		Filme f1 = new Filme("Entre tapas e beijos", "tristeza", "'clarice e jhennyf e suas desiluções'", "www",
				140, 18);
		f1.status();

		//Sessoes s1 = new Sessoes("18:00", "Legendado");

		AssentosCinema a1 = new AssentosCinema();
		a1.reservarAssento(2, 3);
		a1.mostrarAssentos();

//		Pessoa p = new Pessoa("jhennyf", 19, "5564992563821", "71328322122", "Deus@2022");

	//	Datas dia = new Datas("Te-Feira");

	}
}
