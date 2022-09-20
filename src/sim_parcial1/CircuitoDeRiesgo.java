package sim_parcial1;

public class CircuitoDeRiesgo extends Circuito {

	private NivelRiesgo nivelDeRiesgo;
	
	public CircuitoDeRiesgo(int tiempoEnSegundos, int nroFaltas, NivelRiesgo nivelDeRiesgo) {
		super(tiempoEnSegundos, nroFaltas);
		setNivelDeRiesgo(nivelDeRiesgo);
	}

	//getters y setters
	public NivelRiesgo getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	public void setNivelDeRiesgo(NivelRiesgo nivelDeRiesgo) {
		this.nivelDeRiesgo = nivelDeRiesgo;
	}
	
	@Override
	public boolean aprobado() {
		
		return getNroFaltas() <= nivelDeRiesgo.getFaltasMaximas();
	}
}
