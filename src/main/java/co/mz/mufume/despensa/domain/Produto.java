package co.mz.mufume.despensa.domain;

public class Produto {

	private String desiganacao;

	private String subCategoria;

	private int quantidade;

	private boolean perecivel;

	private String dataEntrada;

	private String dataValidade;

	private String dataCadastro;

	private String percentagemAquisicao;

	public Produto(String desiganacao, String subCategoria, int quantidade, boolean perecivel, String dataEntrada,
			String dataValidade, String dataCadastro, String percentagemAquisicao) {
		super();
		this.desiganacao = desiganacao;
		this.subCategoria = subCategoria;
		this.quantidade = quantidade;
		this.perecivel = perecivel;
		this.dataEntrada = dataEntrada;
		this.dataValidade = dataValidade;
		this.dataCadastro = dataCadastro;
		this.percentagemAquisicao = percentagemAquisicao;
	}

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDesiganacao() {
		return desiganacao;
	}

	public void setDesiganacao(String desiganacao) {
		this.desiganacao = desiganacao;
	}

	public String getSubCategoria() {
		return subCategoria;
	}

	public void setSubCategoria(String subCategoria) {
		this.subCategoria = subCategoria;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isPerecivel() {
		return perecivel;
	}

	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getPercentagemAquisicao() {
		return percentagemAquisicao;
	}

	public void setPercentagemAquisicao(String percentagemAquisicao) {
		this.percentagemAquisicao = percentagemAquisicao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produto [desiganacao=");
		builder.append(desiganacao);
		builder.append(", subCategoria=");
		builder.append(subCategoria);
		builder.append(", quantidade=");
		builder.append(quantidade);
		builder.append(", perecivel=");
		builder.append(perecivel);
		builder.append(", dataEntrada=");
		builder.append(dataEntrada);
		builder.append(", dataValidade=");
		builder.append(dataValidade);
		builder.append(", dataCadastro=");
		builder.append(dataCadastro);
		builder.append(", percentagemAquisicao=");
		builder.append(percentagemAquisicao);
		builder.append("]");
		return builder.toString();
	}

}
