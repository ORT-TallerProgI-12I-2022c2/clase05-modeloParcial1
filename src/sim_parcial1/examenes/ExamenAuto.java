package sim_parcial1.examenes;

import sim_parcial1.Circuito;
import sim_parcial1.Persona;
import sim_parcial1.vehiculos.Auto;

public class ExamenAuto extends Examen {
	
	private final static int SEG_MAX = 90;
	private Circuito circuito;
	private Auto auto;
	
	
	public ExamenAuto(String fecha, Persona persona, Circuito circuito, Auto auto) {
		super(fecha, persona);
		setCircuito(circuito);
		setAuto(auto);
	}




	//getters y setters
	
	public Circuito getCircuito() {
		return circuito;
	}

	


	public void setCircuito(Circuito circuito) {
		this.circuito = circuito;
	}




	public Auto getAuto() {
		return auto;
	}




	public void setAuto(Auto auto) {
		this.auto = auto;
	}




	@Override
	public boolean aprobado() {
		
		return circuito.aprobado() && getTiempoTotal() <= SEG_MAX;
	}




	@Override
	public double getTiempoTotal() {		
		return this.circuito.getTiempoEnSegundos();
	}




	

}
