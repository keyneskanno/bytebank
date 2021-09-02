package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(500);
		System.out.println(conta.saldo);
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println("Saldo restante: " + contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
	}

}
