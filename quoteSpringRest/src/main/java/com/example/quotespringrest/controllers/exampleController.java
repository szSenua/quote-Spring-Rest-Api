package com.example.quotespringrest.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Random;

@Component //le decimos que es un componente
@Path("/") //le decimos qué va a procesar. Hace referencia a localhost/

public class exampleController {

    @GET
    @Path("/message")
    @Produces("application/json") //al testear en firefox sale raro, pero en chrome sin problema
    public String message(){
        String [] quotes = new String[]{"¿Qué tramáis morenos?", "Responsability, It's for the mediocre",
                "I shall be miserable if I have not an excellent library"};
        Random r=new Random();
        int randomNumber=r.nextInt(quotes.length);

        return quotes[randomNumber];
    }

}
