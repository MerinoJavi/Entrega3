/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.sii.ejb;

import es.uma.sii.entidades.Alumno;
import es.uma.sii.entidades.ONG;
import es.uma.sii.entidades.Usuario;
import java.util.List;
import javax.ejb.Local;



/**
 *
 * @author Alejandro
 */
@Local
public interface BaseDeDatosLocal {

  //  public List<Usuario> getUsuarios2();
    public List<Usuario> getUsuarios();
    public void setUsuario(Usuario u);
    public List<ONG>getONG();
    public void modificarUsuario(Usuario u);
    public void modificarONG(ONG o);
 
            
}
