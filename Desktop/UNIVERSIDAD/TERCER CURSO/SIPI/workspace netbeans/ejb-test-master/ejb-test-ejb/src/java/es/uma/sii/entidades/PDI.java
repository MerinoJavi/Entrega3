package es.uma.sii.entidades;

import es.uma.sii.entidades.Usuario;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: PDI
 *
 */
@Entity

public class PDI extends Usuario implements Serializable {

	 public PDI(Usuario u){
            super(u.getUsuario_Acceso(),u.getContraseña(),u.getTipo_usuario(),u.getDNI(), u.getNombre(), u.getApellidos(), u.getEmail(), u.getActividad_Preferente());
        }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((impartenAsignaturas == null) ? 0 : impartenAsignaturas.hashCode());
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
		PDI other = (PDI) obj;
		if (impartenAsignaturas == null) {
			if (other.impartenAsignaturas != null)
				return false;
		} else if (!impartenAsignaturas.equals(other.impartenAsignaturas))
			return false;
		return true;
	}

	private static final long serialVersionUID = 1L;
	@ManyToMany
	@JoinTable(name="PDI_Asignatura",joinColumns=@JoinColumn(name="PDI_fk"),
	inverseJoinColumns=@JoinColumn(name="asignatura_fk"))
	private List<Asignatura>impartenAsignaturas;

	public List<Asignatura> getImpartenAsignaturas() {
		return impartenAsignaturas;
	}

	public void setImpartenAsignaturas(List<Asignatura> impartenAsignaturas) {
		this.impartenAsignaturas = impartenAsignaturas;
	}

	public PDI() {
		super();
	}


   
}
