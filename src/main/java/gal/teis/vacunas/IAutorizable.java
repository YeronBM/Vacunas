/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis.vacunas;

/**
 *
 * @author a13yeronbm
 */
public interface IAutorizable {

    /**
     * Método que hace que una vacuna esté autorizada para su uso.
     * El valor devuelto indica si la operación se ha realizado o no.
     * @return 
     */
    boolean autorizar();
    
    /**
     * Hace que una vacuna no esté autorizada para su uso.
     * El valor devuelto indica si la operación se ha realizado o no.
     * @return 
     */
    boolean rechazar();

}
