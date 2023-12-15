package eendel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import eendel.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
