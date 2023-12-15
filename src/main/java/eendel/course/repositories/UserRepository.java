package eendel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import eendel.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
