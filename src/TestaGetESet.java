
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		Cliente paulo = new Cliente();
		// paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		
		Cliente testeConta = new Cliente();
		Conta testeContaC = new Conta();
		
		testeConta.setNome("João Luis");
		testeContaC.setTitular(testeConta);
		
		testeConta.setCpf("222.222.222-22");
		testeConta.setProfissao("Programador");
		
		
		System.out.println("-=-=-=-=INFORMAÇÕES SOBRE JOÃO LUIS=-=-=-=-");
		System.out.println( );
		System.out.println("Nome Completo: " + testeContaC.getTitular().getNome());
	}
}
