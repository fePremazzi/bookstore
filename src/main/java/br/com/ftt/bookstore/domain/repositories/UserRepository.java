package br.com.ftt.bookstore.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ftt.bookstore.domain.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
