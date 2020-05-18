package es.uma.sii.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Responsable_Asignatura
 *
 */
@Entity

public class Responsable_Asignatura extends PDI implements Serializable {

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((actividades_formacion == null) ? 0 : actividades_formacion.hashCode());
		result = prime * result + ((asignatura == null) ? 0 : asignatura.hashCode());
		result = prime * result + ((proyectos == null) ? 0 : proyectos.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Responsable_Asignatura other = (Responsable_Asignatura) obj;
		if (actividades_formacion == null) {
			if (other.actividades_formacion != null)
				return false;
		} else if (!actividades_formacion.equals(other.actividades_formacion))
			return false;
		if (asignatura == null) {
			if (other.asignatura != null)
				return false;
		} else if (!asignatura.equals(other.asignatura))
			return false;
		if (proyectos == null) {
			if (other.proyectos != null)
				return false;
		} else if (!proyectos.equals(other.proyectos))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	private static final long serialVersionUID = 1L;
	private Asignatura asignatura; 
	private Usuario user;
	@OneToMany(mappedBy="respon_asig")
	private List<Actividad_Formacion>actividades_formacion;
	public List<Actividad_Formacion> getActividades_formacion() {
		return actividades_formacion;
	}

	public void setActividades_formacion(List<Actividad_Formacion> actividades_formacion) {
		this.actividades_formacion = actividades_formacion;
	}

	@OneToMany(mappedBy="respon_asig")
	private List<Proyecto>proyectos;
	
	public Responsable_Asignatura(Usuario user) {
		this.user=user;
	}
	
	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public List<Proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Responsable_Asignatura() {
		super();
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
   
}
