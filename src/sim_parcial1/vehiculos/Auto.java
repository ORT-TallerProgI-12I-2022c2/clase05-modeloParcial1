package sim_parcial1.vehiculos;

public class Auto extends Vehiculo {

	private int cantPuertas;
	
	public Auto(int cilindrada, String patente, String marca, int cantPuertas) {
		super(cilindrada, patente, marca);
		setCantPuertas(cantPuertas);
	}

	//getters y setters
	public int getCantPuertas() {
		return cantPuertas;
	}

	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}

}
