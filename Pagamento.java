package cinema;

public class Pagamento {
	private long numCartao, cpf;
	private int cvc, anoExp;
	private String nomeCart;
	
	public Pagamento(long numCartao, int cvc, String nomeCart, int anoExp, long cpf) {
		super();
		this.numCartao = verifNumCart(numCartao);
		this.cvc = verifCvc(cvc);
		this.nomeCart = atribuiNC(nomeCart);
		this.anoExp = verifAnoExp(anoExp);
		this.cpf = verifCpf(cpf);
	}
	
	public long verifNumCart(long numCartao) {
		System.out.println("--------------------------------------------------------------");
		if(numCartao <= 9999999999999999L) {
			this.setNumCartao(numCartao);
			System.out.println("Número do Cartão: " + this.getNumCartao()); 
		}else System.out.println("Número de Cartão Inválido!");
		
		return this.getNumCartao();
	}
	
	public int verifCvc(int cvc) {
		if(cvc >= 100 && cvc < 999) {
			this.setCvc(cvc);
			System.out.println("CVC: " + this.getCvc());
		}else System.out.println("CVC Inválido!");
		
		return this.getCvc();
	}
	
	public String atribuiNC(String nomeCart) {
		this.setNomeCart(nomeCart);
		System.out.println("Nome do Cartão: " + this.getNomeCart());
		return this.getNomeCart();
	}
	
	public int verifAnoExp(int anoExp) {
		if(anoExp > 2023) {
			this.setAnoExp(anoExp);
			System.out.println("Ano de Expedição: " + this.getAnoExp());
		}else System.out.println("Ano de Expedição Inválido!");
		
		return this.getAnoExp();
	}
	
	public long verifCpf(long cpf) {
		if(cpf < 99999999999L) {
			this.setCpf(cpf);
			System.out.println("CPF: " + this.getCpf());
		}else System.out.println("CPF Inválido!");
		
		return this.getCpf();
	}
	
	public long getNumCartao() {
		return numCartao;
	}
	public void setNumCartao(long numCartao) {
		this.numCartao = numCartao;
	}
	
	public int getCvc() {
		return cvc;
	}
	public void setCvc(int cvc) {
		this.cvc = cvc;
	}
	
	public String getNomeCart() {
		return nomeCart;
	}
	public void setNomeCart(String nomeCart) {
		this.nomeCart = nomeCart;
	}
	
	public int getAnoExp() {
		return anoExp;
	}
	public void setAnoExp(int anoExp) {
		this.anoExp = anoExp;
	}
	
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}	
}
