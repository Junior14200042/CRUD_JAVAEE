package ModelPersona;

public class ModelPersona {
	private int idPersona;
	private String nombre;
	private String correo;
	
	public ModelPersona(){
		
	}
	public ModelPersona(int idPersona,String nombre, String correo) {
		this.idPersona=idPersona;
		this.nombre=nombre;
		this.correo=correo;
	}
	public int getidPersona() {
		return idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setidPersona(int idPersona) {
		this.idPersona=idPersona;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setCorreo(String correo) {
		this.correo=correo;
	}
	
	@Override
	public String toString() {
		return "Nombre: "+nombre+", correo: "+correo;
	}
}
