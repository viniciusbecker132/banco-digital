public class ContaCorrente extends Conta {

;
	public int limite = 1000;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}


	@Override
	public void imprimirExtrato(Cartao cartao) {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
		if (!cartao.getCartao().isEmpty() && cartao.getCartao() != null) {
			System.out.println("Cartão: " + cartao.getCartao());
			System.out.println("Limite: " + this.limite);
			System.out.println("Tipo: " + cartao.getTipoCartao());
		}

	}
	
}
