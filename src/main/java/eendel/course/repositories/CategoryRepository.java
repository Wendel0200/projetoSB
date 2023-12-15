package eendel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import eendel.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
