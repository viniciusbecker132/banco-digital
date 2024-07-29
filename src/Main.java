import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		banco.setNome("Banco Brasil");
		Cliente cliente = new Cliente();
		cliente.setNome("Venilton");
		cliente.setCpf("123.345.678-00");
		Cartao cartao = new Cartao();

		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(1000);
		cc.transferir(100, poupanca);

		banco.imprimirConta();
		cartao = cartao.gerarCartao(cliente, cc, "Debito");
		cc.imprimirExtrato(cartao);
		cartao = cartao.gerarCartao(cliente, poupanca,"Debito");
		poupanca.imprimirExtrato(cartao);






	}

}
