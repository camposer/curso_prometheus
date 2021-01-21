package com.example.micrometerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;

@SpringBootApplication
@RestController
public class MicrometerDemoApplication {
	@Autowired
	private SaludoRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(MicrometerDemoApplication.class, args);
	}

	@GetMapping("/hola")
	public String hello() {
		Iterator<Saludo> iterable = repo.findAll().iterator();
		if (!iterable.hasNext())
			return "No hay datos en BD";

		return iterable.next().getMensaje(); // primer registro
	}
}
