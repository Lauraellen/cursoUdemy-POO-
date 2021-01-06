package aulapratica2;

public class ClientePF extends Cliente {
	
	private String cpf;
	
	// construtor
	public ClientePF(String nome, String endereco, String cpf) {
		// herdando construtor da classe pai
		super(nome, endereco);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	// polimorfismo
	// chamamos o metodo pai q é a Classe Cliente, e adicionamos o atributo especifico dessa classe
	public String toString() {
		return super.toString() + "cpf: " + cpf;
				
	}

}
