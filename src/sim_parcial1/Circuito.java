package sim_parcial1;

public class Circuito implements Evaluable{
	
	private final static int MAX_FALTAS = 2;
	private int tiempoEnSegundos;
	private int nroFaltas;
	
	
	public Circuito(int tiempoEnSegundos, int nroFaltas) {
		setTiempoEnSegundos(tiempoEnSegundos);
		setNroFaltas(nroFaltas);
	}
	
	
	//getters y setters
	public int getTiempoEnSegundos() {
		return tiempoEnSegundos;
	}
	public void setTiempoEnSegundos(int tiempoEnSegundos) {
		this.tiempoEnSegundos = tiempoEnSegundos;
	}
	public int getNroFaltas() {
		return nroFaltas;
	}
	public void setNroFaltas(int nroFaltas) {
		this.nroFaltas = nroFaltas;
	}

	@Override
	public boolean aprobado() {
		return nroFaltas <= MAX_FALTAS;
	}

}
