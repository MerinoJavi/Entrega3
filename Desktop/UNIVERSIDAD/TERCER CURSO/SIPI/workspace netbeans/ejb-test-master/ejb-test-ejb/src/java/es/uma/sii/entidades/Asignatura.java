package es.uma.sii.entidades;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Asignatura
 *
 */
@Entity

public class Asignatura implements Serializable {

	   
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Codigo == null) ? 0 : Codigo.hashCode());
		result = prime * result + ((Departamento == null) ? 0 : Departamento.hashCode());
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		result = prime * result + ((actividades_formacion == null) ? 0 : actividades_formacion.hashCode());
		result = prime * result + ((alumnosInscritos == null) ? 0 : alumnosInscritos.hashCode());
		result = prime * result + ((profesores == null) ? 0 : profesores.hashCode());
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
		Asignatura other = (Asignatura) obj;
		if (Codigo == null) {
			if (other.Codigo != null)
				return false;
		} else if (!Codigo.equals(other.Codigo))
			return false;
		if (Departamento == null) {
			if (other.Departamento != null)
				return false;
		} else if (!Departamento.equals(other.Departamento))
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		if (actividades_formacion == null) {
			if (other.actividades_formacion != null)
				return false;
		} else if (!actividades_formacion.equals(other.actividades_formacion))
			return false;
		if (alumnosInscritos == null) {
			if (other.alumnosInscritos != null)
				return false;
		} else if (!alumnosInscritos.equals(other.alumnosInscritos))
			return false;
		if (profesores == null) {
			if (other.profesores != null)
				return false;
		} else if (!profesores.equals(other.profesores))
			return false;
		return true;
	}
	@Id
	private Long Codigo;
	private String Nombre;
	private String Departamento;
	private static final long serialVersionUID = 1L;
	@ManyToMany(mappedBy="matriculadoEnAsignatura")
	private List<Alumno>alumnosInscritos;
	@ManyToMany(mappedBy="impartenAsignaturas")
	private List<PDI>profesores;
	@OneToMany(mappedBy="asignatura")
	private List<Actividad_Formacion>actividades_formacion;

	public List<PDI> getProfesores() {
		return profesores;
	}
	public void setProfesores(List<PDI> profesores) {
		this.profesores = profesores;
	}
	public List<Alumno> getAlumnosInscritos() {
		return alumnosInscritos;
	}
	public void setAlumnosInscritos(List<Alumno> alumnosInscritos) {
		this.alumnosInscritos = alumnosInscritos;
	}
	public Asignatura() {
		super();
	}   
	public Long getCodigo() {
		return this.Codigo;
	}

	public void setCodigo(Long Codigo) {
		this.Codigo = Codigo;
	}   
	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}   
	public String getDepartamento() {
		return this.Departamento;
	}

	public void setDepartamento(String Departamento) {
		this.Departamento = Departamento;
	}
	public List<Actividad_Formacion> getActividades_formacion() {
		return actividades_formacion;
	}
	public void setActividades_formacion(List<Actividad_Formacion> actividades_formacion) {
		this.actividades_formacion = actividades_formacion;
	}
   
}
