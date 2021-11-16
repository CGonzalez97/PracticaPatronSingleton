package app.model;

public class Builder {
	
	private PersonaToBuild persona;
	
	public void build1(String nombre) {
		if(persona == null) {
			persona = new PersonaToBuild();
		}		
		persona.setNombre(nombre);
	}
	
	public void build2(String apellidos) {
		if(persona == null) {
			persona = new PersonaToBuild();
		}
		persona.setApellidos(apellidos);
	}
	
	public void build3(String dni) {
		if(persona == null) {
			persona = new PersonaToBuild();
		}
		persona.setDni(dni);
	}
	
	public PersonaToBuild build() {
		return persona;
	}

	public PersonaToBuild getPersona() {
		return persona;
	}

	public void setPersona(PersonaToBuild persona) {
		this.persona = persona;
	}
	
	
	
	

}
