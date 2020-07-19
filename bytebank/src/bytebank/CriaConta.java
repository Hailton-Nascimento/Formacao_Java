package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo= 354.09;
		System.out.println(primeiraConta.saldo);
	
		primeiraConta.saldo		 +=100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta =new Conta();
		segundaConta.saldo = 654.98;
		
		
		
		System.out.println("prmiera conta tem saldo de: "+primeiraConta.saldo +".");
		System.out.println("segunda caonta tem salda de: "+segundaConta.saldo+".");
		System.out.println(primeiraConta.agencia);
	}

}
