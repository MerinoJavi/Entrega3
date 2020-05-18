package es.uma.sii;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import es.uma.sii.entidades.Actividad;
import es.uma.sii.entidades.Actividad_Formacion;
import es.uma.sii.entidades.Alumno;
import es.uma.sii.entidades.Inscripcion_Actividad;
import es.uma.sii.entidades.Inscripcion_Actividad_Formacion;
import es.uma.sii.entidades.ONG;
import es.uma.sii.entidades.Proyecto;
import es.uma.sii.entidades.Responsable_Asignatura;
import es.uma.sii.entidades.Usuario;
import es.uma.sii.entidades.Usuario.Preferencias;
import es.uma.sii.entidades.Usuario.Rol;

@Named
@RequestScoped

public class BActividad {
	private String username;
	private int estado=0;
	private Login lgn;
	private List<Actividad>actividades;
	private List<Usuario>usuarios;
	private Responsable_Asignatura responsable_asignatura;
	private List<Inscripcion_Actividad_Formacion>inscripciones_actividad_formacion;
	private List<Proyecto>proyectos;
	private List<Actividad_Formacion> actividades_formacion;
	private List<Inscripcion_Actividad>inscripciones_actividades;
	private List<ONG>ONGs;
	public BActividad() {
		usuarios = new ArrayList<Usuario>();
       /* usuarios.add(new Usuario("javi", "123", "ALUMNO","745151445","Javier","Merino","javiermerino@hotmail.com",Preferencias.VOLUNTARIADO));
        usuarios.add(new Usuario("Luis", "SII", "PDI","454156454","Luis","Sanchez","luisan@gmail.com",Preferencias.INVESTIGACION));
        usuarios.add(new Usuario("Jose Maria", "nomegustanada", "ADMINISTRADOR","5465456","José María","Luque","chema@hotmail.com",Preferencias.NINGUNA));
        usuarios.add(new Usuario("Antonio", "antonio123", "ADMINISTRADOR","2154545","Antonio","Priego","antonio@uma.es",Preferencias.NINGUNA));
        usuarios.add(new Usuario("Pepita", "megustalospapeles", "PAS","1456455","Josefa","Garcia","pepi@uma.com",Preferencias.VOLUNTARIADO));*/
        
        ONGs=new ArrayList<ONG>();
        ONGs.add(new ONG("ADOPTAUNNIÑO","123",443756437,"Adopta un niño",957651458,"Conchi Cordoba Martinez","adoptaunniño@ong.com","Aceptada"));
        ONGs.add(new ONG("CARITAS","1234",658758343,"Caritas company US",956254632,"Ernesto Sevilla Sanchez","caritas@ong.com","Pendiente de validacion"));

        
        actividades=new ArrayList<Actividad>();
		actividades.add(new Actividad(new Long(454454),"Comedor Social","Ayudar a comer a los demas","Puntacana","Finalizada",new Date(123456L),new Date(12345678L),"Voluntariado",ONGs.get(0)));
		actividades.add(new Actividad(new Long(144114),"Limpiar enfermos","Limpieza de enfermos terminales","Honduras","En curso",new Date(654321L),new Date(87654321L),"Formacion",ONGs.get(1)));
		actividades.add(new Actividad(new Long(545455),"Limpieza de la universidad","Limpieza de la UMA debido a huelga de limpiadoras","Malaga","Pendiente de validacion",new Date(654321L),new Date(87654321L),"Voluntariado",ONGs.get(1)));
		actividades.add(new Actividad(1541545L,"Vacunacion","Vacunar a los hospitalizados","Bali","En proceso de inscripcion",new Date(54454L),new Date(87654321L),"Voluntariado",ONGs.get(0)));
		actividades.add(new Actividad(5488454L,"Clase de lavado de manos","Clase practica de lavado de manos completo como prevencion a las enfermedades","Nueva Guinea Papua","Rechazada",new Date(54454L),new Date(87654321L),"Voluntariado",ONGs.get(1)));

		actividades_formacion=new ArrayList<Actividad_Formacion>();
		actividades_formacion.add(new Actividad_Formacion(545841L,"Comedor Social","Ayudar a comer a los demas","Puntacana","Pendiente de validacion",new Date(123456L),new Date(12345678L),"Voluntariado",ONGs.get(0),new Responsable_Asignatura(usuarios.get(1))));
		actividades_formacion.add(new Actividad_Formacion(484454L,"Regar el cesped","Las plantas son lo primero","Honduras","Terminada",new Date(123456L),new Date(12345678L),"Voluntariado",ONGs.get(1),new Responsable_Asignatura(usuarios.get(1))));

		
        proyectos=new ArrayList<Proyecto>();
        proyectos.add(new Proyecto(545456L,"Proyecto Beta","En curso","Proyecto que agrupa actividades sanitarias","Tipo alpha",actividades,new Responsable_Asignatura(usuarios.get(1))));
		
		
       inscripciones_actividades=new ArrayList<Inscripcion_Actividad>();
        inscripciones_actividades.add(new Inscripcion_Actividad(45488L,"Finalizada",5,"esta bien",2,"no me ha gustado mucho la verdad pero bueno",12,actividades.get(0),usuarios.get(0)));
        inscripciones_actividades.add(new Inscripcion_Actividad(54545L,"En curso",0,"",0,"",12,actividades.get(1),usuarios.get(0)));
        inscripciones_actividades.add(new Inscripcion_Actividad(54545L,"En curso",0,"",0,"",12,actividades.get(1),usuarios.get(1)));
        inscripciones_actividades.add(new Inscripcion_Actividad(77848L,"Pendiente de validacion de ONG",0,"",0,"",12,actividades.get(1),usuarios.get(1)));
        inscripciones_actividades.add(new Inscripcion_Actividad(41544L,"Pendiente de valoracion",0,"",0,"",12,actividades.get(1),usuarios.get(1)));
        inscripciones_actividades.add(new Inscripcion_Actividad(48457L,"Pendiente de valoracion",0,"",0,"",12,actividades.get(3),usuarios.get(0)));

        
        
      /*  inscripciones_actividad_formacion=new ArrayList<Inscripcion_Actividad_Formacion>();
        inscripciones_actividad_formacion.add(new Inscripcion_Actividad_Formacion(45488L,"Finalizada",5,"esta bien",2,"no me ha gustado mucho la verdad pero bueno",12,actividades_formacion.get(0),5.0,"Muy bien",new Alumno("javi", "123", "ALUMNO","745151445","Javier","Merino","javiermerino@hotmail.com",Preferencias.VOLUNTARIADO)));
        inscripciones_actividad_formacion.add(new Inscripcion_Actividad_Formacion(48548L,"Finalizada",5,"esta bien",2,"no me ha gustado mucho la verdad pero bueno",12,actividades_formacion.get(1),5.0,"Muy bien",new Alumno("javi", "123", "ALUMNO","745151445","Javier","Merino","javiermerino@hotmail.com",Preferencias.VOLUNTARIADO)));*/

        
		
	}
	public Responsable_Asignatura getResponsable_asignatura() {
		return responsable_asignatura;
	}
	public void setResponsable_asignatura(Responsable_Asignatura responsable_asignatura) {
		this.responsable_asignatura = responsable_asignatura;
	}
	public List<Proyecto> getProyectos() {
		return proyectos;
	}
	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}
	public List<ONG> getONGs() {
		return ONGs;
	}
	public void setONGs(List<ONG> oNGs) {
		ONGs = oNGs;
	}
	public Login getLgn() {
		return lgn;
	}
	public void setLgn(Login lgn) {
		this.lgn = lgn;
	}
	public List<Actividad> getActividades() {
		return actividades;
	}
	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public List<Inscripcion_Actividad> getInscripciones_actividades() {
		return inscripciones_actividades;
	}
	
	public List<Actividad> obtenerListaActividadPorUsuario(Usuario usuario){
		List<Actividad> actvs=new ArrayList<Actividad>();
		for(Inscripcion_Actividad ins:inscripciones_actividades) {
			if(ins.getUsuario().equals(usuario)) {
				actvs.add(ins.getActividad());
			}
		}
		return actvs;
	}
	
	public void setInscripciones_actividades(List<Inscripcion_Actividad> inscripciones_actividades) {
		this.inscripciones_actividades = inscripciones_actividades;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	public String getUsername() {
		
	
		return username;
	}
	
	public int getEstado() {
		return this.estado;
	}
	
	public void setEstado(int estado) {
		this.estado=estado;
	}
	public int numeroActividades(String username) {
		int cont=0;
		for(Inscripcion_Actividad i:inscripciones_actividades) {
			if(username.equals(i.getUsuario().getUsuario_Acceso())) {
				cont++;
			}
		}
		return cont;
	}
	
	public List<Inscripcion_Actividad> obtenerListaInscripcionPorUsuario(Usuario usuario){
		List<Inscripcion_Actividad> actvs=new ArrayList<Inscripcion_Actividad>();
		for(Inscripcion_Actividad ins:inscripciones_actividades) {
			if(ins.getUsuario().equals(usuario)) {
				actvs.add(ins);
			}
		}
		return actvs;
	}
	
	public List<Actividad> obtenerListaActividadesPorRol(Usuario usuario){
		List<Actividad>actvs=new ArrayList<Actividad>();
		if(usuario.getTipo_usuario().equalsIgnoreCase("PDI")) {
			for(Actividad a:actividades) {
				if(a.getTipo_Actividad()!="Formacion") {
					actvs.add(a);
				}
			}
		}else if(usuario.getTipo_usuario().equalsIgnoreCase("PAS")) {
			for(Actividad a:actividades) {
				if(a.getTipo_Actividad()=="Voluntariado") {
					actvs.add(a);
				}
			}
		}else if(usuario.getTipo_usuario().equalsIgnoreCase("ALUMNO")) {
			for(Actividad a:actividades) {
				if(a.getTipo_Actividad()!="Investigacion") {
					actvs.add(a);
				}
			}
		}
		return actvs;
	}
	
	public int numeroActividadesTotales() {
		int cont=0;
		for(Inscripcion_Actividad i:inscripciones_actividades) {
			cont++;
		}
		return cont;
	}
	
	public List<Actividad> obtenerListaActividadesPorPreferencia(Usuario usuario){
		List<Actividad>actvs=new ArrayList<Actividad>();
		for(Actividad a:actividades) {
			if(usuario.getActividad_Preferente().toString().equalsIgnoreCase(a.getTipo_Actividad())) {
				actvs.add(a);
			}
		}
		return actvs;
	}
	
	public List<Actividad>obtenerActividadRecomendadas(Usuario usuario){
		Random r=new Random();
		int indice=r.nextInt(actividades.size()-1);
		List<Actividad>actvs=new ArrayList<Actividad>();
		actvs.add(actividades.get(indice));
		return actvs;
	}
	
	public List<Actividad_Formacion>obtenerActividadAValidar(Usuario usuario){
		List<Actividad_Formacion>actvs=new ArrayList<Actividad_Formacion>();
		for(Actividad_Formacion a:actividades_formacion) {
			if(a.getEstado().equalsIgnoreCase("Pendiente de validacion") && a.getRespon_asig().getUser().getUsuario_Acceso().equals(usuario.getUsuario_Acceso())) {
				actvs.add(a);
			}
		}
		return actvs;
	}
	
	public List<Inscripcion_Actividad_Formacion>obtenerSolicitudesAlumnos(Usuario usuario){
		List<Inscripcion_Actividad_Formacion>actvs=new ArrayList<Inscripcion_Actividad_Formacion>();
		for(Inscripcion_Actividad_Formacion a:inscripciones_actividad_formacion) {
			if(a.getActividad_formacion().getEstado().equalsIgnoreCase("Pendiente de validacion") && a.getActividad_formacion().getRespon_asig().getUser().getUsuario_Acceso().equals(usuario.getUsuario_Acceso())) {
				actvs.add(a);
			}
		}
		return actvs;
	}
	public List<Inscripcion_Actividad_Formacion>obtenerListaEvaluarAlumnos(Usuario usuario){
		List<Inscripcion_Actividad_Formacion>actvs=new ArrayList<Inscripcion_Actividad_Formacion>();
		for(Inscripcion_Actividad_Formacion a:inscripciones_actividad_formacion) {
			if(a.getActividad_formacion().getEstado().equalsIgnoreCase("Terminada") && a.getActividad_formacion().getRespon_asig().getUser().getUsuario_Acceso().equals(usuario.getUsuario_Acceso())) {
				actvs.add(a);
			}
		}
		return actvs;
	}
	
	public List<Actividad>obtenerSolicitudesActividades(){
		List<Actividad>actvs=new ArrayList<Actividad>();
		for(Actividad a:actividades) {
			if(a.getEstado().equalsIgnoreCase("Pendiente de validacion")) {
				actvs.add(a);
			}
		}
		return actvs;
	}
	
	public List<ONG>obtenerSolicitudesONGS(){
		List<ONG>actvs=new ArrayList<ONG>();
		for(ONG a:ONGs) {
			if(a.getEstado_Registro().equalsIgnoreCase("Pendiente de validacion")) {
				actvs.add(a);
			}
		}
		return actvs;
	}
	
	public List<Usuario>obtenerAdministradores(){
		List<Usuario>actvs=new ArrayList<Usuario>();
		for(Usuario a:usuarios) {
			if(a.getTipo_usuario().equalsIgnoreCase("ADMINISTRADOR")) {
				actvs.add(a);
			}
		}
		return actvs;
	}
	
	public List<Actividad>obtenerActividadesDeONG(ONG ong){
		List<Actividad>actvs=new ArrayList<Actividad>();
		for(Actividad a:actividades) {
			if(a.getONG().getUsuario_Acceso().equals(ong.getUsuario_Acceso())) {
				actvs.add(a);
			}
		}
		return actvs;
	}
	
	public List<Inscripcion_Actividad>obtenerSolicitudesAlumnos(ONG ong){
		List<Inscripcion_Actividad>actvs=new ArrayList<Inscripcion_Actividad>();
		for(Inscripcion_Actividad a: inscripciones_actividades) {
			if(a.getActividad().getONG().getUsuario_Acceso().equalsIgnoreCase(ong.getUsuario_Acceso()) && a.getEstado_Inscripcion().equals("Pendiente de validacion de ONG")) {
				actvs.add(a);
			}
		}
		return actvs;
	}
	
	public List<Inscripcion_Actividad>obtenerInscripcionesActividad(Actividad act){
		List<Inscripcion_Actividad>actvs=new ArrayList<Inscripcion_Actividad>();
		for(Inscripcion_Actividad a: inscripciones_actividades) {
			if(a.getActividad().equals(act)) {
				actvs.add(a);
			}
		}
		return actvs;
	}
	
	public List<Actividad>obtenerActividadesDeONGEnCurso(ONG ong){
		List<Actividad>actvs=new ArrayList<Actividad>();
		for(Actividad a:actividades) {
			if(!a.getEstado().equalsIgnoreCase("Pendiente de validacion") && a.getONG().getUsuario_Acceso().equals(ong.getUsuario_Acceso())) {
				actvs.add(a);
			}
		}
		return actvs;
	}
	public List<Inscripcion_Actividad>obtenerInscripcionesActividadPendientesValorar(ONG ong){
		List<Inscripcion_Actividad>actvs=new ArrayList<Inscripcion_Actividad>();
		for(Inscripcion_Actividad a: inscripciones_actividades) {
			if(a.getActividad().getONG().equals(ong) && a.getEstado_Inscripcion().equals("Pendiente de valoracion")) {
				actvs.add(a);
			}
		}
		return actvs;
	}
}
