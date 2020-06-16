package br.com.ftt.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.ftt.bookstore.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
