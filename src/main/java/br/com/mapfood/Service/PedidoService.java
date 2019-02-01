package br.com.mapfood.Service;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.mapfood.domain.Pedido;
import br.com.mapfood.processors.PedidoProcessor;
import br.com.mapfood.repository.ItemDoPedidoRepository;
import br.com.mapfood.repository.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private PedidoProcessor  pedidoProcessor;
	
	@Autowired
	private ItemDoPedidoRepository itemDoPedidoRepository;
	
	public void criarDados() {
		List<Pedido> listaPedido =pedidoProcessor.criarPedidos();
		pedidoRepository.saveAll(listaPedido);
		int i=0;
		for(Pedido pedido: listaPedido) {
			itemDoPedidoRepository.save( pedido.getItens().get(i));
			i++;
		}
		
	}
	
	public List<Pedido> findAll(){
	    return pedidoRepository.findAll();
	}

	public Pedido findById(Long id) {
	    Optional<Pedido> obj = pedidoRepository.findById(id);
	    return obj.orElse(null);
	}
	
	public void validaPedido(Pedido pedido) {
		
	
		
	}
}
