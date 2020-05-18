/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.sii.ejb;

import es.uma.sii.entidades.Administrador;
import es.uma.sii.entidades.Alumno;
import es.uma.sii.entidades.ONG;
import es.uma.sii.entidades.PDI;
import es.uma.sii.entidades.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


/**
 *
 * @author Alejandro
 */
@Stateless
public class BaseDeDatos implements BaseDeDatosLocal {

    @PersistenceContext(unitName = "ejb-test-ejbPU")
    private EntityManager em;
    
  /*  public List<Usuario> getUsuarios2() {
        
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario("javi", "123", "ALUMNO","745151445","Javier","Merino","javiermerino@hotmail.com",Usuario.Preferencias.VOLUNTARIADO));
        usuarios.add(new Usuario("Luis", "SII", "PDI","454156454","Luis","Sanchez","luisan@gmail.com",Usuario.Preferencias.INVESTIGACION));
        usuarios.add(new Usuario("Jose Maria", "nomegustanada", "ADMINISTRADOR","5465456","José María","Luque","chema@hotmail.com",Usuario.Preferencias.NINGUNA));
        usuarios.add(new Usuario("Antonio", "antonio123", "ADMINISTRADOR","2154545","Antonio","Priego","antonio@uma.es",Usuario.Preferencias.NINGUNA));
        usuarios.add(new Usuario("Pepita", "megustalospapeles", "PAS","1456455","Josefa","Garcia","pepi@uma.com",Usuario.Preferencias.VOLUNTARIADO));
        
        return usuarios;
    }*/
    
    public List<Usuario> getUsuarios() {
        Query query = em.createQuery("select a from Usuario a");
        return query.getResultList();
    }
    public void setUsuario(Usuario u){
        if(u.getTipo_usuario().equalsIgnoreCase("administrador")){
            Administrador admin=new Administrador(u);
            em.persist(admin);
        }else if(u.getTipo_usuario().equalsIgnoreCase("alumno")){
            Alumno al=new Alumno(u);
            em.persist(al);
        }else if(u.getTipo_usuario().equalsIgnoreCase("pdi")){
            PDI pdi=new PDI(u);
            em.persist(pdi);
        }else if(u.getTipo_usuario().equalsIgnoreCase("pas")){
            em.persist(u);
        }
        
    }
    public List<ONG>getONG(){
       Query query = em.createQuery("select a from ONG a");
        return query.getResultList();
    }
    public void modificarUsuario(Usuario u){
     em.merge(u);
     
    }  
   public void modificarONG(ONG o){
     em.merge(o);
    
    }  
 
}
