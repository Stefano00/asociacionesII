package com.edutecno.asociacionesii.service;

import java.util.List;

import com.edutecno.asociacionesii.model.Destino;

public interface IDestinoService {
	public void save(Destino destino);
	public List<Destino> findAll();
}
