Nombre proyecto Maven: block6-path-variable-headers
Tiempo estimado: 8 horas.  
1º)
Programa ejemplo: https://spring.io/guides/gs/rest-service/  
Se crea la clase de saludo para iniciar el proyecto 

    package com.example.restservice;

    public class Greeting {

	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
Se crea el controlador para que maneje las solicitudes de HTTP a través de los servicios de Web RESTful que son creados en Spring Boot  


    import java.util.concurrent.atomic.AtomicLong;

    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestParam;
    import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

Hacer aplicación  como la del ejemplo. Incluyendo:
- Petición POST: mandando un objeto JSON en el body y recibiendo ese mismo objeto JSON en la respuesta (en el body).
- Petición GET: mandando parámetros en el path (http://localhost:8080/user/{id})
- Petición PUT: mandando  Request Params (http://localhost:8080/post?var1=1&var2=2)