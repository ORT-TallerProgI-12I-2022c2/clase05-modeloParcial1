package sim_parcial1.examenes;

import java.util.ArrayList;

import sim_parcial1.Circuito;
import sim_parcial1.Persona;
import sim_parcial1.vehiculos.Vehiculo;

public class ExamenEspecial extends Examen {

	private Vehiculo vehiculo;
	private ArrayList<Circuito> circuitos;
	
	public ExamenEspecial(String fecha, Persona persona, Vehiculo vehiculo) {
		super(fecha, persona);
		setVehiculo(vehiculo);
		this.circuitos = new ArrayList<>();
	}

	//getters y setters
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	//metodos
	@Override
	public boolean aprobado() {
		
		int i = 0;
		double maxFaltas = getTiempoTotal() / 60;
		int faltas = 0;
		
		while (i < this.circuitos.size() && circuitos.get(i).aprobado() && faltas < maxFaltas) {
			faltas += circuitos.get(i).getNroFaltas();
			i++;
		}
		
		return i == circuitos.size();
	}

	@Override
	public double getTiempoTotal() {
		return getTiempo(this.circuitos);
	}

}
