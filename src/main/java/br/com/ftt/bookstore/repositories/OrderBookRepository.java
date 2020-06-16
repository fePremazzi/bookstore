package br.com.ftt.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ftt.bookstore.entities.OrderXBook;

@Repository
public interface OrderBookRepository extends JpaRepository<OrderXBook, Long> {

}
