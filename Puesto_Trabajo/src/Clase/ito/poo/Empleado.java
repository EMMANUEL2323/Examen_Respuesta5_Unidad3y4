package Clase.ito.poo;

public class Empleado extends Persona {


	private String nss;
	private int noEmplado;
	private float sueldo;
	private String puesto;
	
	public Empleado(String nombre, String apellido, String email, long celular, String nss, int noEmplado, float sueldo, String puesto) {
		super(nombre, apellido, email, celular);
		this.nss = nss;
		this.noEmplado = noEmplado;
		this.sueldo = sueldo;
		this.puesto = puesto;
		
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public int getNoEmplado() {
		return noEmplado;
	}

	public void setNoEmplado(int noEmplado) {
		this.noEmplado = noEmplado;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Empleado [nss=" + nss + ", noEmplado=" + noEmplado + ", sueldo=" + sueldo + ", puesto=" + puesto
				+ ", Nombre()=" + getNombre() + ", Email()=" + getEmail() + ", Celular()=" + getCelular()
				+ "]";
	}
	
	
}
