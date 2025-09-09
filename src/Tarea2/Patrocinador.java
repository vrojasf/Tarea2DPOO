package Tarea2;

public class Patrocinador{
	private String nombre;
	private double valorContrato;
	private int duracionContrato;
	public Patrocinador(String nombre, double valorContrato, int duracionContrato) {
		super();
		this.nombre = nombre;
		this.valorContrato = valorContrato;
		this.duracionContrato = duracionContrato;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getValorContrato() {
		return valorContrato;
	}
	public void setValorContrato(double valorContrato) {
		this.valorContrato = valorContrato;
	}
	public int getDuracionContrato() {
		return duracionContrato;
	}
	public void setDuracionContrato(int duracionContrato) {
		this.duracionContrato = duracionContrato;
	}
	
	
}	
