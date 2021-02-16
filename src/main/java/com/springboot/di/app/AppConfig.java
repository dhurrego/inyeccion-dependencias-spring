package com.springboot.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.springboot.di.app.models.service.IMiServicio;
import com.springboot.di.app.models.service.MiServicio;
import com.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {
	
	@Primary
	@Bean("miServicioSimple")
	public IMiServicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	public IMiServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
}
