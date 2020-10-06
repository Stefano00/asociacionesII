package com.edutecno.asociacionesii.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="destino")
public class Destino {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String ciudad;
	private String pais;
	private String fecha;
	@ManyToOne
	@JoinColumn(name="id_pasajero")
	private Pasajero pasajero;
	@Override
	public String toString() {
		return "Destino: ciudad: " + ciudad + ", pais: " + pais + ", fecha: " + fecha + ", pasajero: "
				+ pasajero.getNombre();
	}
	
	
	
}
