package sim_parcial1;

public enum NivelRiesgo {
	
	BAJO(0), MODERADO(2), ALTO(2);

	private int faltasMaximas;

	private NivelRiesgo(int faltasMaximas) {
		this.faltasMaximas = faltasMaximas;
	}

	public int getFaltasMaximas() {
		return faltasMaximas;
	}
	
	
}
