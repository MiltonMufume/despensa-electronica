package co.mz.mufume.despensa.io;

import java.util.ArrayList;
import java.util.List;

import co.mz.mufume.despensa.domain.Produto;

public class ProdutosDespensaOutput {

	private List<Produto> produtos = new ArrayList<Produto>();

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProdutosDespensaOutput [produtos=");
		builder.append(produtos);
		builder.append("]");
		return builder.toString();
	}

}
