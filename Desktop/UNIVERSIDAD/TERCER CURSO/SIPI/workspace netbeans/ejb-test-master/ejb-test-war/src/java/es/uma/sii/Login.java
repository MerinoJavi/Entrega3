package es.uma.sii;

import java.util.ArrayList;




import java.util.List;

//import javax.annotation.ManagedBean;
//import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import es.uma.sii.ControlAutorizacion;
import es.uma.sii.ejb.BaseDeDatosLocal;
import es.uma.sii.entidades.Alumno;
import es.uma.sii.entidades.Inscripcion_Actividad;
import es.uma.sii.entidades.ONG;
import es.uma.sii.entidades.Usuario;

import es.uma.sii.entidades.Usuario.Preferencias;
import es.uma.sii.entidades.Usuario.Rol;
import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;

@Named("login")
@RequestScoped
public class Login {
    private Login l;
	private String usuario;
    private String contrasenia;
    private String antiguacontrasenia;
    private String nuevacontrasenia;
    private String repetircontrasenia;
    private String nuevoemail;
    private List<Usuario> usuarios;
    private List<ONG>ONGs;
    private String nuevo_DNI;
	private String nuevo_Nombre;
	private String nuevo_Usuario_Acceso;
	private String nuevo_Apellidos;
	private String nuevo_Email;
	private String nuevo_Actividad_Preferente;
	private String nuevo_Contraseña;
	private String nuevo_Tipo_usuario;
	private String nuevo_repetirContraseña;
	private List<Inscripcion_Actividad>nuevo_inscripcion_actividad;
    
    @Inject
    private ControlAutorizacion ctrl;
    private BActividad actv;
    

    @Inject
    private BaseDeDatosLocal bd;
    /**
     * Creates a new instance of Login
     */
   
    
    public Login() {
        /*usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario("javi", "123", "ALUMNO","745151445","Javier","Merino","javiermerino@hotmail.com",Preferencias.VOLUNTARIADO));
        usuarios.add(new Usuario("Luis", "SII", "PDI","454156454","Luis","Sanchez","luisan@gmail.com",Preferencias.INVESTIGACION));
        usuarios.add(new Usuario("Jose Maria", "nomegustanada", "ADMINISTRADOR","5465456","José María","Luque","chema@hotmail.com",Preferencias.NINGUNA));
        usuarios.add(new Usuario("Antonio", "antonio123", "ADMINISTRADOR","2154545","Antonio","Priego","antonio@uma.es",Preferencias.NINGUNA));
        usuarios.add(new Usuario("Pepita", "megustalospapeles", "PAS","1456455","Josefa","Garcia","pepi@uma.com",Preferencias.VOLUNTARIADO));*/
        
        ONGs=new ArrayList<ONG>();
        ONGs.add(new ONG("ADOPTAUNNIÑO","123",443756437,"Adopta un niño",957651458,"Conchi Cordoba Martinez","adoptaunniño@ong.com","Aceptada"));
        ONGs.add(new ONG("CARITAS","1234",658758343,"Caritas company US",956254632,"Ernesto Sevilla Sanchez","caritas@ong.com","Pendiente de validacion"));

    }
    
 
    
