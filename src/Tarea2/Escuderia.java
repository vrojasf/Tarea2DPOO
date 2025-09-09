package Tarea2;


public class Escuderia{
	
	private String nombre;
	private String nacionalidad;
	
	private Patrocinador[] patrocinadores;
	private Piloto[] pilotos;
	private Trabajador teamPrincipal;
	private Trabajador[] ingenieros;
	public Escuderia(String nombre, String nacionalidad, Patrocinador[] patrocinadores, Piloto[] pilotos,
			Trabajador teamPrincipal, Trabajador[] ingenieros) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.patrocinadores = patrocinadores;
		this.pilotos = pilotos;
		this.teamPrincipal = teamPrincipal;
		this.ingenieros = ingenieros;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Patrocinador[] getPatrocinadores() {
		return patrocinadores;
	}
	public void setPatrocinadores(Patrocinador[] patrocinadores) {
		this.patrocinadores = patrocinadores;
	}
	public Piloto[] getPilotos() {
		return pilotos;
	}
	public void setPilotos(Piloto[] pilotos) {
		this.pilotos = pilotos;
	}
	public Trabajador getTeamPrincipal() {
		return teamPrincipal;
	}
	public void setTeamPrincipal(Trabajador teamPrincipal) {
		this.teamPrincipal = teamPrincipal;
	}
	public Trabajador[] getIngenieros() {
		return ingenieros;
	}
	public void setIngenieros(Trabajador[] ingenieros) {
		this.ingenieros = ingenieros;
	}
	
	
}