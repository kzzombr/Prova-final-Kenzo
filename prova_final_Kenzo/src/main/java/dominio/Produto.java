package dominio;


public class Produto {
	private int codigo;
	private String nome;
	private double valorUnitario;
	private int quantidadeEmEstoque;

	public Produto(int codigo, String nome, double valorUnitario, int quantidadeEmEstoque) {
            this.codigo = codigo;
            this.nome = nome;
            this.valorUnitario = valorUnitario;
            this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + "] ";
	}


	
}
