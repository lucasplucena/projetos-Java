package miniprojetobanco;

public class testeContaCliente {
	public static void main(String[] args) {
		Cliente newCliente = new Cliente();
		newCliente.setNome("Sacul");
		newCliente.setCpf("12345678910");
		newCliente.setProfissao("Rei do Camarote");
		
		Conta newConta = new Conta();
		newConta.setCliente(newCliente);
		newConta.setAgencia("12345");
		newConta.setNumero(4321);
		
		newConta.deposito(250);
		Conta conta2 = new Conta();
		conta2.deposito(5000);
		conta2.setCliente(newCliente);
		conta2.consultaSaldo();
		
		conta2.transfere(300, newConta);
		
		newConta.consultaSaldo();
	}
}
