package miniprojetobanco;

public class Conta {
	private int numero;
	private String agencia;
	private double saldo;
	private Cliente titular;

	public void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		} else {
			System.out.println("O número não é válido");
		}
	}

	public int getNumero() {
		return this.numero;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {
		if(valor<=this.saldo) {
			this.saldo -= valor;
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void transfere(double valor, Conta conta) {
		if(valor<=this.saldo) {
			this.saldo -= valor;
			conta.deposito(valor);
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}

	public void setAgencia(String agencia) {
		if (agencia != null) {
			this.agencia = agencia;
		} else {
			System.out.println("Agência não é valida");
		}
	}

	public String getAgencia() {
		return this.agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public Cliente getCliente() {
		return this.titular;
	}

	public void setCliente(Cliente titular) {
		this.titular = titular;
	}

	public void consultaSaldo() {
		System.out.printf("%s, Seu saldo é de R$ %.2f\n",this.getCliente().getNome(), this.getSaldo());
	}

}
