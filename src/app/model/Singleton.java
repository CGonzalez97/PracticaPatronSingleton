package app.model;

public class Singleton {
	
	private static Singleton instance;
	private Persona persona;
		
	public Singleton(Persona persona) {
		super();
		this.persona = persona;
	}

	public Singleton() {
		super();
	}

	public static Singleton getInstance(Persona persona) {
        if (instance == null) {
            instance = new Singleton(persona);
        }
        return instance;
    }



	public Persona getPersona() {
		return persona;
	}



	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	

}
