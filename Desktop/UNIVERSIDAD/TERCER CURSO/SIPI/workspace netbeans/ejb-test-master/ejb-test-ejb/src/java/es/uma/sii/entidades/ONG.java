package es.uma.sii.entidades;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ONG
 *
 */
@Entity

public class ONG implements Serializable {

	   
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Contraseña == null) ? 0 : Contraseña.hashCode());
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((Estado_Registro == null) ? 0 : Estado_Registro.hashCode());
		result = prime * result + Identificador;
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		result = prime * result + ((Persona_Contacto == null) ? 0 : Persona_Contacto.hashCode());
		result = prime * result + Telefono;
		result = prime * result + ((Usuario_Acceso == null) ? 0 : Usuario_Acceso.hashCode());
		result = prime * result + ((actividades == null) ? 0 : actividades.hashCode());
		result = prime * result + ((administrador == null) ? 0 : administrador.hashCode());
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
		ONG other = (ONG) obj;
		if (Contraseña == null) {
			if (other.Contraseña != null)
				return false;
		} else if (!Contraseña.equals(other.Contraseña))
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (Estado_Registro == null) {
			if (other.Estado_Registro != null)
				return false;
		} else if (!Estado_Registro.equals(other.Estado_Registro))
			return false;
		if (Identificador != other.Identificador)
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		if (Persona_Contacto == null) {
			if (other.Persona_Contacto != null)
				return false;
		} else if (!Persona_Contacto.equals(other.Persona_Contacto))
			return false;
		if (Telefono != other.Telefono)
			return false;
		if (Usuario_Acceso == null) {
			if (other.Usuario_Acceso != null)
				return false;
		} else if (!Usuario_Acceso.equals(other.Usuario_Acceso))
			return false;
		if (actividades == null) {
			if (other.actividades != null)
				return false;
		} else if (!actividades.equals(other.actividades))
			return false;
		if (administrador == null) {
			if (other.administrador != null)
				return false;
		} else if (!administrador.equals(other.administrador))
			return false;
		return true;
	}
	@Id
	private int Identificador;
	private String Nombre;
	private String Contraseña;
	private int Telefono;
	private String Persona_Contacto;
	private String Email;
	private String Estado_Registro;
	private String Usuario_Acceso;
	@ManyToOne
	private Administrador administrador;
	public Administrador getAdministrador() {
		return administrador;
	}
	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}
	private static final long serialVersionUID = 1L;
	public int getIdentificador() {
		return Identificador;
	}
	public int getTelefono() {
		return Telefono;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setIdentificador(int identificador) {
		Identificador = identificador;
	}
	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
	@OneToMany(mappedBy="ong")
	private List<Actividad>actividades;

	public ONG(String Usuario_Acceso, String Contraseña,int Identificador, String nombre,int Telefono,String Persona_Contacto,String Email,String Estado_Registro) {
		this.Usuario_Acceso=Usuario_Acceso;
		this.Contraseña=Contraseña;
		this.Identificador=Identificador;
		this.Telefono=Telefono;
		this.Nombre=nombre;
		this.Persona_Contacto=Persona_Contacto;
		this.Email=Email;
		this.Estado_Registro=Estado_Registro;
		
	}
	
	public ONG() {
		super();
	}   
	
	
 
	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}   
	public String getContraseña() {
		return this.Contraseña;
	}

	public void setContraseña(String Contraseña) {
		this.Contraseña = Contraseña;
	}   
 
	public String getPersona_Contacto() {
		return this.Persona_Contacto;
	}

	public void setPersona_Contacto(String Persona_Contacto) {
		this.Persona_Contacto = Persona_Contacto;
	}   
	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}   
	public String getEstado_Registro() {
		return this.Estado_Registro;
	}

	public void setEstado_Registro(String Estado_Registro) {
		this.Estado_Registro = Estado_Registro;
	}
	public List<Actividad> getActividades() {
		return actividades;
	}
	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
	}
	public String getUsuario_Acceso() {
		return Usuario_Acceso;
	}
	public void setUsuario_Acceso(String usuario_Acceso) {
		Usuario_Acceso = usuario_Acceso;
	}
   
}
