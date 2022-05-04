package bytebank;

public class CriaContaReferencia {
	public static void main(String[] args) {

		// Primeira Atribuição de um objeto.
		Conta primeiraConta = new Conta();

	
		primeiraConta.deposita(200);;
		System.out.println(primeiraConta.getSaldo());

		primeiraConta.deposita(100);
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		segundaConta.deposita(50);

		System.out.println("Primeira Conta: R$" + primeiraConta.getSaldo());
		System.out.println("Segunda  Conta: R$" + segundaConta.getSaldo());

	}
}