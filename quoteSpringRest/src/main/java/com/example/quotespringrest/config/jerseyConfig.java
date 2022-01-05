package com.example.quotespringrest.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/") //nuestra aplicación se ejecuta después del 8080 o el puerto que hayamos puesto
@Component
//esta clase hereda de resourceConfig
public class jerseyConfig extends ResourceConfig {
    //dentro de la clase crearemos un constructor

    public jerseyConfig(){
        //aquí decimos dónde estarán nuestros controladores, para eso usaremos la función "packages" en este caso
        //es el mismo nombre del primer package que parte de la carpeta
        this.packages("com.example.quotespringrest.controllers");
    }


}
