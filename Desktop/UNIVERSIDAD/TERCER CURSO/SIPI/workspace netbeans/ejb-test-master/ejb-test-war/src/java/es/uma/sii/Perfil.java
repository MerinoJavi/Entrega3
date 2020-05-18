package es.uma.sii;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("perfil")

@SessionScoped

public class Perfil implements Serializable{

	private int n;
	public Perfil(){
            
        }
	public int getNumero() {
		return n;
	}
	public void setNumero(int n) {
		this.n=n;
	}
	
	
}
