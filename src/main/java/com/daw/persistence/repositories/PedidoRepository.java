package com.daw.persistence.repositories;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

import com.daw.persistence.entities.Pedido;

public interface PedidoRepository extends ListCrudRepository<Pedido, Integer> {

	List<Pedido> findByMetodo(String metodo);
	
	List<Pedido> findByFechaBetween (LocalDateTime fechaInicio , LocalDateTime fechaFin );
	
	List<Pedido> findByIdCliente (int idCliente);

}
