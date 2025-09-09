package Tarea2;

public class Test extends Sesion{
	private String[] objetivos;
	private String[] resultados;
	
	public Test(String ubicacion, int duracion, String[] objetivos, String[] resultados) {
		super(ubicacion, duracion);
		this.objetivos = objetivos;
		this.resultados = resultados;
	}

	public String[] getObjetivos() {
		return objetivos;
	}

	public void setObjetivos(String[] objetivos) {
		this.objetivos = objetivos;
	}

	public String[] getResultados() {
		return resultados;
	}

	public void setResultados(String[] resultados) {
		this.resultados = resultados;
	}
	
	
	
	
}