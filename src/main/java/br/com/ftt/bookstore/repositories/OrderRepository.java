package br.com.ftt.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ftt.bookstore.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
