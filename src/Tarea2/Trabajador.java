package Tarea2;

public abstract class Trabajador{
	protected String nombre;
	protected int edad;
	protected String cargo;
	protected String nacionalidad;
	public Trabajador(String nombre, int edad, String cargo, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.cargo = cargo;
		this.nacionalidad = nacionalidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
}