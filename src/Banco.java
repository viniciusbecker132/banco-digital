import java.util.List;

public class Banco {

	private String nome;
    public Banco() {

    }

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void imprimirConta(){
		System.out.println(String.format("Agencia: %s",  this.getNome()));
	}

}
