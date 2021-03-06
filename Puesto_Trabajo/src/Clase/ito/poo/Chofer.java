package Clase.ito.poo;
import java.util.HashSet;
public class Chofer extends Empleado{

	private  HashSet<String>rutas;
	private int noAutobus;
	
	public Chofer(String nombre, String apellido, String email, long celular, String nss, int noEmplado, float sueldo,
			String puesto, HashSet<String> rutas, int noAutobus) {
		super(nombre, apellido, email, celular, nss, noEmplado, sueldo, puesto);
		this.rutas=rutas;
		this.noAutobus=noAutobus;
	}

	public HashSet<String> getRutas() {
		return rutas;
	}

	public void setRutas(HashSet<String> rutas) {
		this.rutas = rutas;
	}

	public int getNoAutobus() {
		return noAutobus;
	}

	public void setNoAutobus(int noAutobus) {
		this.noAutobus = noAutobus;
	}

	@Override
	public String toString() {
		return "Chofer [rutas=" + rutas + ", noAutobus=" + noAutobus + ", Nss()=" + getNss() + ", NoEmplado()="
				+ getNoEmplado() + ", Sueldo()=" + getSueldo() + ", Puesto()=" + getPuesto() + ", Nombre()="
				+ getNombre() + ", Apellido()=" + getApellido() + ", Email()=" + getEmail() + ", Celular()="
				+ getCelular() + "]";
	}
	
}
