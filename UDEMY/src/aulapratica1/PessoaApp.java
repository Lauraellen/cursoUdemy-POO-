package aulapratica1;

public class PessoaApp {
	
	public static void main (String[] args) {
		
		// criamos o objeto pessoa1 do tipo Pessoa
		// usamos o new e logo ap�s o construtor Pessoa, e passamos os valores dos parametros, do objeto
		Pessoa pessoa1 = new Pessoa(1, "Laura");
		
		Pessoa pessoa2 = new Pessoa(2, "Ellen");
		
		//mostrando na tela
		System.out.println("o id do usu�rio �:  " + pessoa1.getCodigo());
		System.out.println("O nome � " + pessoa1.getName());
		
		// usando o metodo set, para modificar o atributo nome do objeto pessoa1
		pessoa1.setNome("Ana");
		
		System.out.println("O nome � " + pessoa1.getName());
	}

}
