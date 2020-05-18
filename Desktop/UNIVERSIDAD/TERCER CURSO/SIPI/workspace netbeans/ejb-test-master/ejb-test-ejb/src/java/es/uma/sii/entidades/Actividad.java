package es.uma.sii.entidades;

import java.io.Serializable;

import java.lang.Long;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Actividad
 *
 */
@Entity

public class Actividad implements Serializable {

	   
	@Id
	private Long Identificador;
	private String Nombre;
	private String Descripcion;
	private String Lugar;
	private String Estado;
	@Temporal(TemporalType.DATE)
	private Date Fecha_inicio;
	@Temporal(TemporalType.DATE)
	private Date Fecha_fin;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Descripcion == null) ? 0 : Descripcion.hashCode());
		result = prime * result + ((Estado == null) ? 0 : Estado.hashCode());
		result = prime * result + ((Fecha_fin == null) ? 0 : Fecha_fin.hashCode());
		result = prime * result + ((Fecha_inicio == null) ? 0 : Fecha_inicio.hashCode());
		result = prime * result + ((Identificador == null) ? 0 : Identificador.hashCode());
		result = prime * result + ((Lugar == null) ? 0 : Lugar.hashCode());
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		result = prime * result + ((Tipo_Actividad == null) ? 0 : Tipo_Actividad.hashCode());
		result = prime * result + ((admin == null) ? 0 : admin.hashCode());
		result = prime * result + ((inscripciones_actividad == null) ? 0 : inscripciones_actividad.hashCode());
		result = prime * result + ((ong == null) ? 0 : ong.hashCode());
		result = prime * result + ((proyecto == null) ? 0 : proyecto.hashCode());
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
		Actividad other = (Actividad) obj;
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
		if (Fecha_fin == null) {
			if (other.Fecha_fin != null)
				return false;
		} else if (!Fecha_fin.equals(other.Fecha_fin))
			return false;
		if (Fecha_inicio == null) {
			if (other.Fecha_inicio != null)
				return false;
		} else if (!Fecha_inicio.equals(other.Fecha_inicio))
			return false;
		if (Identificador == null) {
			if (other.Identificador != null)
				return false;
		} else if (!Identificador.equals(other.Identificador))
			return false;
		if (Lugar == null) {
			if (other.Lugar != null)
				return false;
		} else if (!Lugar.equals(other.Lugar))
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		if (Tipo_Actividad == null) {
			if (other.Tipo_Actividad != null)
				return false;
		} else if (!Tipo_Actividad.equals(other.Tipo_Actividad))
			return false;
		if (admin == null) {
			if (other.admin != null)
				return false;
		} else if (!admin.equals(other.admin))
			return false;
		if (inscripciones_actividad == null) {
			if (other.inscripciones_actividad != null)
				return false;
		} else if (!inscripciones_actividad.equals(other.inscripciones_actividad))
			return false;
		if (ong == null) {
			if (other.ong != null)
				return false;
		} else if (!ong.equals(other.ong))
			return false;
		if (proyecto == null) {
			if (other.proyecto != null)
				return false;
		} else if (!proyecto.equals(other.proyecto))
			return false;
		return true;
	}
	private String Tipo_Actividad;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="actividad")
	private List<Inscripcion_Actividad>inscripciones_actividad;
	@ManyToOne
	private ONG ong;
	@ManyToOne
	private Administrador admin;
	@ManyToOne
	private Proyecto proyecto;
	
	public Actividad() {
		super();
	}   
	
	
	public Actividad(Long Identificador,String Nombre,String Descripcion,String Lugar,String Estado,Date Fecha_inicio,Date Fecha_fin,String Tipo_Actividad,ONG ong) {
		this.Identificador=Identificador;
		this.Nombre=Nombre;
		this.Descripcion=Descripcion;
		this.Lugar=Lugar;
		this.Estado=Estado;
		this.Fecha_inicio=Fecha_inicio;
		this.Fecha_fin=Fecha_fin;
		this.Tipo_Actividad=Tipo_Actividad;
		this.ong=ong;
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
	public String getDescripcion() {
		return this.Descripcion;
	}

	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}   
	public String getLugar() {
		return this.Lugar;
	}

	public void setLugar(String Lugar) {
		this.Lugar = Lugar;
	}   
	public String getEstado() {
		return this.Estado;
	}

	public void setEstado(String Estado) {
		this.Estado = Estado;
	}   
	public Date getFecha_inicio() {
		return this.Fecha_inicio;
	}

	public void setFecha_inicio(Date Fecha_inicio) {
		this.Fecha_inicio = Fecha_inicio;
	}   
	public Date getFecha_fin() {
		return this.Fecha_fin;
	}

	public void setFecha_fin(Date Fecha_fin) {
		this.Fecha_fin = Fecha_fin;
	}   
	public String getTipo_Actividad() {
		return this.Tipo_Actividad;
	}

	public void setTipo_Actividad(String Tipo_Actividad) {
		this.Tipo_Actividad = Tipo_Actividad;
	}
	public List<Inscripcion_Actividad> getInscripciones_actividad() {
		return inscripciones_actividad;
	}
	public void setInscripciones_actividad(List<Inscripcion_Actividad> inscripciones_actividad) {
		this.inscripciones_actividad = inscripciones_actividad;
	}
   public ONG getONG() {
	   return this.ong;
   }
   public void setONG(ONG ong) {
	   this.ong=ong;
   }
}
