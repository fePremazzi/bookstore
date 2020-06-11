package br.com.ftt.bookstore.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "book")
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	private String isbn;
	private String description;
	
	@ManyToOne
	@Column(name="id_suplier") 
	private Long idSuplier;
	
	@ManyToOne
	@Column(name="id_category")
	private Long idCategory;
	
	@OneToMany(mappedBy = "book")
    List<OrderXBook> orderBooks;

}
