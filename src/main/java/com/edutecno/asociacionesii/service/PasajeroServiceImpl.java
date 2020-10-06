package com.edutecno.asociacionesii.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.asociacionesii.model.Pasajero;
import com.edutecno.asociacionesii.repository.IPasajeroRepository;

@Service
public class PasajeroServiceImpl implements IPasajeroService {

	@Autowired
	IPasajeroRepository pasajeroRepository; 
	
	@Override
	public void save(Pasajero pasajero) {
		pasajeroRepository.save(pasajero);

	}

	@Override
	public List<Pasajero> findAll() { 	
		List<Pasajero> listaPasajeros = new ArrayList<Pasajero>();
		listaPasajeros=(List<Pasajero>) pasajeroRepository.findAll();
		return listaPasajeros;
	}

}
