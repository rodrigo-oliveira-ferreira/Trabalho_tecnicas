package Model;

public class Produtos {

	private int codigo, quantidade, loja;
	private String descricao, fornecedor;
	private double preco;

	public Produtos(int codigo, String descricao, int quantidade, double preco, String fornecedor, int loja) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
		this.fornecedor = fornecedor;
		this.loja = loja;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getEstoque() {
		return loja;
	}

	public void setEstoque(int loja) {
		this.loja = loja;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}