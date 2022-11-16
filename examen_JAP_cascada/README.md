# Examen JAP Cascada
1. He creado el proyecto utilizando Spring Boot Initializer (https://start.spring.io/) dándole nombre al proyecto y utilizando el package que indico en todos los proyectos de la formación (com.bosonit.com). He utilizado las dependencias _Lombok - Spring Web - Spring Data JPA - H2 Database_
2. He estructurado por tablas para que sea más fácil la lectura y tenga buenas prácticas de trabajo.

-Controller : donde se encuentra la carpeta DTO y la clase del controlador que utilizamos para crear los diferentes endpoints que utilizo es PostMan

-Repository : he creado el interfaz para que sea más fácil el comienzo del trabajo, he extendido la interfaz indicando la clase el ID utilizado en cada uno de ellos.

-Services : Aquí creo la interfaz del servicio de cada tabla para que tenga los métodos a utilizar y en la clase del servicio implementada he importado dichos métodos que son los que me ayuda en los diferentes controladores ha crear los endpoints necesarios para utilizar en PostMan.

3. En Application-Properties he establecido la configuración para que se pueda establecer conexión a ella y asi ver las tablas creadas.

    En este punto, he tenido que dejar establecido el nombre de usuario= sa porque si indicaba otro diferente no conseguía conexión con la DataBase. También he dejado la url para que los datos se salven en una carpeta de mi disco duro.


NOTA: Yo me he quedado por revisar el método de crear nuevo cliente y no he seguido creando más métodos de los otros controladores.(Lunes 14 Noviembre 2022)

4. Creación del primer cliente: 
 .- Se crea en controlador de cliente el método y en Postman el endpoints para después comprobar en h2 tras hacer ejecutar el QUERY ( Select * from cliente) y asi mostrarme los dos clientes que he metido en Body por postman.

5. Creación de la primera factura:
.- He creado el controlador de nueva factura y en Postman se hace la peticion de post para revisar en h2 que se ha realizado el request.

6. Creación de los Output:
.- Dentro de la caperta controller he creado otro directorio con las clases correspondiente para a futuro poder hacer la peticiones de GEt y DELETE como indica el ejercicio