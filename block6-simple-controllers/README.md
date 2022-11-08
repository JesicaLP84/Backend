# Controladores
Nombre proyecto Maven: block6-simple-controllers

Tiempo estimado: 4 horas.
Crear una aplicación que tenga los siguientes endpoints.
- _/user/{nombre} (GET)_  //  Debe devolver un String  poniendo “Hola” + el contenido de la variable nombre
- _/useradd (POST)_  //  Recibe un objeto en formato JSON
  Recibe un objeto de la clase Persona, con los campos: nombre, población y edad,
  Devolver un objeto tipo persona cuya edad sea la recibida más una.
- 
  Ejemplo de cómo mandar hacer una petición POST, mandando un objeto JSON utilizando Postman.

-,

    {
      "name": "Jessica",
      "city": "Seville",
      "age": "38",
    }

    NOTA IMPORTANTE --> Cuidado al usar user en valor del endpoints
    
 