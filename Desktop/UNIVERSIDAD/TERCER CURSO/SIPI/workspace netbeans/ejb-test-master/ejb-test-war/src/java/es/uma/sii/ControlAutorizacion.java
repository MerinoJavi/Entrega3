/*
 * To change this template, choose Tools | Templates

 * and open the template in the editor.
 */
package es.uma.sii;

import es.uma.sii.entidades.ONG;

import es.uma.sii.entidades.Usuario;

import static es.uma.sii.entidades.Usuario.Rol.ADMINISTRADOR;
import static es.uma.sii.entidades.Usuario.Rol.ALUMNO;
import static es.uma.sii.entidades.Usuario.Rol.PDI;
import static es.uma.sii.entidades.Usuario.Rol.PAS;
import javax.inject.Named;
//import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;

import javax.faces.context.FacesContext;

/**
 *
 * @author francis
 */
@Named("controlAutorizacion")

@SessionScoped
public class ControlAutorizacion implements Serializable {

    private Usuario usuario;
    private ONG ong=null;

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void setONG(ONG ONG	) {
    	this.ong=ONG;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String home() {
    	String pagina=null;
        // Implementar el método
        // Devuelve la página Home dependiendo del rol del usuario
        // Si no hay usuario debe devolver la página de login
        // Si el usuario es el administrador debe devolver la página admin.xhtml
        // Si el usuario es un usuario normal debe devolver la página normal.xhtml
    	if(usuario!=null) {
    		if(usuario.getTipo_usuario().equalsIgnoreCase("ADMINISTRADOR")) {
        		pagina="administrador.xhtml";
        	}else if(usuario.getTipo_usuario().equalsIgnoreCase("ALUMNO")) {
        		pagina="alumno.xhtml";
        	}else if(usuario.getTipo_usuario().equalsIgnoreCase("PDI")) {
        		pagina="pdi.xhtml";
        	}else if(usuario.getTipo_usuario().equalsIgnoreCase("PAS")) {
        		pagina="pas.xhtml";
        	}
    	}
    	else if(ong!=null) {
    		pagina="ONG.xhtml";
    	}
    	else {
    		pagina="paginaprincipal.xhtml";
    	}
        
        return pagina;
    }
    
    public boolean hayONG() {
    	if(ong!=null) {
    		return true;
    	}else {
    		return false;
    	}
    }    
    
    public ONG getONG() {
		return ong;
	}
	
	public String logout()
    {
        // Destruye la sesión (y con ello, el ámbito de este bean)
        FacesContext ctx = FacesContext.getCurrentInstance();
        ctx.getExternalContext().invalidateSession();
        usuario = null;
        ong=null;
        return "paginaprincipal.xhtml";
    }

    /**
     * Creates a new instance of ControlAutorizacion
     */
    public ControlAutorizacion() {
    }
}
