package edu.deMetodoaVista.aplicaciones.pojos;

//POJO donde creamos la clase Usuarios
public class Usuarios {

	private String nombre;
	private String apellidos;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	public Usuarios(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	public Usuarios() {
		super();
	}	
}
