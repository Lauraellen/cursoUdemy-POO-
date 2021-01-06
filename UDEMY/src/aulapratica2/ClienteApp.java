package aulapratica2;

public class ClienteApp {
	
	public static void main (String [] args) {
		
		ClientePF clientepf1 = new ClientePF("Laura", "Conceição Lopes", "105.163.146-70");
		
		ClientePJ clientepj2 = new ClientePJ("Alex", "Santo Antônio", "555.123.852-89");
		
	//	System.out.println("Nome: " + clientepf1.getName() + " Endereço: " + clientepf1.getEndereco()
	//	+ " CPF: " + clientepf1.getCpf());
		
	//	System.out.println("Nome: " + clientepj2.getName() + " Endereço: " + clientepj2.getEndereco()
	//	+ " CNPJ: " + clientepj2.getCnpj());
		
		System.out.println(clientepf1.toString());
		System.out.println(clientepj2.toString());
		
	}

}
