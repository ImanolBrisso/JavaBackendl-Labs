package com.ejemplo.tienda; // Se ejecuta el código desde este módulo

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Engloba todos los elementos de @ sin necesidad de poner todos uno por uno
public class TiendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaApplication.class, args);
	}

}
