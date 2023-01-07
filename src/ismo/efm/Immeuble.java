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

public class Immeuble {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="num_immeuble")
	private int id;
	@Column 
	private int nb_etage_total;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "code_rue")
	private Rue rue;
	
	@OneToMany(mappedBy = "Immeuble", fetch = FetchType.EAGER)
	private List<Etage> Etage;

}
