package Tarea2;


public abstract class Piloto extends Trabajador{
	protected String[] eventosPublicitarios;
	private Patrocinador[] patrocinadores;
	
	public Piloto(String nombre, int edad, String cargo, String nacionalidad, String[] eventosPublicitarios,
			Patrocinador[] patrocinadores) {
		super(nombre, edad, cargo, nacionalidad);
		this.eventosPublicitarios = eventosPublicitarios;
		this.patrocinadores = patrocinadores;
	}
	public String[] getEventosPublicitarios() {
		return eventosPublicitarios;
	}
	public void setEventosPublicitarios(String[] eventosPublicitarios) {
		this.eventosPublicitarios = eventosPublicitarios;
	}
	public Patrocinador[] getPatrocinadores() {
		return patrocinadores;
	}
	public void setPatrocinadores(Patrocinador[] patrocinadores) {
		this.patrocinadores = patrocinadores;
	}
	
	
	
	
}