/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufidelitas.beans;

import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;
import javax.json.JsonWriter;


/**
 *
 * @author Lab04-PC16
 */
@Named(value="JSONPModelAPIBean")
@Stateless
public class JASONPModelAPIBean {
    
    private Persona persona;
    private String salidaJSON;
    /*
    *GeneradesdeunJSON un objeto Java
    */
    public String traducirJSON(){
     
        JsonReader lectorJson = Json.createReader(new StringReader(salidaJSON));
        JsonObject objetoJson = lectorJson.readObject();
        persona.setNombre(objetoJson.getString("nombre"));
       persona.setApellidos(objetoJson.getString("apellidos"));
       persona.setGenero(objetoJson.getString("genero"));
       persona.setEdad(objetoJson.getInt("edad"));
        
        return"traducida";
    }
/**
 * *Gnera desde un objeto JAVA un JSON
 * @return 
 */
    public String generarJSON(){
        JsonObjectBuilder creadorJSON = Json.createObjectBuilder();
        JsonObject objetoJson = creadorJSON.
                add("nombre", persona.getNombre()).
                add("apellidos", persona.getApellidos()).
                add("genero", persona.getGenero()).
                add("edad", persona.getEdad()).build();
        StringWriter tira = new StringWriter();
        JsonWriter jsonWriter = Json.createWriter(tira);
        jsonWriter.writeObject(objetoJson);
        setSalidaJSON(tira.toString());
        return "traducir";
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public void setSalidaJSON(String salidaJSON) {
        this.salidaJSON = salidaJSON;
    }
}
