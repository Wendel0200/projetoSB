package eendel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import eendel.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
