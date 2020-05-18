package es.uma.sii.entidades;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Inscripcion_Actividad
 *
 */
@Entity

public class Inscripcion_Actividad implements Serializable {

	   
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Estado_Inscripcion == null) ? 0 : Estado_Inscripcion.hashCode());
		result = prime * result + ((Identificador == null) ? 0 : Identificador.hashCode());
		result = prime * result + ((Numero_Horas_Realizadas == null) ? 0 : Numero_Horas_Realizadas.hashCode());
		result = prime * result + ((Razon_ONG == null) ? 0 : Razon_ONG.hashCode());
		result = prime * result + ((Razon_Usuario == null) ? 0 : Razon_Usuario.hashCode());
		result = prime * result + ((Valoracion_ONG == null) ? 0 : Valoracion_ONG.hashCode());
		result = prime * result + ((Valoracion_Usuario == null) ? 0 : Valoracion_Usuario.hashCode());
		result = prime * result + ((actividad == null) ? 0 : actividad.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		Inscripcion_Actividad other = (Inscripcion_Actividad) obj;
		if (Estado_Inscripcion == null) {
			if (other.Estado_Inscripcion != null)
				return false;
		} else if (!Estado_Inscripcion.equals(other.Estado_Inscripcion))
			return false;
		if (Identificador == null) {
			if (other.Identificador != null)
				return false;
		} else if (!Identificador.equals(other.Identificador))
			return false;
		if (Numero_Horas_Realizadas == null) {
			if (other.Numero_Horas_Realizadas != null)
				return false;
		} else if (!Numero_Horas_Realizadas.equals(other.Numero_Horas_Realizadas))
			return false;
		if (Razon_ONG == null) {
			if (other.Razon_ONG != null)
				return false;
		} else if (!Razon_ONG.equals(other.Razon_ONG))
			return false;
		if (Razon_Usuario == null) {
			if (other.Razon_Usuario != null)
				return false;
		} else if (!Razon_Usuario.equals(other.Razon_Usuario))
			return false;
		if (Valoracion_ONG == null) {
			if (other.Valoracion_ONG != null)
				return false;
		} else if (!Valoracion_ONG.equals(other.Valoracion_ONG))
			return false;
		if (Valoracion_Usuario == null) {
			if (other.Valoracion_Usuario != null)
				return false;
		} else if (!Valoracion_Usuario.equals(other.Valoracion_Usuario))
			return false;
		if (actividad == null) {
			if (other.actividad != null)
				return false;
		} else if (!actividad.equals(other.actividad))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	@Id
	private Long Identificador;
	private String Estado_Inscripcion;
	private Integer Valoracion_ONG;
	private String Razon_ONG;
	private Integer Valoracion_Usuario;
	private String Razon_Usuario;
	private Integer Numero_Horas_Realizadas;
	@ManyToOne
	private Actividad actividad;
	public Actividad getActividad() {
		return actividad;
	}
	
	public Inscripcion_Actividad(Long Identificador, String Estado_Inscripcion,int Valoracion_ONG,String Razon_ONG,int Valoracion_Usuario,String Razon_Usuario,int Numero_Horas_Realizadas,Actividad actividad,Usuario usuario) {
		this.Identificador=Identificador;
		this.Estado_Inscripcion=Estado_Inscripcion;
		this.Valoracion_ONG=Valoracion_ONG;
		this.Razon_ONG=Razon_ONG;
		this.Valoracion_ONG=Valoracion_ONG;
		this.Valoracion_Usuario=Valoracion_Usuario;
		this.Razon_Usuario=Razon_Usuario;
		this.Numero_Horas_Realizadas=Numero_Horas_Realizadas;
		this.actividad=actividad;
		this.usuario=usuario;
	}
	
	public Inscripcion_Actividad(Long Identificador, String Estado_Inscripcion,int Valoracion_ONG,String Razon_ONG,int Valoracion_Usuario,String Razon_Usuario,int Numero_Horas_Realizadas) {
		this.Identificador=Identificador;
		this.Estado_Inscripcion=Estado_Inscripcion;
		this.Valoracion_ONG=Valoracion_ONG;
		this.Razon_ONG=Razon_ONG;
		this.Valoracion_ONG=Valoracion_ONG;
		this.Valoracion_Usuario=Valoracion_Usuario;
		this.Razon_Usuario=Razon_Usuario;
		this.Numero_Horas_Realizadas=Numero_Horas_Realizadas;
	}
	
	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@ManyToOne
	private Usuario usuario;
	private static final long serialVersionUID = 1L;

	public Inscripcion_Actividad() {
		super();
	}   
	public Long getIdentificador() {
		return this.Identificador;
	}

	public void setIdentificador(Long Identificador) {
		this.Identificador = Identificador;
	}   
	public String getEstado_Inscripcion() {
		return this.Estado_Inscripcion;
	}

	public void setEstado_Inscripcion(String Estado_Inscripcion) {
		this.Estado_Inscripcion = Estado_Inscripcion;
	}   
	public Integer getValoracion_ONG() {
		return this.Valoracion_ONG;
	}

	public void setValoracion_ONG(Integer Valoracion_ONG) {
		this.Valoracion_ONG = Valoracion_ONG;
	}   
	public String getRazon_ONG() {
		return this.Razon_ONG;
	}

	public void setRazon_ONG(String Razon_ONG) {
		this.Razon_ONG = Razon_ONG;
	}   
	public Integer getValoracion_Usuario() {
		return this.Valoracion_Usuario;
	}

	public void setValoracion_Usuario(Integer Valoracion_Usuario) {
		this.Valoracion_Usuario = Valoracion_Usuario;
	}   
	public String getRazon_Usuario() {
		return this.Razon_Usuario;
	}

	public void setRazon_Usuario(String Razon_Usuario) {
		this.Razon_Usuario = Razon_Usuario;
	}   
	public Integer getNumero_Horas_Realizadas() {
		return this.Numero_Horas_Realizadas;
	}

	public void setNumero_Horas_Realizadas(Integer Numero_Horas_Realizadas) {
		this.Numero_Horas_Realizadas = Numero_Horas_Realizadas;
	}
   
}
