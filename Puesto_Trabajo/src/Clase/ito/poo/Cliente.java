package Clase.ito.poo;

public class Cliente extends Persona {
	
	private int noCliente;
	private float creditoDisponible;
	
	public Cliente(String nombre, String apellido, String email, long celular, int noCliente, float creditoDisponible) {
		super(nombre, apellido, email, celular);
		this.noCliente = noCliente;
		this.creditoDisponible = creditoDisponible;
	}
	
	public int getNoCliente() {
		return noCliente;
	}

	public void setNoCliente(int noCliente) {
		this.noCliente = noCliente;
	}

	public float getCreditoDisponible() {
		return creditoDisponible;
	}

	public void setCreditoDisponible(float creditoDisponible) {
		this.creditoDisponible = creditoDisponible;
	}
	@Override
	public String toString() {
		return "Cliente [noCliente=" + noCliente + ", creditoDisponible=" + creditoDisponible + ", Nombre()="
				+ getNombre() + ", Apellido()=" + getApellido() + ", Email()=" + getEmail() + ", Celular()="
				+ getCelular() + "]";
	}

	
	
	
}
