package aulapratica3;

public class ContaCorrente {
	
	private int agencia, numero;
	private float limite;
	
	// construtor
	public ContaCorrente(int agencia, float limite) {
		this.agencia = agencia;
		this.limite = limite;
	}
	
	// Sobrecarga
	// quando temos dois metodos com mesmo nome, o que difere são os argumentos
	public ContaCorrente(int agencia, float limite, int numero) {
		this.agencia = agencia;
		this.limite = limite;
	}

}
