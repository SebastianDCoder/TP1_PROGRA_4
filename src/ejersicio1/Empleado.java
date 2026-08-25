package ejersicio1;

public class Empleado extends Persona {
	private int legajo;
	private String puesto;
	private final int primerLegajo = 1000;
	
	// Metodos
	@Override
	public String toString() {
		return "Empleado [legajo=" + legajo + ", puesto=" + puesto + "]";
	}

	//Getters y Setters
	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
}
