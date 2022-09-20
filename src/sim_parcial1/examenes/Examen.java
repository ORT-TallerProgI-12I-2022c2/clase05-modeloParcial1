package sim_parcial1.examenes;

import java.util.ArrayList;

import sim_parcial1.Circuito;
import sim_parcial1.Evaluable;
import sim_parcial1.Persona;

public abstract class Examen implements Evaluable {
	
	protected static double getTiempo(ArrayList<Circuito> lista) {
		
		int tiempoTotal = 0;	
		for(Circuito c : lista) {
			tiempoTotal += c.getTiempoEnSegundos();
		}
		return tiempoTotal;
	}

	
	private String fecha;
	private Persona persona;
	
	public Examen(String fecha, Persona persona) {
		setFecha(fecha);
		setPersona(persona);
	}

	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	//metodos
	
	public abstract double getTiempoTotal();
	

}
