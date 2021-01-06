package aulapratica2;

public class Cliente {
	
	private String nome;
	private String endereco;
	
	// construtor
	public Cliente(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public String getName() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setName(String nome) {
		this.nome = nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	// polimorfismo
	// para mostar os atributos
	public String toString() {
		return "nome: " + nome + " endereco: " + endereco;
	}
}
