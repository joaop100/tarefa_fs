package tarefa_fs;

public class Conta {
	
	private Pessoa cliente;
	private int nrConta;
	private double saldo;
	
	public Pessoa getCliente() {
		return this.cliente;
	}
	
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	
	public int getNrConta() {
		return this.nrConta;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void abrirConta(int nrConta) {
		this.nrConta = nrConta;
		this.saldo = 0;
	}
	
	public void sacar(double valor) {
		if (this.temSaldo(valor)) {
			this.debitar(valor);
		}
	}
	
	private void debitar(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	protected boolean temSaldo(double valor) {
		if (this.saldo <= valor) {
			return false;
		}
		
		return false;
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void transferir() {
		
	}
	
}
