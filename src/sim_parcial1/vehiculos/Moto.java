package sim_parcial1.vehiculos;

public class Moto extends Vehiculo {

	private boolean tieneEspejos;

	public Moto(int cilindrada, String patente, String marca, boolean tieneEspejos) {
		super(cilindrada, patente, marca);
		setTieneEspejos(tieneEspejos);
	}
	
	//getters y setters
	public boolean isTieneEspejos() {
		return tieneEspejos;
	}

	public void setTieneEspejos(boolean tieneEspejos) {
		this.tieneEspejos = tieneEspejos;
	}

}
