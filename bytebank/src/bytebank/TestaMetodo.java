package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo=982.58;
		conta.deposita(500);
		
		System.out.println("Seu saldo �: "+conta.saldo);
		
		
		boolean conseguiSacar = conta.saca(540.98);
		if(conseguiSacar) {
			System.out.println("Saque que efetuado!");
		}else {
			System.out.println("N�o foi possivel sacar.");
		}
		
		Conta contaMarcela = new Conta();
		Conta ContaRicardo = new Conta();
		
		
		contaMarcela.saldo=1000;
		

		if(	contaMarcela.transfere(500, ContaRicardo)) {
			System.out.println("Transferencia que efetuado!");
		}else {
			System.out.println("N�o foi possivel tranferir.");
		}
		

	}

}
