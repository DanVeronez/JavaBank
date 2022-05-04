package bytebank;

public class Teste {
	public static void main(String[] args) {
		
		Conta contaDoDaniel = new Conta();
		contaDoDaniel.setTitular(new Cliente());
		
		Conta contaDaVic = new Conta();
		contaDaVic.setTitular(new Cliente());

		contaDoDaniel.deposita(200);

		contaDoDaniel.saca(50);

		contaDoDaniel.tranfere(40, contaDaVic);
		
		contaDoDaniel.preencheTitular("Daniel Veronez","222.222.222-22","Programador");
		contaDoDaniel.extrato();
		
		contaDaVic.preencheTitular("Vic Reis", "333.333.333-33","Enfeimeira");
		contaDaVic.extrato();
		
		contaDoDaniel.deposita(1000);
		
		contaDoDaniel.extrato();
		contaDaVic.extrato();
	}
}
