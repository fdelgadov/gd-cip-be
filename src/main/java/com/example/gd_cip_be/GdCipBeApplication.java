package com.example.gd_cip_be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GdCipBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GdCipBeApplication.class, args);
	}

	//probando carga de script, si quieres lo borras
	@Bean
    public CommandLineRunner run() {
        return args -> {
            System.out.println("Iniciando aplicación y ejecutando data.sql...");
        };
    }
}
