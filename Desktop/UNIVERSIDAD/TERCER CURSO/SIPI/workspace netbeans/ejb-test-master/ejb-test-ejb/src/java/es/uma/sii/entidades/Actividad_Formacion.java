package es.uma.sii.entidades;

import es.uma.sii.entidades.Actividad;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Actividad_Formacion
 *
 */
@Entity

public class Actividad_Formacion extends Actividad implements Serializable {

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((asignatura == null) ? 0 : asignatura.hashCode());
		result = prime * result + ((inscripciones_formacion == null) ? 0 : inscripciones_formacion.hashCode());
		result = prime * result + ((respon_asig == null) ? 0 : respon_asig.hashCode());
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
		Actividad_Formacion other = (Actividad_Formacion) obj;
		if (asignatura == null) {
			if (other.asignatura != null)
				return false;
		} else if (!asignatura.equals(other.asignatura))
			return false;
		if (inscripciones_formacion == null) {
			if (other.inscripciones_formacion != null)
				return false;
		} else if (!inscripciones_formacion.equals(other.inscripciones_formacion))
			return false;
		if (respon_asig == null) {
			if (other.respon_asig != null)
				return false;
		} else if (!respon_asig.equals(other.respon_asig))
			return false;
		return true;
	}

	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="actividad_formacion")
	private List<Inscripcion_Actividad_Formacion>inscripciones_formacion;
	@ManyToOne
	private Asignatura asignatura;
	@ManyToOne
	private Responsable_Asignatura respon_asig;
	public Actividad_Formacion() {
		
	}

	public Actividad_Formacion(Long Identificador,String Nombre,String Descripcion,String Lugar,String Estado,Date Fecha_inicio,Date Fecha_fin,String Tipo_Actividad,ONG ong,Responsable_Asignatura respon_asig) {
		super(Identificador,Nombre,Descripcion,Lugar,Estado,Fecha_inicio,Fecha_fin,Tipo_Actividad,ong);
		
		this.respon_asig=respon_asig;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public Responsable_Asignatura getRespon_asig() {
		return respon_asig;
	}

	public void setRespon_asig(Responsable_Asignatura respon_asig) {
		this.respon_asig = respon_asig;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Inscripcion_Actividad_Formacion> getInscripciones_formacion() {
		return inscripciones_formacion;
	}

	public void setInscripciones_formacion(List<Inscripcion_Actividad_Formacion> inscripciones_formacion) {
		this.inscripciones_formacion = inscripciones_formacion;
	}
   
}
