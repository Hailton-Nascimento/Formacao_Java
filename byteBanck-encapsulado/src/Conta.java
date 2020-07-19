

public class Conta {
	private int agencia;
	private int numeroConta;
	private double saldo;
	private Cliente titular;
	static int  total;
	
    public Conta( int agencia, int numero) { 
    	Conta.total++;
        this.agencia = agencia;
        this.numeroConta = numero;
        System.out.println("estou criando uma conta" + this.numeroConta);
    }
	
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
	           System.out.println("Nao pode valor menor igual a 0");
	           return;
	       }
	       this.agencia = agencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
        if(numeroConta <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public static  int getTotal() {
		return total;
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
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}
