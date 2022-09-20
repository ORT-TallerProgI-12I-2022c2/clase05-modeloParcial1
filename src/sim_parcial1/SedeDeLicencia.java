package sim_parcial1;

import java.util.ArrayList;

import sim_parcial1.examenes.Examen;
import sim_parcial1.examenes.ExamenAuto;

public class SedeDeLicencia {
	private ArrayList<Examen> examenes; 
	
	public SedeDeLicencia () {
		examenes = new ArrayList<>();
	}
	
	public Informe obtenerInforme() {
		return new Informe (porcentajeDeReprobados(), promTiempoAutosAprobados());
	}
	
	private double porcentajeDeReprobados() {
		int cant = 0;		
		for(Examen e: examenes) {
			if(!e.aprobado()) 
				cant++;
		}		
		return !examenes.isEmpty() ? ( (double) cant / examenes.size() ) * 100 : 0;
	}
	
	private double promTiempoAutosAprobados() {
		
		int cant = 0;
		double tiempoAutos = 0;
		
		for(Examen e: examenes) {
			if(e instanceof ExamenAuto && e.aprobado()) {
				cant++;
				tiempoAutos += e.getTiempoTotal();
			}
		}
		
		return (cant > 0) ? tiempoAutos / cant : 0;
	}
	
}
