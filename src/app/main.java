package app;

import app.model.Persona;
import app.model.Singleton;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton singleton = Singleton.getInstance(new Persona("Carlos","12341234A"));
		Persona persona1 = singleton.getPersona();
		singleton = Singleton.getInstance(new Persona("PEpe","23452345A"));
		Persona persona2 = singleton.getPersona();
		
		System.out.println(persona1+" "+persona1.getNombre()+" "+persona1.getDni());
		System.out.println(persona2+" "+persona2.getNombre()+" "+persona2.getDni());
	}

}
