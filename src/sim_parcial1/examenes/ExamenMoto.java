package sim_parcial1.examenes;

import java.util.ArrayList;

import sim_parcial1.Circuito;
import sim_parcial1.Persona;
import sim_parcial1.vehiculos.Moto;

public class ExamenMoto extends Examen {

	private final static int TOPE_CILINDRADA = 150;
	private final static int TOPE_SEGUNDOS = 120;
	private final static int CANT_MAX_DESAPROBADOS = 1;
	private ArrayList<Circuito> circuitos;
	private Moto moto;
	
	public ExamenMoto(String fecha, Persona persona, Moto moto) {
		super(fecha, persona);
		this.circuitos = new ArrayList<>();
		setMoto(moto);
	}

	//getters y setters
	public void setCircuitos(ArrayList<Circuito> circuitos) {
		this.circuitos = circuitos;
	}

	public Moto getMoto() {
		return moto;
	}

	public void setMoto(Moto moto) {
		this.moto = moto;
	}

	//metodos
	@Override
	public boolean aprobado() {
		return (moto.getCilindrada() > TOPE_CILINDRADA) ? cantCircuitosAprobados() == this.circuitos.size() : apruebaMotorMenorCC() ;
	}

	private boolean apruebaMotorMenorCC() {
		
		return cantCircuitosAprobados() >= this.circuitos.size() - CANT_MAX_DESAPROBADOS && cumpleTiempoTotal();
	}

	private int cantCircuitosAprobados() {
		
		int i = 0;
		
		for(Circuito c : circuitos) {
			if(c.aprobado())
			i++;
		}
		
		return i;
	}
	
	private boolean cumpleTiempoTotal() {
		
		return getTiempoTotal() <= TOPE_SEGUNDOS;
	}

	@Override
	public double getTiempoTotal() {
		return getTiempo(this.circuitos);
	}

}
