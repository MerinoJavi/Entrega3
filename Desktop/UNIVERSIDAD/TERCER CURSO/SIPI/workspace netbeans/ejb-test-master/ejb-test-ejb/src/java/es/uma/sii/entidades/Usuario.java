package es.uma.sii.entidades;

import java.io.Serializable;

import java.lang.String;
import java.util.List;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity

public class Usuario implements Serializable {

	 public enum Rol {
	      ADMINISTRADOR,
	      ALUMNO,
	      PAS,
	      PDI
	    };
	    
	  public enum Preferencias{
		  VOLUNTARIADO,
		  APRENDIZAJE_SERVICIO,
		  INVESTIGACION,
		  NINGUNA
	  };
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Actividad_Preferente == null) ? 0 : Actividad_Preferente.hashCode());
		result = prime * result + ((Apellidos == null) ? 0 : Apellidos.hashCode());
		result = prime * result + ((Contraseña == null) ? 0 : Contraseña.hashCode());
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		result = prime * result + ((Tipo_usuario == null) ? 0 : Tipo_usuario.hashCode());
		result = prime * result + ((Usuario_Acceso == null) ? 0 : Usuario_Acceso.hashCode());
		result = prime * result + ((inscripcion_actividad == null) ? 0 : inscripcion_actividad.hashCode());
		result = prime * result + ((repetirContraseña == null) ? 0 : repetirContraseña.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (Actividad_Preferente != other.Actividad_Preferente)
			return false;
		if (Apellidos == null) {
			if (other.Apellidos != null)
				return false;
		} else if (!Apellidos.equals(other.Apellidos))
			return false;
		if (Contraseña == null) {
			if (other.Contraseña != null)
				return false;
		} else if (!Contraseña.equals(other.Contraseña))
			return false;
		if (DNI == null) {
			if (other.DNI != null)
				return false;
		} else if (!DNI.equals(other.DNI))
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		if (Tipo_usuario == null) {
			if (other.Tipo_usuario != null)
				return false;
		} else if (!Tipo_usuario.equals(other.Tipo_usuario))
			return false;
		if (Usuario_Acceso == null) {
			if (other.Usuario_Acceso != null)
				return false;
		} else if (!Usuario_Acceso.equals(other.Usuario_Acceso))
			return false;
		if (inscripcion_actividad == null) {
			if (other.inscripcion_actividad != null)
				return false;
		} else if (!inscripcion_actividad.equals(other.inscripcion_actividad))
			return false;
		if (repetirContraseña == null) {
			if (other.repetirContraseña != null)
				return false;
		} else if (!repetirContraseña.equals(other.repetirContraseña))
			return false;
		return true;
	}
	@Id
	private String DNI;
	private String Nombre;
	private String Usuario_Acceso;
	private String Apellidos;
	private String Email;
	//@Enumerated(EnumType.STRING)
	//private Rol Tipo_Usuario;
	private String Contraseña;
	private String Tipo_usuario;
	private String repetirContraseña;
	private String Actividad_Preferente;
	@OneToMany(mappedBy="usuario")
	private List<Inscripcion_Actividad>inscripcion_actividad;
	private static final long serialVersionUID = 1L;

	public Usuario()
    {
        
    }
	public Usuario(String Usuario_Acceso,String Contraseña,String rol,String DNI, String Nombre, String Apellidos, String Email, String Actividad_Preferente) {
		setUsuario_Acceso(Usuario_Acceso);
		setContraseña(Contraseña);
                setTipo_usuario(rol);
		setDNI(DNI);
		setNombre(Nombre);
		setApellidos(Apellidos);
		setEmail(Email);
		setActividad_Preferente(Actividad_Preferente);
	}   
	public String getDNI() {
		return this.DNI;
	}

	public void setDNI(String DNI) {
		this.DNI = DNI;
	}   
	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}   
	public String getApellidos() {
		return this.Apellidos;
	}

	public void setApellidos(String Apellidos) {
		this.Apellidos = Apellidos;
	}   
	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}   
	/*public Rol getTipo_Usuario() {
		return this.Tipo_Usuario;
	}

	public void setTipo_Usuario(Rol Tipo_Usuario) {
		this.Tipo_Usuario = Tipo_Usuario;
	}   */
	public String getContraseña() {
		return this.Contraseña;
	}

	public void setContraseña(String Contraseña) {
		this.Contraseña = Contraseña;
	}
	public List<Inscripcion_Actividad> getInscripcion_actividad() {
		return inscripcion_actividad;
	}
	public void setInscripcion_actividad(List<Inscripcion_Actividad> inscripcion_actividad) {
		this.inscripcion_actividad = inscripcion_actividad;
	}
	public String getActividad_Preferente() {
		return Actividad_Preferente;
	}
	public void setActividad_Preferente(String actividad_Preferente) {
		this.Actividad_Preferente = actividad_Preferente;
	}
	public String getUsuario_Acceso() {
		return Usuario_Acceso;
	}
	public void setUsuario_Acceso(String usuario_Acceso) {
		Usuario_Acceso = usuario_Acceso;
	}
	public String getTipo_usuario() {
		return Tipo_usuario;
	}
	public void setTipo_usuario(String tipo_usuario) {
		Tipo_usuario = tipo_usuario;
	}
	public String getRepetirContraseña() {
		return repetirContraseña;
	}
	public void setRepetirContraseña(String repetirContraseña) {
		this.repetirContraseña = repetirContraseña;
	}
   
}
