package com.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.springboot.di.app.models.domain.ItemFactura;
import com.springboot.di.app.models.domain.Producto;
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
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Camara Sony", 100);
		Producto producto2 = new Producto("Bicicleta", 200);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 2);
		
		return Arrays.asList(linea1, linea2);
	}
	
}
