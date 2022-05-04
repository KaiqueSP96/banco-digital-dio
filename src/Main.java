
public class Main {

	public static void main(String[] args) {
		
		Cliente kaique = new Cliente();
		kaique.setNome("Kaique");
		
		Conta cc = new ContaCorrente(kaique);
		Conta poupanca = new ContaPoupanca(kaique);
		
		cc.depositar(100);
		cc.sacar(50);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
