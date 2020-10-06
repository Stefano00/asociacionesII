package com.edutecno.asociacionesii.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="pasajero")
public class Pasajero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String rut;
	private String nombre;
	private String apellido;
	private int edad;
	@Column(name="ciudad_natal")
	private String ciudad_natal;
	//@Transient
	@OneToMany(mappedBy = "pasajero")
	private List<Destino> destino;
	@Override
	public String toString() {
		return "Pasajero: rut: " + rut + ", nombre: " + nombre + ", apellido: " + apellido + ", edad: "
				+ edad + ", ciudad_natal: " + ciudad_natal + ", destino: " + destino;
	}
	

}
