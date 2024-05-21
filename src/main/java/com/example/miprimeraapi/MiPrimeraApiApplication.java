package com.example.miprimeraapi;

import com.example.miprimeraapi.entities.Empleado;
import com.example.miprimeraapi.entities.Imagen;
import com.example.miprimeraapi.entities.Usuario;
import com.example.miprimeraapi.repositories.ImagenRepository;
import com.example.miprimeraapi.repositories.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MiPrimeraApiApplication {

	@Autowired
	private ImagenRepository imagenRepository;

	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(MiPrimeraApiApplication.class, args);
		System.out.println("Servidor iniciado.");
	}

	@Bean
	@Transactional
	CommandLineRunner init(ImagenRepository imagenRepository, UsuarioRepository usuarioRepository){
		return args -> {
			Imagen img1 = Imagen.builder().denominacion("Imangen 1").build();
			imagenRepository.save(img1);
			Imagen img2 = Imagen.builder().denominacion("Imangen 2").build();
			imagenRepository.save(img2);

			Usuario us1 = Usuario.builder().auth0Id("pass").userName("user1").build();
			usuarioRepository.save(us1);
		};
	}

}