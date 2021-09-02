package bytebank;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;

		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

		segundaConta.saldo += 100;

		System.out.println("Saldo da Segunda conta: " + segundaConta.saldo);

		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		segundaConta.agencia = 146;
		System.out.println("Agora a segunda conta está na agencia " + segundaConta.agencia );
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		} else {
			System.out.println("São contas diferentes");
		}

	}

}
