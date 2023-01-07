package ismo.efm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Rue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="code_rue")
	private int id;
	@Column
	private String nom_rue;
	
	
	

}