    public void cambiarContraseña() {
     	FacesContext ctx = FacesContext.getCurrentInstance();
        
        if(ctrl.hayONG()){
            if(antiguacontrasenia!=null && nuevacontrasenia!=null && repetircontrasenia!=null) {
    		if(ctrl.getONG().getContraseña().equals(antiguacontrasenia)) {
    			if(repetircontrasenia.equals(nuevacontrasenia)) {
    				contrasenia=nuevacontrasenia;
                                
                                    ONG o=ctrl.getONG();
                                    o.setContraseña(contrasenia);
                                    bd.modificarONG(o);
                                
                                
    			}else {
    	            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error, las contraseñas no coinciden", "Introduce de nuevo la nueva contraseña"));

    			}
    		}else {
                ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error, contraseña no es correcta", "Introduce de nuevo la antigua contraseña"));

    		}
    	}else {
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error, campo no puede ser nulo", "Revisa los campos"));

    	}
    
        }else{
            if(antiguacontrasenia!=null && nuevacontrasenia!=null && repetircontrasenia!=null) {
    		if(ctrl.getUsuario().getContraseña().equals(antiguacontrasenia)) {
    			if(repetircontrasenia.equals(nuevacontrasenia)) {
    				contrasenia=nuevacontrasenia;
                                
                                    Usuario u=ctrl.getUsuario();
                                    u.setContraseña(contrasenia);
                                    bd.modificarUsuario(u);
                                
                                
    			}else {
    	            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error, las contraseñas no coinciden", "Introduce de nuevo la nueva contraseña"));

    			}
    		}else {
                ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error, contraseña no es correcta", "Introduce de nuevo la antigua contraseña"));

    		}
    	}else {
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error, campo no puede ser nulo", "Revisa los campos"));

    	}
    }
        }
        
    	
    
    public void cambiarEmail() {
     	FacesContext ctx = FacesContext.getCurrentInstance();
     	if(nuevoemail!=null) {
            if(ctrl.hayONG()){
                ONG o=ctrl.getONG();
                o.setEmail(nuevoemail);
                bd.modificarONG(o);
            }
            else{
                Usuario u = ctrl.getUsuario();
                u.setEmail(nuevoemail);
                bd.modificarUsuario(u);
            }
            
     		
     	}else {
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error, email no puede ser nulo","Introduce email"));

     	}

    }
    public String getNuevoemail() {
		return nuevoemail;
	}

	public void setNuevoemail(String nuevoemail) {
		this.nuevoemail = nuevoemail;
	}

	public String getAntiguacontrasenia() {
		return antiguacontrasenia;
	}
	

	

	public void setAntiguacontrasenia(String antiguacontrasenia) {
		this.antiguacontrasenia = antiguacontrasenia;
	}


	public String getNuevacontrasenia() {
		return nuevacontrasenia;
	}


	public void setNuevacontrasenia(String nuevacontrasenia) {
		this.nuevacontrasenia = nuevacontrasenia;
	}


	public String getRepetircontrasenia() {
		return repetircontrasenia;
	}


	public void setRepetircontrasenia(String repetircontrasenia) {
		this.repetircontrasenia = repetircontrasenia;
	}


