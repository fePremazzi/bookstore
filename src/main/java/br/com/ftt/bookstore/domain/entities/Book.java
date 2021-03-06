package br.com.ftt.bookstore.domain.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	@JoinColumn(name="id_suplier") 
	private Suplier suplier;
	
	@ManyToOne
	@JoinColumn(name="id_category")
	private Category category;
	
	@OneToMany(mappedBy = "book")
    List<BookSale> bookSale = new ArrayList<>(); 

}
