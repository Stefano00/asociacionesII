package com.edutecno.asociacionesii.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edutecno.asociacionesii.model.Destino;
import com.edutecno.asociacionesii.model.Pasajero;
import com.edutecno.asociacionesii.service.IDestinoService;
import com.edutecno.asociacionesii.service.IPasajeroService;

@Controller
@RequestMapping("/destino")
public class DestinoController {

	@Autowired
	IDestinoService destinoService;
	
	@Autowired
	IPasajeroService pasajeroService;
	
	@GetMapping("/crear")
	public String crearDestinoGet(Model model) {
		List<Pasajero> listaPasajero = new ArrayList<Pasajero>();
		listaPasajero = pasajeroService.findAll();
		
		for(Pasajero pasajero : listaPasajero) {	
			for(Destino destino: pasajero.getDestino()) {
				System.out.println(destino.toString());
			}
				
		}
		
		model.addAttribute("listaPasajeros", pasajeroService.findAll());

		return "crear-destino";
	}
	
	@PostMapping("/crear")
	public String crearDestinoPost(@ModelAttribute Destino destino, Model model) {
		model.addAttribute("listaPasajeros", pasajeroService.findAll());
		destinoService.save(destino);
		return "crear-destino";
	}
	
	@GetMapping("/destinos")
	public String destinos(Model model) {
		model.addAttribute("listaDestinos", destinoService.findAll());
		return "destinos";
	}
}
