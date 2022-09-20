package sim_parcial1;

public class Informe implements Evaluable {
	private static final int PORC_ESPERADO = 20;
	private double porcReprobados;
	private double promTiempoAutosAprobados;
	
	public Informe (double porcReprobados, double promTiempo) {
		
		setPorcReprobados(porcReprobados);
		setPromTiempoAutosAprobados(promTiempo);
		
	}
	
	// getters y setters
	public double getPorcReprobados() {
		return porcReprobados;
	}

	public void setPorcReprobados(double porcReprobados) {
		this.porcReprobados = porcReprobados;
	}

	public double getPromTiempoAutosAprobados() {
		return promTiempoAutosAprobados;
	}

	public void setPromTiempoAutosAprobados(double promTiempoAutosAprobados) {
		this.promTiempoAutosAprobados = promTiempoAutosAprobados;
	}

	@Override
	public boolean aprobado() {
		return porcReprobados <= PORC_ESPERADO;
	}
}
