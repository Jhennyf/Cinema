package cinema;
/**
 * 
 *
 *
 */
public class Pessoa {
	private String nome;    
	private int idade;
	private String celular;
	private String cpf;
	private String senha;
	
	public Pessoa() {
		
	}
	/**
	 * 
	 * @param nome
	 * @param idade
	 * @param celular
	 * @param cpf
	 * @param senha
	 */
	public Pessoa(String nome, int idade, String celular, String cpf, String senha) {
		super();
		this.nome = (verifNome(nome));
		this.idade = (verifIdade(idade));
		this.celular = (verifCelular(celular));
		this.cpf = (verifCpf(cpf));
		this.senha = (verifSenha(senha));
	}

	
	public String verifNome(String nome) {
		try {
				if((nome.length() < 3) || (nome.length() > 20)) {
				} else {
					this.nome = nome;
				}
				System.out.println("Continue o cadastro " + this.nome);
		}catch(IllegalArgumentException e) {
			System.out.println("Nome inválido. Minimo 3 caracteres, máximo 20 caracteres");
		}
		return nome;
	}
	
	
	public int verifIdade(int idade) {
		try {
			//verifica se a idade não é menor que 0
			if(idade < 0) {
				 throw new IllegalArgumentException("O número deve ser positivo!");
			}
		}catch(IllegalArgumentException e) {
			System.out.println("A idade inválida digitada foi: " + idade);
		}
		//pedir pro usuário digitar novamente!!
		//verifica se o usuário é menor de idade
		if(idade <= 17) {
			System.out.println("Permissão apenas para filmes com classificação "
					+ "idicativa para menores de 18 anos.");
		}
		//veirifica se o usuario é maior de idade
		if(idade > 18) {
			System.out.println("Permissão para assistir filmes de todas classificações indicativas. ");
		}
		return idade;
			
	}
	
	public String verifCelular(String celular) {
		try {
			//verifica a quantidade de digitos do celular
			if(celular.length() != 13) {
				throw new IllegalArgumentException("O número de celular deve ter 13 dígitos.");
			}
			//verifica se o DDD do celular é do Brasil
			if(!celular.startsWith("55")) {
				throw new IllegalArgumentException("o número de celular de começar com o código de país +55!");
			}
			System.out.println("Celular válido.");
		}catch(IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return celular;	
	}
	
	public String verifCpf(String cpf) {
		try {
			//verifica a quantidade de digitos do CPF
			if(cpf.length() != 11) {
				throw new IllegalArgumentException("O CPF deve conter 11 dígitos númericos.");
			}
			//Verifica por meio do método cpfValido a validaçao do cpf
			if(!cpfValido(cpf)) {
				throw new IllegalArgumentException ("CPF inválido!");
			}
			System.out.println("CPF válido.");
		}catch(IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return cpf;
	}
	
	public static boolean cpfValido(String cpf) {
		 if (cpf.equals("00000000000") || cpf.equals("11111111111") 
				 || cpf.equals("22222222222") || cpf.equals("33333333333") 
				 || cpf.equals("44444444444") || cpf.equals("55555555555") 
				 || cpf.equals("66666666666") || cpf.equals("77777777777") 
				 || cpf.equals("88888888888") || cpf.equals("99999999999")) {
			  return false;
		 }else {
			 return true;
		 }
	}

	public String verifSenha(String senha) {
		try {
			//verifica se a senha não atingiu o minimo de 8 caracteres
			if(senha.length() < 8) {
				throw new IllegalArgumentException("A senha deve ter no mínimo 8 caracteres.");
			}
			//verifica se a senha não excedeu o limite de 15 caracteres
			if(senha.length() > 15) {
				throw new IllegalArgumentException("A senha excedeu o limite de 20 caracteres.");
			}
			// Verifica se a senha contém letras minúsculas
            if (!senha.matches(".*[a-z].*")) {
                throw new IllegalArgumentException("A senha deve conter pelo menos uma letra minúscula.");
            }

            // Verifica se a senha contém números
            if (!senha.matches(".*\\d.*")) {
                throw new IllegalArgumentException("A senha deve conter pelo menos um número.");
            }

            // Verifica se a senha contém caracteres especiais
            if (!senha.matches(".*[!@#$%&*_+=|(){}\\[\\]<>?/\\\\].*")) {
                throw new IllegalArgumentException("A senha deve conter pelo menos um caractere especial.");
            }
            System.out.println("Senha criada com sucesso");
            System.out.println("--------------------------------------------------------------");
            
		}catch(IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return senha;
	}
	
	public void setNome(String nome) {
		this.nome = nome;	
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
			
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
