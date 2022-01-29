
public class Main {

	public static void main(String[] args) {
		Cliente emerson = new Cliente();
		emerson.setNome("Emerson Petrillo");
		
		Conta cc = new ContaCorrente(emerson);
		Conta poupanca = new ContaPoupanca(emerson);

		cc.depositar(10000);
		cc.transferir(5000, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
