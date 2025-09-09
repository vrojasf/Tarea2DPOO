package Tarea2;


public class PilotoTitular extends Piloto{
	
	private Carrera[] carrerasDisputadas;
	private Trabajador ingenieroDeCarrera;
	public PilotoTitular(String nombre, int edad, String cargo, String nacionalidad, String[] eventosPublicitarios,
			Patrocinador[] patrocinadores, Carrera[] carrerasDisputadas, Trabajador ingenieroDeCarrera) {
		super(nombre, edad, cargo, nacionalidad, eventosPublicitarios, patrocinadores);
		this.carrerasDisputadas = carrerasDisputadas;
		this.ingenieroDeCarrera = ingenieroDeCarrera;
	}
	public Carrera[] getCarrerasDisputadas() {
		return carrerasDisputadas;
	}
	public void setCarrerasDisputadas(Carrera[] carrerasDisputadas) {
		this.carrerasDisputadas = carrerasDisputadas;
	}
	public Trabajador getIngenieroDeCarrera() {
		return ingenieroDeCarrera;
	}
	public void setIngenieroDeCarrera(Trabajador ingenieroDeCarrera) {
		this.ingenieroDeCarrera = ingenieroDeCarrera;
	}
	
	
	
	
	
}