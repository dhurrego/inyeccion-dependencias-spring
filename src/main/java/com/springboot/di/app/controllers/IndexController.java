package com.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.di.app.models.service.IMiServicio;

@Controller
public class IndexController {
	
	@Autowired
	@Qualifier("miServicioSimple") // Si se elimina esta linea, Spring seleccionara el servicio que tenga la anotación @Primary
	private IMiServicio servicio;

	@GetMapping({"/", "", "/index"})
	public String index(Model model) {
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}
	
	
}
