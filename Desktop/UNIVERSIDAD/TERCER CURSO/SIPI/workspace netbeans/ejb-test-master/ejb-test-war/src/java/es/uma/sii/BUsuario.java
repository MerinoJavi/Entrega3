package es.uma.sii;

import java.util.List;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import es.uma.sii.entidades.Inscripcion_Actividad;
import es.uma.sii.entidades.Usuario.Preferencias;
import es.uma.sii.entidades.Usuario.Rol;

public class BUsuario {
	
	private String nuevo_DNI;
	private String nuevo_Nombre;
	private String nuevo_Usuario_Acceso;
	private String nuevo_Apellidos;
	private String nuevo_Email;
	@Enumerated(EnumType.STRING)
	private Rol nuevo_Tipo_Usuario;
	private String nuevo_Contraseña;
	private String nuevo_Tipo_usuario;
	private String nuevo_repetirContraseña;
	private Preferencias nuevo_Actividad_Preferente;
	private List<Inscripcion_Actividad>nuevo_inscripcion_actividad;
	private static final long serialVersionUID = 1L;
	
	
	
	
}
