package bytebank;

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	private static int contador;
	
	public Conta(){
		contador++;
		System.out.println("A classe Conta foi invocado: " + contador + " Cliente(s) cadastrado(s)");
	}
	
	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean tranfere(double valor, Conta conta) {
		if (valor > 0 && this.saldo >= valor) {
			saca(valor);
			conta.deposita(valor);
			return true;
		}
		return false;
	}
	
	public Void preencheTitular(String nome, String cpf, String profissao) {
		this.getTitular().setNome(nome);
		this.getTitular().setCpf(cpf);
		this.getTitular().setProfissao(profissao);
		return null;
	}
	
	public void extrato() {
		if(this.titular.getNome() 	   != null &&
		   this.titular.getCpf() 	   != null &&
		   this.titular.getProfissao() != null) {
				
			System.out.println("==========================");
			System.out.println("Nome:      " + this.titular.getNome());
			System.out.println("CPF:       " + this.titular.getCpf());
			System.out.println("Profissão: " + this.titular.getProfissao());
			System.out.println("Saldo:     R$ " + this.saldo);
			System.out.println("Agencia:   " + this.agencia);
			System.out.println("Numero:    " + this.numero);
			System.out.println("==========================");
	
		}else {
			System.out.println("Preencha os campos Nome, CPF e Profissão!");
		}
	}
}
