package es.uma.sii.entidades;

import es.uma.sii.entidades.Usuario;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Alumno
 *
 */
@Entity

public class Alumno extends Usuario implements Serializable {

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((inscripcion_actividad_formacion == null) ? 0 : inscripcion_actividad_formacion.hashCode());
		result = prime * result + ((matriculadoEnAsignatura == null) ? 0 : matriculadoEnAsignatura.hashCode());
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
		Alumno other = (Alumno) obj;
		if (inscripcion_actividad_formacion == null) {
			if (other.inscripcion_actividad_formacion != null)
				return false;
		} else if (!inscripcion_actividad_formacion.equals(other.inscripcion_actividad_formacion))
			return false;
		if (matriculadoEnAsignatura == null) {
			if (other.matriculadoEnAsignatura != null)
				return false;
		} else if (!matriculadoEnAsignatura.equals(other.matriculadoEnAsignatura))
			return false;
		return true;
	}

	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="alumno")
	private List<Inscripcion_Actividad_Formacion>inscripcion_actividad_formacion;
	@ManyToMany
	@JoinTable(name="Alumno_Asignatura",joinColumns=@JoinColumn(name="alumno_fk"),
	inverseJoinColumns=@JoinColumn(name="asignatura_fk"))
	private List<Asignatura>matriculadoEnAsignatura;

	public List<Asignatura> getMatriculadoEnAsignatura() {
		return matriculadoEnAsignatura;
	}

	public void setMatriculadoEnAsignatura(List<Asignatura> matriculadoEnAsignatura) {
		this.matriculadoEnAsignatura = matriculadoEnAsignatura;
	}

	public Alumno() {
		super();
	}

	public Alumno(String Usuario_Acceso, String Contraseña, String rol, String DNI, String Nombre, String Apellidos,
			String Email, String Actividad_Preferente) {
		super(Usuario_Acceso, Contraseña, rol, DNI, Nombre, Apellidos, Email, Actividad_Preferente);
		// TODO Auto-generated constructor stub
	}
         public Alumno(Usuario u){
            super(u.getUsuario_Acceso(),u.getContraseña(),u.getTipo_usuario(),u.getDNI(), u.getNombre(), u.getApellidos(), u.getEmail(), u.getActividad_Preferente());
        }

	public List<Inscripcion_Actividad_Formacion> getInscripcion_actividad_formacion() {
		return inscripcion_actividad_formacion;
	}

	public void setInscripcion_actividad_formacion(List<Inscripcion_Actividad_Formacion> inscripcion_actividad_formacion) {
		this.inscripcion_actividad_formacion = inscripcion_actividad_formacion;
	}
   
}
