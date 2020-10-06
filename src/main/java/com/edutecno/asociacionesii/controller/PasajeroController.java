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

import com.edutecno.asociacionesii.model.Pasajero;
import com.edutecno.asociacionesii.service.IPasajeroService;

@Controller
@RequestMapping("/pasajero")
public class PasajeroController {

	@Autowired
	IPasajeroService pasajeroService;
	
	@GetMapping("/pasajeros")
	public String crearPasajeroGet(Model model) {
		model.addAttribute("listaPasajeros", pasajeroService.findAll());
	/*	List<Pasajero> listaPasajero = new ArrayList<Pasajero>();
		listaPasajero = pasajeroService.findAll();
		for(Pasajero lista: listaPasajero) {
			System.out.println(lista.getDestino().get(0).getCiudad());
		}	
		*/
		return "pasajeros";
	}
	
	@PostMapping("/crear")
	public String crearPasajeroPost(@ModelAttribute Pasajero pasajero) {
		pasajeroService.save(pasajero);
		return "crear-pasajero";
	}
	
	@GetMapping("/crear")
	public String pasajeros() {
		return "crear-pasajero";
	}
	
}
