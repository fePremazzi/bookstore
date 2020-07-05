package br.com.ftt.bookstore.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ftt.bookstore.domain.entities.Suplier;

@Repository
public interface SuplierRepository extends JpaRepository<Suplier, Long> {

}
