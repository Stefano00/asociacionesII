package com.edutecno.asociacionesii.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.asociacionesii.model.Destino;
import com.edutecno.asociacionesii.repository.IDestinoRepository;

@Service
public class DestinoServiceImpl implements IDestinoService {

	@Autowired
	IDestinoRepository destinoRepository;
	
	@Override
	public void save(Destino destino) {
		destinoRepository.save(destino);
	}

	@Override
	public List<Destino> findAll() {
		return (List<Destino>) destinoRepository.findAll();
	}

}
