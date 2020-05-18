package es.uma.sii.entidades;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Proyecto
 *
 */
@Entity

public class Proyecto implements Serializable {

	   
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Descripcion == null) ? 0 : Descripcion.hashCode());
		result = prime * result + ((Estado == null) ? 0 : Estado.hashCode());
		result = prime * result + ((Identificador == null) ? 0 : Identificador.hashCode());
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		result = prime * result + ((Tipo_Proyecto == null) ? 0 : Tipo_Proyecto.hashCode());
		result = prime * result + ((actividades == null) ? 0 : actividades.hashCode());
		result = prime * result + ((respon_asig == null) ? 0 : respon_asig.hashCode());
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
		Proyecto other = (Proyecto) obj;
		if (Descripcion == null) {
			if (other.Descripcion != null)
				return false;
		} else if (!Descripcion.equals(other.Descripcion))
			return false;
		if (Estado == null) {
			if (other.Estado != null)
				return false;
		} else if (!Estado.equals(other.Estado))
			return false;
		if (Identificador == null) {
			if (other.Identificador != null)
				return false;
		} else if (!Identificador.equals(other.Identificador))
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		if (Tipo_Proyecto == null) {
			if (other.Tipo_Proyecto != null)
				return false;
		} else if (!Tipo_Proyecto.equals(other.Tipo_Proyecto))
			return false;
		if (actividades == null) {
			if (other.actividades != null)
				return false;
		} else if (!actividades.equals(other.actividades))
			return false;
		if (respon_asig == null) {
			if (other.respon_asig != null)
				return false;
		} else if (!respon_asig.equals(other.respon_asig))
			return false;
		return true;
	}
	@Id
	private Long Identificador;
	private String Nombre;
	private String Estado;
	private String Descripcion;
	private String Tipo_Proyecto;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="proyecto")
	private List<Actividad>actividades;
	@ManyToOne
	private Responsable_Asignatura respon_asig;

	public Proyecto() {
		super();
	}   
	
	public Proyecto(Long Identificador,String Nombre,String Estado,String Descripcion,String Tipo_Proyecto,List<Actividad>actividades,Responsable_Asignatura respon_asig) {
		this.Identificador=Identificador;
		this.Nombre=Nombre;
		this.Estado=Estado;
		this.Descripcion=Descripcion;
		this.Tipo_Proyecto=Tipo_Proyecto;
		this.actividades=actividades;
		this.respon_asig=respon_asig;
	}
	
	public Long getIdentificador() {
		return this.Identificador;
	}

	public void setIdentificador(Long Identificador) {
		this.Identificador = Identificador;
	}   
	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}   
	public String getEstado() {
		return this.Estado;
	}

	public void setEstado(String Estado) {
		this.Estado = Estado;
	}   
	public String getDescripcion() {
		return this.Descripcion;
	}

	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}   
	public String getTipo_Proyecto() {
		return this.Tipo_Proyecto;
	}

	public void setTipo_Proyecto(String Tipo_Proyecto) {
		this.Tipo_Proyecto = Tipo_Proyecto;
	}
	public List<Actividad> getActividades() {
		return actividades;
	}
	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
	}
   
}
