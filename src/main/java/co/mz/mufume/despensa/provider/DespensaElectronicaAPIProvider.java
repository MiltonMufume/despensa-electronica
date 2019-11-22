package co.mz.mufume.despensa.provider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import co.mz.mufume.despensa.domain.Produto;
import co.mz.mufume.despensa.io.ProdutosDespensaInput;
import co.mz.mufume.despensa.io.ProdutosDespensaOutput;

public class DespensaElectronicaAPIProvider {

	private List<Produto> produtos = Arrays.asList(
			new Produto("carne", "alimento", 5, true, "20/10/2019", "20/03/2020", "20/10/2019", "25%"),
			new Produto("sabão líquido", "limpeza", 1, true, "20/10/2019", "20/03/2020", "20/10/2019", "5%"),
			new Produto("paracetamol", "medicamento", 1, true, "20/10/2019", "20/03/2021", "20/10/2019", "2%"),
			new Produto("lampadas", "utensílio", 5, false, "20/10/2019", "00/00/0000", "20/10/2019", "50%"),
			new Produto("peixe", "alimento", 20, true, "20/10/2019", "20/03/2020", "20/10/2019", "25%"),
			new Produto("frango", "alimento", 10, true, "20/10/2019", "20/03/2020", "20/10/2019", "25%"));

	public ProdutosDespensaOutput getProdutosbyCategoria(ProdutosDespensaInput input) {
		List<Produto> produtosList = new ArrayList<Produto>();

		for (Produto produto : produtos) {

			if (produto.getSubCategoria().equals(input.getCategoria())) {

				produtosList.add(produto);

			}

		}

		ProdutosDespensaOutput produtosDespensaOutput = new ProdutosDespensaOutput();

		produtosDespensaOutput.setProdutos(produtosList);

		return produtosDespensaOutput;
	}

}
