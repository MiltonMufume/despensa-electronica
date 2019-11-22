package co.mz.mufume.despensa.io;

public class ProdutosDespensaInput {

	private String categoria;

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProdutosDespensaInput [categoria=");
		builder.append(categoria);
		builder.append("]");
		return builder.toString();
	}

}
