package aulapratica1;

// classe Pessoa com m�todos e atributos
public class Pessoa {
	
	//atributos declarados como private para que n�o sejam acessados por outra classe
	private int codigo;
	private String nome;
	
	// m�todo construtor de mesmo nome da classe. E serve para inicializar os atributos
	public Pessoa(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	// m�todo para acessar o conteudo do atributo nome do objeto.
	public String getName() {
		return nome;
	}
	
	// m�todo para acessar o conteudo do atributo codigo do objeto.
		public int getCodigo() {
			return codigo;
	}

}
