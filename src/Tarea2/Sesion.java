package Tarea2;

public abstract class Sesion{
	protected String ubicacion;
	protected int duracion;
	
	public Sesion(String ubicacion, int duracion) {
		super();
		this.ubicacion = ubicacion;
		this.duracion = duracion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
}