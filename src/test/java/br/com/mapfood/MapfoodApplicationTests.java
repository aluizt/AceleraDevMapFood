package br.com.mapfood;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.mapfood.domain.ProdutosEstabelecimento;
import br.com.mapfood.processors.CompararProdutoEstabelecimento;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapfoodApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	
	@Autowired
	private CompararProdutoEstabelecimento comparaProduto;
	
	@Test
	public void compara() {
		List<ProdutosEstabelecimento> lista =comparaProduto.compara();
				
		assertNotNull(lista);
	}
}

