package com.bosonit.formacion.block5logging;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@Slf4j
public class Block5LoggingApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(Block5LoggingApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(Block5LoggingApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {


		logger.warn("Cuidado con los Comandos para Logging");
		logger.info("Ahora seguiremos con DEBUG");
		logger.error("Este mensaje se guarda en un archivo");

		//No aparecen en la terminal por la jerarquia de Logging
		logger.debug("Vamos a depurar los mensajes");
		logger.trace("Dejando rastro de todo en el archivo indicado .LOG");



	}



}
