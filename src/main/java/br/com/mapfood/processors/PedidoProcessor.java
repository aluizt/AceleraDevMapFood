package br.com.mapfood.processors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mapfood.Service.PedidoService;
import br.com.mapfood.domain.ItemDoPedido;
import br.com.mapfood.domain.Pedido;
import br.com.mapfood.domain.ProdutosEstabelecimento;
import br.com.mapfood.domain.enums.EstadoDoPedido;

@Service
public class PedidoProcessor {

	
	public List<Pedido> criarPedidos(){
		
		List<ItemDoPedido> itens1 = new ArrayList();
		List<ItemDoPedido> itens2 = new ArrayList();
		

		Pedido p1=new Pedido(
				(long)1,
				(long)10,
				(long)100,
				null,
				EstadoDoPedido.ACEITO,
				null
				);
				
			
			
		Pedido p2=new Pedido(
				(long)2,
				(long)10,
				(long)101,
				null,
				EstadoDoPedido.ACEITO,
				null
				);
	
				
		ItemDoPedido item1 = new ItemDoPedido();
		ItemDoPedido item2 = new ItemDoPedido();
		ItemDoPedido item3 = new ItemDoPedido();
		ItemDoPedido item4 = new ItemDoPedido();
		
		item1.setId((long)1);
		item1.setIdProduto((long)5);
		item1.setQuantidade((long)2);
		item1.setPedido(p1);
		
		item2.setId((long)2);
		item2.setIdProduto((long)10);
		item2.setQuantidade((long)3);
		item2.setPedido(p1);
		
		item3.setId((long)3);
		item3.setIdProduto((long)7);
		item3.setQuantidade((long)4);
		item3.setPedido(p2);
		
		item4.setId((long)4);
		item4.setIdProduto((long)8);
		item4.setQuantidade((long)1);
		item4.setPedido(p2);
		
	//cli1.getEnderecos().addAll(Arrays.asList(e1, e2));
		
		itens1.add(item1);
		itens1.add(item2);
		itens2.add(item3);
		itens2.add(item4);
		
		p1.setItens(itens1);
		p2.setItens(itens2);
		
	    List<Pedido> pedidos = new ArrayList();
	    pedidos.add(p1);
	    pedidos.add(p2);
		
	   
	    return pedidos;
	}

}
