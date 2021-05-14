package Clase.ito.poo;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String email;
	private long celular;

	public Persona(String nombre, String apellido, String email, long celular) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.celular = celular;
	}
	
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getCelular() {
			return celular;
		}
		public void setCelular(long celular) {
			this.celular = celular;
		}
		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", celular=" + celular
					+ "]";
		}}


		

