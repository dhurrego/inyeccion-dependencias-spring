package com.springboot.di.app.models.service;

import org.springframework.stereotype.Service;

@Service("miServicioSimple")
public class MiServicio implements IMiServicio{

	@Override
	public String operacion() {
		return "Ejecutando una operación";
	}

}
