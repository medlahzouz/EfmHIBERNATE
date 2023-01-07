package ismo.efm;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Entity
@Table

@Getter
@Setter
@ToString
public class Etage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="num_etage")
	private int id;
	@Column
	private int nb_appartement_tot;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "num_immeuble")
	private Immeuble immeuble;
	
	@OneToMany(mappedBy = "Etage", fetch = FetchType.EAGER)
	private List<Appartement> Appartements;
	

}