	public List<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}


	public List<ONG> getONGs() {
		return ONGs;
	}


	public void setONGs(List<ONG> oNGs) {
		ONGs = oNGs;
	}


	public ControlAutorizacion getCtrl() {
		return ctrl;
	}


	public void setCtrl(ControlAutorizacion ctrl) {
		this.ctrl = ctrl;
	}


	public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
        
    }
    
    public void setUsuarioActividad() {
    	actv.setUsername(usuario);
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String autenticar() {
        // Implementar este método
        List<Usuario>usuariosbd=bd.getUsuarios();
        List<ONG>ONGbd=bd.getONG();
    	FacesContext ctx = FacesContext.getCurrentInstance();
    	String nombreuser=null;
    	boolean esUsuario=false;
    	for(Usuario u:usuariosbd) {
    		if(usuario.equalsIgnoreCase(u.getUsuario_Acceso())) {
    			nombreuser=u.getUsuario_Acceso();
    			ctrl.setUsuario(u);
    			esUsuario=true;
    		}
    	}
    	for(ONG o:ONGbd) {
    		if(usuario.equalsIgnoreCase(o.getUsuario_Acceso())) {
    			nombreuser=o.getUsuario_Acceso();
    			ctrl.setONG(o);
    		}
    	}
    	
    	if(nombreuser==null) {
    		ctrl.setUsuario(null);
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario no encontrado", "Introduce otro usuario o ponte en contacto con el administrador de la base de datos"));
    	}else {
    		if(esUsuario && !contrasenia.equalsIgnoreCase(ctrl.getUsuario().getContraseña()) ) {
                ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Contraseña erronea", "Introduce de nuevo la contraseña"));
                ctrl.setUsuario(null);
    		}
    		else if(!esUsuario && !contrasenia.equalsIgnoreCase(ctrl.getONG().getContraseña())){
    			ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Contraseña erronea", "Introduce de nuevo la contraseña"));
                ctrl.setONG(null);
    		}
    	}
    	
    	
        return ctrl.home();
    }
    
    public String getNuevo_DNI() {
		return nuevo_DNI;
	}



	public void setNuevo_DNI(String nuevo_DNI) {
		this.nuevo_DNI = nuevo_DNI;
	}



	public String getNuevo_Nombre() {
		return nuevo_Nombre;
	}



	public void setNuevo_Nombre(String nuevo_Nombre) {
		this.nuevo_Nombre = nuevo_Nombre;
	}



	public String getNuevo_Usuario_Acceso() {
		return nuevo_Usuario_Acceso;
	}



	public void setNuevo_Usuario_Acceso(String nuevo_Usuario_Acceso) {
		this.nuevo_Usuario_Acceso = nuevo_Usuario_Acceso;
	}



	public String getNuevo_Apellidos() {
		return nuevo_Apellidos;
	}



	public void setNuevo_Apellidos(String nuevo_Apellidos) {
		this.nuevo_Apellidos = nuevo_Apellidos;
	}



	public String getNuevo_Email() {
		return nuevo_Email;
	}



	public void setNuevo_Email(String nuevo_Email) {
		this.nuevo_Email = nuevo_Email;
	}



	public String getNuevo_Actividad_Preferente() {
		return nuevo_Actividad_Preferente;
	}



	public void setNuevo_Actividad_Preferente(String nuevo_Actividad_Preferente) {
		this.nuevo_Actividad_Preferente = nuevo_Actividad_Preferente;
	}
        public String cambiar_Actividad_Preferente(){
          String a="perfil.xhtml"; 
          Usuario u=ctrl.getUsuario();
          u.setActividad_Preferente(this.nuevo_Actividad_Preferente);
          //Alumno al=new Alumno(u);
            bd.modificarUsuario(u);
            return a;

        }


	public String getNuevo_Contraseña() {
		return nuevo_Contraseña;
	}



	public void setNuevo_Contraseña(String nuevo_Contraseña) {
		this.nuevo_Contraseña = nuevo_Contraseña;
	}



	public String getNuevo_Tipo_usuario() {
		return nuevo_Tipo_usuario;
	}



	public void setNuevo_Tipo_usuario(String nuevo_Tipo_usuario) {
		this.nuevo_Tipo_usuario = nuevo_Tipo_usuario;
	}



	public String getNuevo_repetirContraseña() {
		return nuevo_repetirContraseña;
	}



	public void setNuevo_repetirContraseña(String nuevo_repetirContraseña) {
		this.nuevo_repetirContraseña = nuevo_repetirContraseña;
	}



	public List<Inscripcion_Actividad> getNuevo_inscripcion_actividad() {
		return nuevo_inscripcion_actividad;
	}



	public void setNuevo_inscripcion_actividad(List<Inscripcion_Actividad> nuevo_inscripcion_actividad) {
		this.nuevo_inscripcion_actividad = nuevo_inscripcion_actividad;
	}



	public BActividad getActv() {
		return actv;
	}



	public void setActv(BActividad actv) {
		this.actv = actv;
	}



	public String procesarDatos() {
            String a;
             FacesContext ctx = FacesContext.getCurrentInstance();
            if(this.nuevo_Contraseña.equals(this.nuevo_repetirContraseña)){
                Usuario user=new Usuario(this.nuevo_Usuario_Acceso,this.nuevo_Contraseña,nuevo_Tipo_usuario,this.nuevo_DNI,this.nuevo_Nombre,this.nuevo_Apellidos,this.nuevo_Email,this.nuevo_Actividad_Preferente);
                  bd.setUsuario(user);
                  ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro completado satisfactoriamente",""));
                  a="paginaprincipal.xhtml";
            }else{
                ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Las contraseñas no coinciden", "Introduce de nuevo la contraseña"));
                 a="registrarse.xhtml";
            }
           return a;
        }
}
