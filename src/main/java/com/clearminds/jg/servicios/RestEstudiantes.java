package com.clearminds.jg.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.clearminds.jg.dtos.Estudiante;
import com.clearminds.jg.excepciones.BDDException;

@Path("/srvestudiantes")
public class RestEstudiantes {
	
	
	ServicioEstudiante p = new ServicioEstudiante();
	
	@Path("/insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante estudiante){
		try {
			p.insertarEstudiante(estudiante);
		} catch (BDDException e) {
			e.printStackTrace();
		}
	}
	
	@Path("/actualizar")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Estudiante estudiante){
		try {
			p.actualizarEstudiante(estudiante);
		} catch (BDDException e) {
			e.printStackTrace();
		}
	}
}
