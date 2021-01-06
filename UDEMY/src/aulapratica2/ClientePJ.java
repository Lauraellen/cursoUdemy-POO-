package aulapratica2;

// extends significa que essa classe herda os atributos e metodos da classe Cliente
public class ClientePJ extends Cliente {

	private String cnpj;
	
	// construtor
	public ClientePJ(String nome, String endereco, String cnpj) {
		// super serve pra chamarmos o construtor da classe cliente
		super(nome, endereco);
		this.cnpj = cnpj;
	}
	
	// fazemos apenas getters and setters do atributo cnpj, pois ja herdamos os metodos
	// da dos atributos nome e endereco da classe pai
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	// polimorfismo
	// chamamos o metodo pai q � a Classe Cliente, e adicionamos o atributo especifico dessa classe
	public String toString() {
		return super.toString() + "cnpj: " + cnpj;
				
	}
	
}
