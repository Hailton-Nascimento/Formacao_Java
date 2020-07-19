
public class TestaGetESet {

    public static void main(String[] args) { 
        Conta conta = new Conta(1337, 89724);
        conta.setNumeroConta(1337);
        System.out.println(conta.getNumeroConta()); 
    }
}