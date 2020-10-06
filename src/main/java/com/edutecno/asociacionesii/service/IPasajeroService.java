package com.edutecno.asociacionesii.service;

import java.util.List;

import com.edutecno.asociacionesii.model.Pasajero;

public interface IPasajeroService {
	public void save(Pasajero pasajero);
	public List<Pasajero> findAll();
}
