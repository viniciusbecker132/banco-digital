import java.util.Random;

public class Cartao implements ICartao {
    private String cartao;
    private Cliente cliente;
    private  String tipoCartao ;
    private IConta conta;

    public IConta getConta() {
        return conta;
    }

    public void setConta(IConta conta) {
        this.conta = conta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cartao() {}

     public Cartao(IConta conta, Cliente cliente) {}

    public String getCartao() {
        return cartao != null ? cartao : "";
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    @Override
    public Cartao gerarCartao(Cliente cliente, IConta conta, String tipoCartao) {
        Random random = new Random();
        Cartao cartao = new Cartao();
        String nrCartao = "";
        if(!cliente.getCpf().isEmpty()){
            for(int x = 1 ; x <= 15 ; x++) {
                int numero = random.nextInt(9);
                nrCartao= nrCartao.concat(Integer.toString(numero));
            }
            cartao.setCartao(nrCartao);
            cartao.setTipoCartao(tipoCartao);
            cartao.setCliente(cliente);
            cartao.setConta(conta);

        }
        return cartao;
    }
}
