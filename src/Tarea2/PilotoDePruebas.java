package Tarea2;


public class PilotoDePruebas extends Piloto{
	
	private Test[] tests;

	public PilotoDePruebas(String nombre, int edad, String cargo, String nacionalidad, String[] eventosPublicitarios,
			Patrocinador[] patrocinadores, Test[] tests) {
		super(nombre, edad, cargo, nacionalidad, eventosPublicitarios, patrocinadores);
		this.tests = tests;
	}

	public Test[] getTests() {
		return tests;
	}

	public void setTests(Test[] tests) {
		this.tests = tests;
	}

	

	
	
}