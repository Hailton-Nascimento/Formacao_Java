package bytebank;

public class TesteDeReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		
		primeiraConta.saldo=300;
		
		System.out.println("Saldo da  primeira  conta é "+primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da Segunda conta: "+segundaConta.saldo);
		
		
		segundaConta.saldo+=300;
		System.out.println("Saldo da Segunda conta: "+segundaConta.saldo);
		System.out.println("Saldo da  primeira  conta é "+primeiraConta.saldo);
		
		
		if(primeiraConta== segundaConta) {
			System.out.println("Sao a Mesma conta.");
		}
	}

}
