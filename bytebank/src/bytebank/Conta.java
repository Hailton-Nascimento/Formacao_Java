package bytebank;

public class Conta {
	int agencia;
	int numeroConta;
	double saldo;
	String titular;
	
	
	
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	void deposita (double valor) {
		this.saldo+=valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo>=valor) {
			this.saldo-=valor;
			return true;
		}else {
			return false;
		}
	}
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo>=valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
	return false;	
	}
}
