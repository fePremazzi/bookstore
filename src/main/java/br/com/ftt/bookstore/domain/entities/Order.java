package br.com.ftt.bookstore.domain.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "order")
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@Column(name="id_user")
	private Long idUser;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_fechamento")
	private Date dataFechamento;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_entrega")
	private Date dataEntrega;
	
	@OneToMany(mappedBy = "order")
    List<OrderXBook> orderBooks;
}
