package Clase.ito.poo;

public class Administrativo extends Empleado {
	
	private String depto;

	public Administrativo(String nombre, String apellido, String email, long celular, String nss, int noEmplado,
			float sueldo, String puesto, String depto) {
		super(nombre, apellido, email, celular, nss, noEmplado, sueldo, puesto);
	this.depto=depto;
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	@Override
	public String toString() {
		return "Administrativo [depto=" + depto + ", Nss()=" + getNss() + ", NoEmplado()=" + getNoEmplado()
				+ ", Sueldo()=" + getSueldo() + ", Puesto()=" + getPuesto() + ", Nombre()=" + getNombre()
				+ ", Apellido()=" + getApellido() + ", Email()=" + getEmail() + ", Celular()=" + getCelular()
				+ "]";
	}
	
}
