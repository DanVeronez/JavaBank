package bytebank;

public class CriaConta {

	public static void main(String[] args) {

		// Primeira Atribuição de um objeto.
		Conta primeiraConta = new Conta();
		primeiraConta.setTitular(new Cliente());
		
		primeiraConta.preencheTitular("Cliente 1", "999.999.999-99", "Contador");
		
		primeiraConta.deposita(200);
		primeiraConta.extrato();

		primeiraConta.deposita(100);
		primeiraConta.extrato();

		Conta segundaConta = new Conta();
		segundaConta.setTitular(new Cliente());
		
		segundaConta.preencheTitular("Cliente 2", "888.888.888-88", "Lenhadora");
		
		segundaConta.deposita(50);
		segundaConta.extrato();

//		System.out.println("Primeira Conta: R$" + primeiraConta.getSaldo());
//		System.out.println("Segunda  Conta: R$" + segundaConta.getSaldo());

		primeiraConta.setAgencia(347);
		primeiraConta.setNumero(98442);

		primeiraConta.tranfere(75, segundaConta);
		
		primeiraConta.extrato();
		segundaConta.extrato();
	
	}
}
