package sim_parcial1.vehiculos;

public abstract class Vehiculo {

	private int cilindrada;
	private String patente;
	private String marca;
	
	public Vehiculo(int cilindrada, String patente, String marca) {
		setCilindrada(cilindrada);
		setPatente(patente);
		setMarca(marca);
	}

	//getters y setters
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
