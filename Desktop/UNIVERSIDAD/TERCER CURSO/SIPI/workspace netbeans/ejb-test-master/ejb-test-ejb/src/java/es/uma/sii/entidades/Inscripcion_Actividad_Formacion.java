package es.uma.sii.entidades;


import es.uma.sii.entidades.Inscripcion_Actividad;
import java.io.Serializable;
import java.lang.Double;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Inscripcion_Actividad_Formacion
 *
 */
@Entity

public class Inscripcion_Actividad_Formacion extends Inscripcion_Actividad implements Serializable {

	
	private Double Nota;
	private String Comentario_Profesor;
	@ManyToOne
	private Actividad_Formacion actividad_formacion;
	@ManyToOne
	private Alumno alumno;
	
	public Inscripcion_Actividad_Formacion(Long Identificador, String Estado_Inscripcion,int Valoracion_ONG,String Razon_ONG,int Valoracion_Usuario,String Razon_Usuario,int Numero_Horas_Realizadas,Actividad_Formacion actividad_formacion,Double Nota,String Comentario_Profesor, Alumno alumno){
		super(Identificador,Estado_Inscripcion,Valoracion_ONG,Razon_ONG,Valoracion_Usuario,Razon_Usuario, Numero_Horas_Realizadas);
		this.Nota=Nota;
		this.Comentario_Profesor=Comentario_Profesor;
		this.alumno=alumno;
		this.actividad_formacion=actividad_formacion;
	}
	
	public Actividad_Formacion getActividad_formacion() {
		return actividad_formacion;
	}
	public void setActividad_formacion(Actividad_Formacion actividad_formacion) {
		this.actividad_formacion = actividad_formacion;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private static final long serialVersionUID = 1L;

	public Inscripcion_Actividad_Formacion() {
		super();
	}   
	public Double getNota() {
		return this.Nota;
	}

	public void setNota(Double Nota) {
		this.Nota = Nota;
	}   
	public String getComentario_Profesor() {
		return this.Comentario_Profesor;
	}

	public void setComentario_Profesor(String Comentario_Profesor) {
		this.Comentario_Profesor = Comentario_Profesor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Comentario_Profesor == null) ? 0 : Comentario_Profesor.hashCode());
		result = prime * result + ((Nota == null) ? 0 : Nota.hashCode());
		result = prime * result + ((actividad_formacion == null) ? 0 : actividad_formacion.hashCode());
		result = prime * result + ((alumno == null) ? 0 : alumno.hashCode());
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
		Inscripcion_Actividad_Formacion other = (Inscripcion_Actividad_Formacion) obj;
		if (Comentario_Profesor == null) {
			if (other.Comentario_Profesor != null)
				return false;
		} else if (!Comentario_Profesor.equals(other.Comentario_Profesor))
			return false;
		if (Nota == null) {
			if (other.Nota != null)
				return false;
		} else if (!Nota.equals(other.Nota))
			return false;
		if (actividad_formacion == null) {
			if (other.actividad_formacion != null)
				return false;
		} else if (!actividad_formacion.equals(other.actividad_formacion))
			return false;
		if (alumno == null) {
			if (other.alumno != null)
				return false;
		} else if (!alumno.equals(other.alumno))
			return false;
		return true;
	}
   
}
