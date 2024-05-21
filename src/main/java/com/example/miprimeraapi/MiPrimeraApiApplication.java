package com.example.miprimeraapi;

import com.example.miprimeraapi.entities.Empleado;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiPrimeraApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiPrimeraApiApplication.class, args);
		System.out.println("Servidor iniciado.");
	}

}
