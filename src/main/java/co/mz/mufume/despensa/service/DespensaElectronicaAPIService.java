package co.mz.mufume.despensa.service;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import co.mz.mufume.despensa.domain.Produto;
import co.mz.mufume.despensa.io.ProdutosDespensaInput;
import co.mz.mufume.despensa.io.ProdutosDespensaOutput;
import co.mz.mufume.despensa.provider.DespensaElectronicaAPIProvider;

@Path("despensa")
public class DespensaElectronicaAPIService {

	@Inject
	private DespensaElectronicaAPIProvider despensaElectronicaAPIProvider;

	@Inject
	private ProdutosDespensaInput input;

	/*** template de um método post para o caso de haver necessidade de usar um */
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/pathForPutTemplateExample")
	public ProdutosDespensaOutput uploadDocuments(ProdutosDespensaInput input) {

		// despensaElectronicaAPIProvider.putSomething(input);

		return null;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/produtosByCategoria")
	public ProdutosDespensaOutput getProdutosByCategoria(@QueryParam("categoria") String categoria) {

		input.setCategoria(categoria);

		return despensaElectronicaAPIProvider.getProdutosbyCategoria(input);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/produtos")
	public ProdutosDespensaOutput getProdutos() {

		ProdutosDespensaOutput produtosDespensaOutput = new ProdutosDespensaOutput();

		List<Produto> produtos = Arrays.asList(
				new Produto("carne", "alimento", 5, true, "20/10/2019", "20/03/2020", "20/10/2019", "25%"),
				new Produto("sabão líquido", "limpeza", 1, true, "20/10/2019", "20/03/2020", "20/10/2019", "5%"),
				new Produto("paracetamol", "medicamento", 1, true, "20/10/2019", "20/03/2021", "20/10/2019", "2%"),
				new Produto("lampadas", "utensílio", 5, false, "20/10/2019", "00/00/0000", "20/10/2019", "50%"),
				new Produto("peixe", "alimento", 20, true, "20/10/2019", "20/03/2020", "20/10/2019", "25%"),
				new Produto("frango", "alimento", 10, true, "20/10/2019", "20/03/2020", "20/10/2019", "25%"));

		produtosDespensaOutput.setProdutos(produtos);

		return produtosDespensaOutput;
	}

}
