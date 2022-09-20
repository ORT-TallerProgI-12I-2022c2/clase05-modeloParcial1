package sim_parcial1;

public class Persona {
	
	private String dni;
	private String nombre;
	private String mail;
	
	
	
	public Persona(String dni, String nombre, String mail) {
		setDni(dni);
		setNombre (nombre);
		setMail(mail);
	}
	
	//getters y setters
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
