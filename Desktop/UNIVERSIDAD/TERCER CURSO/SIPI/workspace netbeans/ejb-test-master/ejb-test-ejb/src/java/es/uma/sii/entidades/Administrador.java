package es.uma.sii.entidades;

import es.uma.sii.entidades.Usuario;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Administrador
 *
 */
@Entity

public class Administrador extends Usuario implements Serializable {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((ONGS == null) ? 0 : ONGS.hashCode());
		result = prime * result + ((actividades_validadas == null) ? 0 : actividades_validadas.hashCode());
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
		Administrador other = (Administrador) obj;
		if (ONGS == null) {
			if (other.ONGS != null)
				return false;
		} else if (!ONGS.equals(other.ONGS))
			return false;
		if (actividades_validadas == null) {
			if (other.actividades_validadas != null)
				return false;
		} else if (!actividades_validadas.equals(other.actividades_validadas))
			return false;
		return true;
	}

	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="admin")
	private List <Actividad>actividades_validadas;
	@OneToMany(mappedBy="administrador")
	private List<ONG>ONGS;

	public Administrador() {
		super();
	}
        public Administrador(Usuario u){
            super(u.getUsuario_Acceso(),u.getContraseña(),u.getTipo_usuario(),u.getDNI(), u.getNombre(), u.getApellidos(), u.getEmail(), u.getActividad_Preferente());
        }
	public List <Actividad> getActividades_validadas() {
		return actividades_validadas;
	}

	public void setActividades_validadas(List <Actividad> actividades_validadas) {
		this.actividades_validadas = actividades_validadas;
	}

	public List<ONG> getONGS() {
		return ONGS;
	}

	public void setONGS(List<ONG> oNGS) {
		ONGS = oNGS;
	}
   
}
