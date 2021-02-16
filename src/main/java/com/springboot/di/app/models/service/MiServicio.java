package com.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("miServicioSimple")
public class MiServicio implements IMiServicio{

	@Override
	public String operacion() {
		return "Ejecutando una operación de servicio simple";
	}

}
